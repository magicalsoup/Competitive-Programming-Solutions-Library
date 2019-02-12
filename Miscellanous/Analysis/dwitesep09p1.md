Because the bounds are low, this problem can be solved by simply iterating through each number in the range and checking whether it is 
super, special, and awesome.

More efficient solutions are theoretically possible. In particular, 

there are not very many special numbers—it can be easily shown that the number of special numbers with n digits is 10 choose n—so we can

simply generate all of these recursively, and then determine which of these are also super and awesome. 

This would be the recommended approach if the bounds were increased to 10<sup>9</sup>.
