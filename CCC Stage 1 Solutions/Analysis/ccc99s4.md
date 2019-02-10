This problem isn't too bad. We just do a BFS from the knight's position to find the fastest way it can move to another position. 
We keep this shortest path grid because it's faster than calculating the shortest path each time, and also less complicated.

When we want to know whether the knight wins, ties, or loses, we just look in the path of the pawn. First we check all spots for winning, 
then stalemating, then losing. The problem is not so clear about staying in one spot 
(the knight must move to another position on each turn), but we realize that if a knight arrives too early, 
then it can jump back and forth until the pawn arrives. Even so, the times it can arrive at a square is the best time plus a multiple of 2.
This detail is the last part that we need to take care of, and the rest is trivial.

Every time the knight moves, it moves from a black square to a white square or from a white square to a black square. 
Thus, if a knight can travel from square A to square B in n moves, it cannot possibly take a number of moves with a different parity 
than n and still go from A to B, because then it would end up on a square with opposite colour to B. This is the justification 
for the above statement that the knight has to take a number of moves equal to the smallest possible plus a multiple of 2.
