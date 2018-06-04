The official CCC test data admits a very simple solution to this problem. We move from the point (0.00,0.00) to (1000.00,0.00) 
in steps of 0.01, and at each point we find the closest sheep using the Euclidean distance formula. We then know that that sheep can be 
eaten. This takes about 100000n operations, where n is the number of sheep. When n=100, this gives about 10 million operations - 
which passes within time.

However, when the point value was increased to 30, the admins decided that the problem wasn't worth 30 points 
if such a simple solution could pass. For this reason, an extra test case was added, with 1000 sheep. 
The simple solution times out on this case, and decreasing the resolution (giving a faster solution) inevitably leads to Wrong Answer.

There is a better solution that is guaranteed to run in O(n2) time. 
If we consider a pair of sheep, and we draw the perpendicular bisector of the line segment connecting them, 
we note that all points to one side of the bisector are closer to one of the sheep, with all points on the other side closer to the other 
sheep.
Now consider sheep S. We iterate through all other sheep. Say we have another sheep T. By finding the x-intercept of the 
perpendicular bisector, we can identify the region of the fence along which S is closer than T. If we consider all possible choices of T, 
we get n-1 different regions. 
When we take the intersection (not union) of all of them, we get a region in which S is closer than any other sheep. 
If this region exists, then sheep S may be eaten. Otherwise (for example if the coyote would have to enter at an x-coordinate both less 
than 20 and greater than 150, which is impossible) S cannot be eaten. There is a special case where ST is vertical: the x-intercept does 
not exist in this case. However, it is easy to handle: if T is above S, then it is disregarded, and if it is below S, then S definitely 
cannot be eaten. For each of the n sheep, there are a total of n-1 other sheep to consider, for a total of n2-n = O(n2) operations.

A final note: this is not the optimal solution. For each sheep S, we may compute the region R surrounding it such that any point in R is 
closer to S than it is to any other sheep, and determine which regions intersect the fence. All these regions are known collectively as 
the Voronoi diagram of the set of points (sheep). The Voronoi diagram may be computed in O(n log n) time. However, 
the algorithm required to do so is extraordinarily complex. Such a solution would not be expected even from IOI competitors.
