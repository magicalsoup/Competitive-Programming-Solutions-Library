Rather than simulating each possible snatch separately, we can go straight to the total number of ships from all snatches. 
We can also find the number of possible snatches easily, so we simply divide these two numbers and we're done.

To find the total, we look at each ship individually, and calculate how many different snatches contain it. 
This number can also be precalculated fairly easily, which makes the total runtime of this solution O(NM) — mostly spent on just the input.

There's actually another solution to this problem, which is ever-so-slightly faster, more complicated, and more interesting. 
It involves doing what the problems asks, simulating the number of ships in each snatch separately. We first generate a 2D array "sum", 
where sum[y][x] stores the number of X's in the rectangle from (1,1) to (y,x). This can be calculated in O(NM), 
with the formula sum[y][x]=sum[y][x-1] + sum[y-1][x] - sum[y-1][x-1] + (1 if the current cell is an 'X'). If you can visualize this, 
you'll see that it's true.

Now, once we have such an array, for every snatch that goes from (y-S,x-S) to (y,x), we can get the number of X's in that square with the 
formula sum[y][x] - sum[y][x-S] - sum[y-S][x] + sum[y-S][x-S] (again, it helps to try to visualize this). Add these all up, 
divide by the number of snatches, and we're done.

Now, the problem with this solution is that it uses up NM memory, which is slightly too big. The most we can afford to use is only around 
2000x1000 of ints. Luckily, this solution can be modified to only use that much memory, though it's really two programs in one - one if 
S>1000, and another one otherwise. In the first case, then we only ever need to remember sums in the range (0..S,0..S), as well as the 
current sum, so that fits in memory. In the other case, we only need to remember sums that are up to S rows before the current location, 
so we always store the last S rows, cycling through so that we overwrite the old ones that we no longer need with new ones.

Though this solution is much more complicated and is just within the memory limit, it can also be more interesting to see this problem 
solved in such a way.
