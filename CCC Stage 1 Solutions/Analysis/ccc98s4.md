This problem might seem quite difficult, but it's really not. We start by parenthesizing all products, 
since multiplication is done first. To do this, we scan the given string from left to right. Whenever we encounter an "X" 
(multiplication), we find its left operand, placing an opening parenthesis to its left, and find its right operand, placing a closing 
parenthesis to its right. Then we set our position marker just past the right operand, and continue scanning. (To identify the beginning 
of the left operand, we walk backward from the operator; whenever we encounter a close parenthesis we increment the "depth", 
initially zero, and whenever we encounter an open parenthesis we decrement it; when it becomes zero again we've reached the beginning of 
the left operand. To find the end of the right operand is analogous, except that we walk forward, increment on an open parenthesis, and 
decrement on a close parenthesis.) When we reach the end of the string, all multiplications will have been properly parenthesized. 
Then we just walk through again and do the same with all remaining operations, namely + and -, since these have equal precedence and 
associate left-to-right. This algorithm is slow, but sufficient as the input is small.

It is also possible to solve this problem in linear time using Dijkstra's shunting-yard algorithm. 
This is left as an exercise to the reader.
