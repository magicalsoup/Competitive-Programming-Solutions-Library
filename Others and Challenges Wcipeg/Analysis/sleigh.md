We consider the structure that an optimal tour would exhibit.

If Santa had to visit every site and return to the North Pole, 
he would have to traverse each edge exactly twice (once in each direction). We can't do any better because there is only one path from the 
root to any given vertex, so that whatever path is traversed on the way there must also be traversed on the way back.
On the other hand, a solution traversing each edge exactly twice exists: just use DFS to find it.

Now, we consider some such tour and note that the last leg of the trip — the return from some location to the North Pole — is unnecessary.
That is, we take a full tour returning to the North Pole and remove the last part of it. Now, that last leg always consists of a direct
path from some location back to the North Pole — so in order to maximize the time saved we want to maximize the length of that path. 
Thus, the solution is simple: use DFS to find the location furthest away from the North Pole, and 
subtract the distance to that location from twice the total weight of the tree. 
