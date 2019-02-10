As the author of this analysis discovered, trying all possible mappings of letter to digit is too slow. T
here are 10! = 3628800 of these — even if you optimized your solution well enough to pass on this judge, 
it would have timed out in 1999. (Of course, since I don't have access to the proctor's instructions booklet from 1999, 
I wouldn't know whether the time limit was actually 30 seconds at the time.) So let's consider a 
recursive solution that prunes early to eliminate impossible mappings as early as possible.

Here is one possible way to solve this problem recursively. Start at the ones' digit of the first addend. 
Currently we have no idea what it is, so we first try letting it equal 0, and recursing, then if no solution is found, letting it equal 1, 
and so on. (Note that the problem statement doesn't guarantee that there is only one solution, so we have to remember to stop after we 
print the first solution found, otherwise it'll be judged as a wrong answer.) When we assign a particular digit to a letter, we place this 
in a lookup table so that if we encounter this letter in the future we'll already know its value. Now we move on to the ones' digit of the 
second addend. If its value is already known (because it's the same letter as the ones' digit of the first addend), then we have nothing 
to do, and we recurse again; otherwise we try all possibilities from 0 to 9 for this letter, except that we cannot assign it a digit that 
has been taken already (by the ones' digit of the first addend). So we need a second lookup table: one that tells us whether a given digit
has already been assigned to a letter. We move on to the ones' digit of the sum. By the time we get here, we already know what this 
digit's value is supposed to be. If the letter is taken already, we check if it's equal to that value; if so, then we just go on to the 
tens' digit of the first addend, and if not, we return because we know the partial assignment we've completed so far is impossible. 
If it's not taken, we just assign it accordingly and recurse. (We need to remember, in each column, whether the one to the right of it 
produced a carry.) So in conclusion, we recursively fill in the digits one by one; at each stage we check for inconsistencies so we can 
abort impossible partial assignments early; and if we get all the way to the end with no inconsistencies, we print out what we have and 
return.

There are a few tricky details: digits at the beginning of numbers are not allowed to be zero; missing digits 
(because not all the words have to be the same length) should be treated as zeroes and skipped; 
after finding one correct solution we should refrain from making any more recursive calls, and so on.
