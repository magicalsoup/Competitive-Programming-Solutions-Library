Imagine the problem in which we simply add all the numbers in the range given rather than adding some and subtracting others. 
This can be solved using a two-dimensional binary indexed tree (also called a Fenwick tree, after its inventor, Peter M. Fenwick). 
Then, both the modify and query operations take log M log N time to execute, which is quite fast enough for that problem. 
If you don't know what a binary indexed tree is or how it works, 
head over to the TopCoder tutorial at [http://www.topcoder.com/tc?module=Static&d1=tutorials&d2=binaryIndexedTrees](http://www.topcoder.com/tc?module=Static&d1=tutorials&d2=binaryIndexedTrees).

For this problem, all we need to do is to maintain two binary indexed trees, one for all of the red squares, 
and one for all of the black squares (where the upper left corner is arbitrarily either red or black). 
When we are given a modify operation, we decide whether the square is red or black, and update the respective tree; when we receive a 
query operation, we carry out the query operation on both trees for that range, and then subtract one from the other 
(depending on the colour of the first square) to obtain the answer.
