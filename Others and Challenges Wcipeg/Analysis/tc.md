This problem is most similar to Pinball Ranking from the CCC.

First of all, let's sort the input data in increasing order of Algorithm rating. (We will need to use something like a pair to do this, 
and we also need to keep track of the original positions of each item in the input data, the numerical IDs of the coders - 
my solution uses a 
```cpp
pair<pair<int,int>,int>
``` 
for this purpose.

Now, we break the list of coders up into "chunks". Within each chunk, all coders have the same algorithm rating, 
but may have different TCHS ratings. Note that each chunk will be sorted in increasing order of TCHS rating as well.

Consider each chunk in turn from lower to higher Algorithm rating. Determine for each coder how many of the coders in that chunk he/she is 
better than, or more simply, the number of coders in that chunk who have lower TCHS ratings - this can be done in linear time quite easily.
Also, determine how many of the coders in previous chunks each of the coders in the current chunk. How?

This is the key to solving this problem - when we are considering a particular chunk, the Algorithm ratings of coders in previous chunks 
need not be considered, for we can be certain that they are all lower. Thus, all we have to do is answer the query, how many coders from 
previous chunks have a TCHS rating less than or equal to that of the coder currently being considered?

So after a chunk is considered, we insert all the TCHS ratings from that chunk into a structure such as a binary tree, so we can quickly 
query "how many items here are less than or equal to this one?" Since the test data is randomized, this is not expected to suffer from 
degeneracy problems.

The sort takes O(N log N) time, and each query/insertion takes O(log N) time, with a total of N of each. 
Therefore, the overall time complexity is O(N log N). The "official" solution uses a BIT, which has a smaller constant factor than 
either a binary tree or a segment tree, and is also easier to code - see bbi5291's code for implementation details. 
(Because the ratings are no greater than 100000, coordinate compression is not necessary for the use of a BIT or 
segment tree - binary trees on the other hand dodge that altogether, being purely comparison-based.)

Note:
Strictly speaking, it is not true for binary trees that each insertion takes O(log N) time 
(although it is true for the BIT and segment tree) - instead, insertion takes time logarithmic in the number of items currently contained 
within, or log 1 + log 2 + log 3 + ... + log N. But it's well-known that this is the same number that is the bare minimum of operations 
guaranteed to sort a list of N general items, it's still O(N log N).
