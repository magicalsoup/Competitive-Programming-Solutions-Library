The recommended technique for evaluating infix expressions is the shunting yard algorithm. 

Another possible solution, which perhaps seems more intuitive, is to repeatedly simplify the expression until it has been completely 

evaluated. For example, 1+2*(3+3) would become 1+2*(6), then 1+2*6, then 1+12, and finally 13. In each step, we either find a pair of 

parentheses that encloses only a single number, and delete the parentheses; or we find the highest-precedence operator remaining that has

a numerical operand to either side (rather than a parenthesized expression), and replace it and its two operands by the result of applying

the operator to the operands. Once we are left with only a single number, we are done. This algorithm is inefficient in that it takes 

quadratic time, but is suitable for this problem, in which the input can contain only up to 100 characters.
