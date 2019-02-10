This is a version of the minimum enclosing disk problem with small input size. Because the input is so small,
a simple O(N<sup>4</sup>) algorithm suffices. The idea is that if you have a circle 
that contains all the points, you can always shrink it until one of the points is on its circumference. 
Then you can continue shrinking it so that that point remains on the circumference, stopping when a second point also 
lies on the circumference. Then you can continue shrinking the circle so that both points remain on the circumference,
until one of two things happens: either the two points are diametrically opposite on the circle, or there is a third point on the 
circumference.

Therefore, the only possible circles that could give minimum enclosing disks of the points given are disks that either pass 
through three points, or pass through two points such that the line segment between them forms a diameter. 
A set of two or three such points uniquely determines a circle. So the algorithm is as follows: generate all possible triples of 
distinct points, and for each triple, find the circumcircle. Also generate all possible pairs of distinct points, and for each pair, 
find the circle whose diameter is the line segment between the pair of points. For each circle generated, check whether it contains all 
points. Then print the diameter of the smallest such circle that contains all points.

In fact, this algorithm can be simplified so that it runs in O(N<sup>3</sup>) time. The idea is that it suffices in general to take the 
largest circle generated (from pairs or triples). This is because, if we have a pair or triple, 
the circle generated from it is the smallest circle that contains the pair or triple. 
Therefore, any smaller circle cannot possible contain the pair or triple entirely, let alone the entire point set. 
So the entire point set's minimum enclosing circle is at least as large as the largest circle generated. But, also, we know that the 
minimum enclosing circle has to be one of the generated circles. These two facts together allow us to deduce that the minimum enclosing
circle's diameter is exactly equal to the largest diameter out of all generated circles. This simplifies the math, too. 
For the circumcircle of a triangle, use Heron's formula and the relation A = abc/(4R), where A is the area and R is the circumradius. 
For details, see bbi5291's submission (ID 10782).

It is also possible to solve this problem in expected linear time using Welzl's algorithm. 
