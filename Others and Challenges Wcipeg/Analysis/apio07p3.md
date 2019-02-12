The experienced coder will have seen several problems of this type, and they are all solved in the same way --- dynamic programming with 
bitmasks.

We start by assuming that none of the children wrap around, and then we see how to extend our solution to take care of them. 
We define our DP state as follows: fi,a,b,c,d represents the greatest number of children we can make happy by possibly removing any of the 
animals in enclosures numbered from 1 to i, where a is 1 if enclosure i has had its animal removed, 0 otherwise, and b likewise for i-1, c 
for i-2, and d for i-3. Children whose ranges are not completely contained within [1,i] are not included in the computation of f.

This gives us our solution without too much fuss: a value of fi,a,b,c,d is computed using the values fi-1,b,c,d,e 
(where e is either 0 or 1), taking into account the happiness of children who can see the pens i-4 ... i. The base case is left as an
exercise to the reader.

To take care of the wrap-around, we need to inflate our state slightly: in addition to storing the last 4 bits, we also need to store the 
first 4. That way, once we've gone all the way to the end, we can determine, for each state, how many of the wrap-around children the 
arrangement will satisfy, and update its value accordingly. Reading off the maximum value from the DP table gives the answer. 
