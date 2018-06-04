This problem can be simply solved by simulation. At each step of the tournament we keep track of how many teams are undefeated, 
how many have one loss, and how many have been eliminated. We create as many pairs of one-loss teams as possible 
(so either they are all paired up, or all are paired but one); half of these still have one loss each, the other half are eliminated. 
We do the same for undefeated teams; half remain undefeated and the other half are placed in the one-loss category. 
There's a special case at the end for when an undefeated team plays a team with one loss. 
Since about half of all teams are eliminated in each round, and the tournament ends when all teams but one have been eliminated, 
this algorithm executes Θ(log t) operations.
