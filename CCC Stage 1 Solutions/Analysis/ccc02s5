The first method to solving this problem is quite simple and in the title. Just follow the ball.
Simulating the ball's path is quite simple using the following two formulae:
1.  y = mx + b   	[ y = y-coordinate, m = slope, x = x-coordinate, b = y-intercept ]
2.  m = (y2-y1)/(x2-x1) [ y1,y2 = y-coordinates, x1,x2 = x-coordinate ]
Every time a ball bounces, we can simply change the equation by replacing the slope with its negative. (i.e. m = m*-1)
Once that is done, we can once again solve for the y-intercept of the new line (b) by substituting the previous point.

The new equation can be easily formed by substituting y or x in the co-ordinate form (x,y). 
One of x or y is ALWAYS known because the new point after a bounce is always on a wall and we are given w = width of screen and h = height 
of screen.

By continually applying this procedure and adding to the count every time we hit a wall, we can easily find the number of bounces before 
we enter a pocket. 
If at any time, the new point is < 5 units away from a pocket, we break and output the count.
If at any time, the new point ever hits p or q, we have found a loop in the bounce pattern and we break and output 0.

The second, perhaps more insightful solution would be to once again find the equation of the line, but this time, projecting the line on 
an imaginary graph with axes y = segments of heights of the rectangle and x = segments of widths of the rectangle.

Imagine a cartesian plane comprised of rectangles identical to the one defined by the dimensions given (h x w).
(basically a grid of horizontal lines, each "h" units apart from eachother, and vertical lines, each "w" units apart from eachother)

With this grid, any intersection of a horizontal and vertical line of this grid is a pocket, including 5 units to the right/left/up/down of 
this point (picture a cross with 4 lengths of 5).

Using the two given points we can create the equation of the line as stated in the first solution and project this line along the graph.

Points where bounces occur are where the line created intersects with any vertical and horizontal line of the grid. 
If any of these intersection point has a distance < 5 from a pocket, then it falls in.

If this happens, then to find the # of bounces before ball falls in, we simply count the 
number of widths and heights that divide into this point. 
In order to handle the "impossible" (never enters a pocket) case, we perform the same procedure as in the first solution.

