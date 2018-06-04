
Ok, first of all, for this problem, you should convert the strings to an array of integers as you are reading it in. You should just keep 
track of which numbers are negative, then ignoring the negatives make the larger number n1 and the smaller number n2. For example, reading 
in the numbers 8 and -10 would make n1 10 and n2 8.

Now, I am sure that addition is pretty obvious. Align the numbers by the ones digit, and then add them. Then add the current digit div 10 
to the next digit to the left and mod the current digit by 10. Then add the next digit, moving left, as with addition on paper with the 
same method and so on and so on.

Now for negatives. If both numbers are negative, then add them as above, and then add a negative sign in front as you output. To subtract, 
again, align the numbers by the ones column subtract the ones digit of n2 from n1. Now if this digit is negative, then subtract the next 
digit to the left by one and add 10 to the current digit, just like carrying over in regular subtraction, again moving left, just like on 
paper, and so on and so on.

Now if n1 was positive, then after you subtract n2, just output your total, but if n1 was negative to begin with, the do the subtraction, 
then output a negative sign before outputting the total number. And then you are done.
