This is a graph theory problem, where the foxlings are nodes, and friendships are edges. The problem is simply asking for the number of
connected components in the graph. The only problem is that there can be up to 1,000,000,000, which is too many to store or even iterate 
through. However, only up to 200,000 different foxlings can have any friends, which means that all the others will form connect components 
all by themselves.

The first thing to do is to map each foxling with any friends to a value from 1 to K, where K is the number of such foxlings and can be up 
to 2M. The number of connected components can then be found in this graph in almost linear time with floodfill, and this number can be 
added onto (N-K) to obtain the final answer. Most of the time is spent on looking up the new number of each foxling in the map.

You can also use the disjoint-set data structure for this problem. Initially all vertices are isolated. For each pair of foxlings given, 
first determine if they are already in the map; if not, assign its number to its component number (it was previously isolated). 
Every time two separate trees are merged, decrease the number of components by one. The final answer is thus obtained, the total number of 
components after all friendships have been considered.
