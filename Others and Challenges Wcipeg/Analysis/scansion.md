
This problem has a dynamic substructure, hence, recursion with memoization or dynamic programming are suitable. 
Keep a table dp[] where dp[i] contains the answer for the prefix of the given string consisting of the first i characters. 
Then it is clear that for a given prefix that ends with one of the named feet, we may obtain it by adding that foot to any of the 
possibilities for that prefix minus that foot. Our algorithm is thus: dp[0] = 1 (there is exactly one way to decompose nothing to feet, 
and that is by decomposing it into no feet at all), and dp[i] is obtained by considering the last two, three, and four characters of the 
prefix of length i.

For example, in the sample test case, 001001, the value of dp[6] is the number of ways of making the whole string. You can obtain unique 
decompositions by adding an iamb (01) to the end of 0010; an anapest (001) to the end of 001; or adding a choriamb (1001) to the end of 00.

This algorithm runs in O(N) time (where N is the length of the input string.)
