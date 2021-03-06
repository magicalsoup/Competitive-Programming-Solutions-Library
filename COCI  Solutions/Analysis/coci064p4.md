Most counting problems are solved by dynamic programming, and this is no exception.

In this case, we have to find a convenient "state" that makes the problem solvable.

Looking at the constraints indicates that a N * C (= 10 million) solution is expected; but how?

The critical observation is that you should start with a blank array and start placing numbers from largest to smallest.

Whenever you add a number, you know that it is greater than ALL future numbers - you can find its impact on the "confusion" instantly.

When you place a number, the confusion factor is increased by the number of blank spots to its left.

The number of blank spots is predictable - we know how many numbers were placed before, so this is easily countable.

If you think about it some more, then each number contributes any number from 0 .. (x-1) to the confusion.

```
For example, if N = 4, then:
4 can add any number from 0 to 3 to the confusion (there are 4 blank spots, and one of them is taken by the 4)
3 can add any number from 0 to 2 to the confusion
.. etc.
```

(provided, of course, that they are placed in descending order)

Now the problem is just a subset-sum problem... right?

Our state can be defined as (current number we're placing, confusion factor we desire).

If we are to model it as a recursive function, it would look like this:

```cpp
int numberOfWays(int current, int confusion)
{
	if (current == N+1)
		return confusion == 0 ? 1 : 0;
	int sum = 0;
	for (int i = 0; i < current; i++)
		if (i ≤ confusion) {
			sum += numberOfWays(current, confusion - i);
			sum %= 1000000007;
		}
	return sum;
}
```

The answer is numberOfWays(1, C).

Notice that here we can mod at each step, since ```(a+b) % c``` is equal to ```(a%c + b%c) % c```.

This way we can just use ints instead of string math.

Of course, you'll need to use memoization to make this feasible, but this is fairly easy.

The problem here, though, is that this is too slow - for each state, you have to loop up to 1000 times.

Roughly speaking, this algorithm takes N<sup>2</sup> * C time - far too slow, even if we halve or quarter the runtime with optimizations.

This is about as far as we can get with recursion; to take out the loop we have to take out the recursion.

It isn't too hard, since the recursive function is simple.

```cpp
int numberOfWays[1011][10001] = {0}; //zero it
numberOfWays[N+1][0] = 1; //base case
for (int i = N; i >= 1; i--) //number we're considering
	for (int j = 0; j <= C; j++) //confusion we want
		for (int k = 0; k < i; k++) //try adding this amount..
			if (k <= j) {
				numberOfWays[i][j] += numberOfWays[i+1][j-k];
				numberOfWays[i][j] %= 1000000007;
			}

cout << numberOfWays[1][C] << endl;
```

This is the same algorithm, with the same runtime.

However, now you might realize an optimization: in the inner loop (from 0 .. i) we're repeating a lot of work!

If i is 10, and C is 100, take a look at what we might be doing:

```
...
when j is 50: add up numberOfWays[i+1][50..41]
when j is 51: add up numberOfWays[i+1][51..42]
when j is 52: add up numberOfWays[i+1][52..43]
...
```

50..41, 51..42, and 52..43 share a signifcant overlap that we can exploit.
When we add 51..42, instead of looping again, we can just take [50..41], subtract [41] and add [51]!
Now, we don't have to loop anymore.

The final, working algorithm:
```cpp
int numberOfWays[1011][10011] = {0}; //zero it
numberOfWays[N+1][0] = 1; //base case
for (int i = N; i >= 1; i--) //number we're considering
	for (int j = 0; j <= C; j++) //confusion we want
	{
		//use overlap to our advantage
		if (j > 0)
			numberOfWays[i][j] = numberOfWays[i][j-1];
		//cut off one
		if (j-i >= 0)
			numberOfWays[i][j] -= numberOfWays[i+1][j-i];
		//add one
		numberOfWays[i][j] += numberOfWays[i+1][j];
		
		numberOfWays[i][j] %= 1000000007;
		//note that the subtraction may cause the number to be negative
		//(but we know it's supposed to be positive, so fix it)
		if (numberOfWays[i][j] < 0)
			numberOfWays[i][j] += 1000000007;
	}

cout << numberOfWays[1][C] << endl;
```
Note that it is possible to reduce the memory usage to 2*C; try to figure it out yourself.

(This is a useful technique, but the CCC will not require such tricks)
