The first observation to make is that we can store all "red" squares in one array, and all "black" squares in another array. 
A position corresponding to a black square in the red array is zero, and vice versa. When we query a rectangle, therefore, 
we can query the sum from both arrays and subtract. Which one we subtract from the other depends on the colour of the upper-left square, 
of course.

So all we need to do is find an efficient way of querying the sum of a rectangle within a two-dimensional array. 
The second observation is this: let f(x1,y1,x2,y2) be the sum of the elements in the box [x1,y1]×[x2,y2]. Then,

```
f(x1,y1,x2,y2) = f(0,0,x2,y2)-f(0,0,x1-1,y2)-f(0,0,y2,y1-1)+f(0,0,x1-1,y1-1)
```

where it is assumed that f returns zero if one or more of its arguments is -1.

Now all we have to do is find a way of computing g(x,y) = f(0,0,x,y) for each (x,y). Note that once we have read in all the input, 
these values never change, unlike in the harder Checkerboard Summation, which is what makes this problem doable using DP instead of a 
somewhat advanced data structure. So our third observation is that

```
g(x,y) = g(x-1,y)+g(x,y-1)-g(x-1,y-1)
```
where, again, the value of g is assumed to be zero when one or more of its arguments are negative. 
(It may be simpler to code these cases in specially.) If we compute the values of g one row at a time, each value depends only upon values 
already computed, completing the DP solution (see bbi5291's submission.) Note the use of long longs to avoid overflow.
