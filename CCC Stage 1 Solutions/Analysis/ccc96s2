This problem is not difficult, but it is more difficult than it has to be to achieve its stated purpose! 
There are much easier ways to test for divisibility by 11 (one of which is to add and subtract alternating digits and then check if the 
sum is divisible by 11), but the purpose of this problem is to test your ability to perform arithmetic on large numbers.

We store the number in an array or string. To perform the deletion, we can either simply remove the last character from the string or 
decrement a length variable, depending on implementation. Subtraction is only slightly trickier: we subtract the value of the deleted 
digit from what is now the last digit. If the result is non-negative, we stop there. If it is negative, we add 10 to it and then 
recursively subtract 1 from the previous digit. (Thus, if this is not 0, then we are done, but if it is, it becomes -1 and then 9, and 
we move back one more digit, and so on.) (In practice this would be implemented in C/C++/Pascal using a loop, and not a recursive 
function.) If the first digit is a 1, and we end up going all the way over to the left and decrementing it to 0, we can delete it, 
increment a starting marker, or shift the other digits over to the left, depending on implementation. Since there are only up to 50 digits 
in the input, efficiency is not an issue. See any of the accepted solutions for implementation details. 
(They all differ slightly so pick one!)
