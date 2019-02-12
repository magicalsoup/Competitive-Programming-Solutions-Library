A naive solution is to create a 5000 by 5000 array and, for each icing, iterate through all the positions in the cake it covers, 
incrementing the corresponding positions in the array. This is far too slow, because each icing may cover up to 50002 positions and 
there may be up to 105 icings, so there may be up to 2.5 trillion operations executed in the first part alone.

Another solution would be to store all the icings in an array, and for each query, determine the overlap area between that query and 
each icing, adding these to obtain that query's answer. Each pair's overlap can be computed in constant time, so the bulk of the time 
will be spent iterating over the queries and icings, of which there are roughly (10<sup>5</sup>)<sup>2</sup> pairs (10 billion). This is an improvement, 
but it is still not fast enough to pass the largest test case.

In the model solution, we will compute the amount of icing that ends up on each square centimetre of the cake — but we shall do so more 
efficiently using a difference array. This technique was used by many to solve the problem Wireless in the 2009 CCC. Upon reading in 
each icing, we do not immediately iterate to determine its effect on each square in the grid. Instead, we may try iterating through 
each row of the grid, and adding a 1 to the left edge of the icing and a -1 to the right edge. Then, after all the icings have been 
processed, scan from left to right across each array, adding up all the differences to obtain the actual value in each square. 
Because each icing can cover up to 5000 rows, this can take up to 500 million operations — perhaps just a bit too slow to pass the 
largest test case, or perhaps just fast enough, as the grader runs on a very fast machine.

We can do even better. Notice that along the left edge of the icing we are adding +1 to every square and along the right edge we are 
adding -1 to every square. If we now take differences along the colums going from bottom to top, we get a +1 at the lower-left and 
upper-right corners, a -1 at the upper-left and lower-right corners, and 0 everywhere else. So we only need to touch four entries 
(i.e., a constant number) for each icing. But after reading all the icings, we need to "integrate" twice; once going up along each 
column to convert the column differences into row differences, and then once going right along each row to reconstitute the actual 
array indicating how much icing is on each square.

Now how do we answer the queries? The trick, as it is, is to compute a prefix sum array, although the name is a bit misleading in two 
dimensions. What we actually wish to do is determine, for each square in the grid, the sum of all icing depths in the box with this 
square as the upper-right corner and the lowest, leftmost square as the lower-left corner. This can be done in constant time per entry 
using inclusion and exclusion. Although it is not obvious, the process we use to convert the "actual" array to the prefix array is the 
same as the process used to convert the difference array to the "actual" array. In other words, starting with the difference array, 
"integrate" twice along each dimension to obtain the prefix sum array. Then, to answer actual queries, we notice that we can again use 
inclusion and exclusion on the prefix sum array; any box in the cake can be represented by adding and subtracting boxes that have their 
lower-right corners at the origin (boxes whose sums we have already computed).

## Implementation
Code by Brian Bi:

```cpp
#include <cstdio>
int main()
{
    int X,Y,K,i,j,Q,acc,x1,y1,x2,y2;
    static int diff[5001][5001]={0};
    static int a[5001][5001]={0};
    static long long pre[5001][5001]={0};
    scanf("%d %d %d",&X,&Y,&K);
    for (i=0; i<K; i++)
    {
        scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
        diff[x1-1][y1-1]++;
        diff[x1-1][y2]--;
        diff[x2][y1-1]--;
        diff[x2][y2]++;
    }
    for (i=1; i<=X; i++)
        for (j=1; j<=Y; j++)
            a[i][j]=a[i-1][j]+a[i][j-1]-a[i-1][j-1]+diff[i-1][j-1];
    for (i=1; i<=X; i++)
        for (j=1; j<=Y; j++)
            pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+a[i][j];
    scanf("%d",&Q);
    for (i=0; i<Q; i++)
    {
        scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
        printf("%lld\n",pre[x2][y2]-pre[x2][y1-1]-pre[x1-1][y2]+pre[x1-1][y1-1]);
    }
    return 0;
}

```
## Complexity
It is obvious from reading the code above that the complexity of this solution is O(MN+K+Q).
