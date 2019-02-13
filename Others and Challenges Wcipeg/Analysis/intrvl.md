
This is one of the simplest possible problems solvable using a line sweep algorithm. Such problems are characterized by data which appears 
to be overwhelmingly unprocessable within the time limit until the data is sorted and processed in sorted order, at which point it becomes 
positively easy. Line sweep problems are often useful in problems involving points, vertical/horizontal lines, intervals, or boxes.

So what we do is to sort all the begin- and end-points given in the input from smallest to largest. If we receive any query less than the 
smallest point, the answer is zero. Now process the points in sorted order. Between each pair of adjacent points we have what is called an 
elementary interval in which the answer remains constant. Every time we encounter the start of an interval, we will increment a running 
counter indicating the answer for all locations from the current location up to the next point. (This counter starts at zero.) Similarly, 
every time we encounter the end of an interval, we will decrement this counter. In this way, we will precompute the answers to all 
possible queries, but only using space proportional to the number of regions into which the number line is actually divided by the 
intervals.

This can be a bit difficult to absorb, so consider the following case - you are given intervals [3,9] and [5,12]. 
The elementary intervals are [3,4), [5,9], and (9,12]. Any query to the left of 3 returns 0. Now, we process 3. We increment the counter 
to 1. Hence, from 3 onwards the answer will be 1. We then reach 5. We again increment the counter, now to 2. After this is 9. Seeing that 
it is an endpoint, we decrement the counter to 1. Finally, when we reach 12, we decrement the counter again to 0. Thus we have determined 
that before 3 the answer is 0; [3,5) the answer is 1; on [5,9] the answer is 2; on (9,12] the answer is 1; and after 12 the answer is 0.
These values are stored in an array.

There is one important point: dealing with open and closed intervals can be very confusing. The solution is to make all intervals closed 
on the left and open on the right. This ensures that if a particular coordinate value serves both as the beginning of one or more 
intervals and the end of one or more other intervals, when we get to this value we do not decrement the counter until after we have passed
it, because the actual intervals given in input are closed on the right. So we add 1 to each end value given in the input. 
So our intervals are [3,10) and [5,13), and our elementary intervals are then [3,5), [5,10), and [10,13).

Finally, when we receive a query, we want to be able to locate the elementary interval to which it belongs.
Since these are known in sorted order, we may use binary search to locate them in logarithmic time. 
The total running time of the solution is O((N+Q) log N).
