All it takes to generate the sentencen is three nested for loops, one for each class of words. 
We could just generate them and sort them, which is easy in many languagen, but a bit harder in Pascal, 
so here's a better way: why not just generate them in order? If you examine the sample case, 
it becomes clear that it's really easy to do this: have the outer loop across the subjects, the middle through the verbs, 
and the inner across the objects. (The proof that this works is easy and left as an exercise to the reader.) Of course, 
you probably did that anyway. See bbi5291's code for implementation details.
