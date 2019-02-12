This was the hardest problem on the 2008 CCC, and the only one that none of the contestants could solve fully. 
If you are reading this (and not an admin or a hacker), congratulations.

Before examining sophisticated solutions, consider some simple solutions. We assume the necessary background in basic mathematics of 
computational geometry.
25% solution
It is stated that the landing pad must touch at least three trees on its circumference. 
Therefore, every possible landing pad must touch some triplet of trees. Given three points corresponding to these trees, 
the circumcenter may be easily found, and hence the center and the radius of the circle that touches these three trees determined. 
Then, iterating through all remaining points, checking whether or not any lie within the circle, will determine whether or not this is a 
valid landing pad. The valid landing pad with largest radius gives the solution.

As a set of N items has N nCr 3 = N(N-1)(N-2)/6 = O(N3) triplets, and we perform O(N) work for each of these 
(since checking if a point is in a circle may be done in constant time), the asymptotic time complexity of this algorithm is O(N<sup>4</sup>).

When N = 50, N<sup>4</sup> is about 6 million, which should pass within one second. Thus, this solution should receive 25% of the points.

95% solution, supposedly
It is stated that in 95% of test data there are no more than 1000 trees, although on this judge this earns only 81% of the points.
With N=1000, Õ(N<sup>2</sup>) is likely to pass. Here is one possible solution with this runtime complexity. First, there are simple bounds on the 
answer R: 0 < R < 109. (Because the landing pad may touch three trees on the edge of the field and thus have a distant center,
we cannot use the bounds on the coordinates to obtain a better bound for R.) We want R to be known with a relative accuracy of 10-4, 
so about log<sub>2</sub> 1013 iterations of binary search should suffice: about 43. (This seems like an awfully large number, but the constant factor 
on this solution is relatively small.)
Given some radius r, how do we determine whether or not a landing pad with radius ≥ r exists? First of all, this is equivalent to 
finding a circle with radius r which contains no trees in its interior. This is because it is possible to expand it until it touches 
exactly three trees.

Second, we may assume that such a circle touches at least one tree (this is pretty obvious). Let us then iterate through all possible 
trees (O(N) iterations each time). The current tree/point will be denoted P. Consider now all possible circles with radius r with P on 
the circumference. Let the center of such a circle be C. Then, all possible locations for C themselves lie on a circle with radius r 
centered on P.
Now, denote by θ the counterclockwise angle from the positive x-axis to the vector C-P. As θ increases from 0 to 2π, the circle passes 
through all points other than P either zero or two times, according to distance from P: if this is greater than 2r, 
the circle will not pass through it; if it is exactly 2r, then there is one θ for which the circle has the point on its circumference, 
but we may call this zero times since the point never ends up in the circle's interior 
(also, we are using floating point numbers with an approximate answer desired anyway, so we may ignore this case); if it is less than 2r, 
the circle will pass through it twice.
(Determining the corresponding values of θ is left as an exercise to the reader - 
the explicit formula/algorithm should also furnish a proof for this statement.) 
Values of θ for which the circle passes through one of the points will be denoted interesting. 
These values may be sorted (this will take O(N log N) time per invocation), then we can use a sweep algorithm, which takes linear time: 
between an adjacent pair of interesting values, the number of points in the interior of the circle stays constant, 
and if at any time we find this to be zero, then the value of r is validated for the purposes of our binary search.
Now for runtime analysis: ignoring the factor of log 1/ε for the number of tests, each test consists of O(N) sub-tests 
(as P covers every tree), each of which is dominated by the O(N log N) sort. So in total we have O(N<sup>2</sup> log N).

100% solution
In the 25% solution, we considered all triplets of points, testing each in linear time. However, we can do much better by generating a 
list of valid triplets (ones whose circumcircles contain no points in their interiors.)
This is actually a well-known problem - finding the Delaunay triangulation of the points. 
This is a triangulation of the input set such that the circumcircle of every triangle is empty. 
This can be done in O(N log N) time using a variety of complicated algorithms. 
The algorithms of choice include divide-and-conquer 
(sorting the points by one coordinate then dividing in half, with a complicated linear-time merge) and Fortune's algorithm 
(sweepline). In the random case, the Delaunay triangulation contains about 2N triangles. We then find the maximum circumradius among 
the triangles in the Delaunay triangulation, and that is our answer. The runtime is dominated by the algorithm used to construct the 
Delaunay triangulation, so it is O(N log N). See admin's solution for one implementation of this (it uses the simpler 
"incremental method").
