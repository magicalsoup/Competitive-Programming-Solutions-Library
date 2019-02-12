This problem is slightly misleading. It asks to find the total number of zeros in the factorial of a number, 

and should not be confused with the classic problem of finding only the trailing zeroes in a factorial. 

There is probably no "clever" solution. Thus, this problem is simply an exercise in bignums, or arbitrary precision arithmetic. 

We must use long multiplication to directly compute the factorial of the number, then loop to count the number of zeros.

Since the input is limited to 100 (whose factorial contains 158 digits), the grade school multiplication algorithm (O(N<sup>2</sup>) on

the number of digits) should run in time. On the real ACSL contest, if you have access to a language like Java or Python, you would 

use the built-in support for bignums. Since the judge limits you to languages without bignums, you may also precompute the factorials

for all the numbers up to 100, and hardcode the number of zeros. However, that could be more bothersome than just coding the long 

multiplication in a few dozen lines
