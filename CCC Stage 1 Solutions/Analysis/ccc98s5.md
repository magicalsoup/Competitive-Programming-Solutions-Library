This is a shortest-path problem in disguise. The input represents a graph, in which each square is a node, 
two nodes are adjacent in the graph if it is possible to move from one square to the other (that is, if their elevations 
differ by no more than 2), and if they are adjacent, the weight of the edge is 0 if no oxygen is required to move from one to the 
other or 1 if a unit of oxygen is required (because at least one of the two squares is above the starting elevation). 
If there is no path from the source node to the destination node, the trip is impossible; otherwise the weight of the shortest path 
gives the minimum amount of oxygen required to make the trip. We can find the weight of the shortest path by running a BFS from the 
starting square, since every edge has a weight of either 0 or 1; to this end, we use a deque; every time we traverse an edge of weight 1 
we add the next node to the end of the deque, and for edgen of weight 0 we add to the front of the deque. The first time we pop off the 
destination square, we're done. The running time of this solution is O(n<sup>2</sup>), since this bounds the number of edges in the graph. 
Slower solutions are also possible using, e.g., Dijkstra's algorithm.
