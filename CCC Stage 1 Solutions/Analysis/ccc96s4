The best way to solve this problem is probably to convert the input Roman numerals to internal integers, add them, 
then convert back to Roman numerals. It is inadvisable to try to add Roman numerals directly.

The first step, of course, is to parse the input. This is quite easy in C/C++, because of scanf's matching feature; 
it is also easy in languages which have a split function, such as Python. It has to be done manually in Pascal.

Converting from decimal to Roman numerals is quite easy. We consider one digit at a time. If the last digit is 0, we ignore it.
If it is 1, the Roman numeral ends in "I". If it is 2, it ends in "II", and so on up to 9 (when it ends in "IX"). 
Then we consider the second last digit. If it is 1, the Roman numeral contains "X"; if it is 2, "XX", and so on up to 9 ("XC"). 
We do the same for the hundreds.

Converting the input Roman numerals to decimal is a bit trickier. One possible algorithm is to scan from left to right.
Each time a character is encountered, add its value to a running total, except when the character is "I" before "V" or "X", "X" before "L" 
or "C", or "C" before "D" or "M", in which case we subtract it instead.
