There are several ways to solve this problem.

1. Using binary search and DFS. A single pass of DFS will execute in O(E+V) time. 
DFS can be used to determine which nodes are reachable from city 1 - specifically, 
if all destination cities are reachable. Now, clearly if we can drive a heavy truck to every destination city, 
we can drive a lighter truck to every destination city also. This makes it possible to use binary search to determine the 
heaviest possible truck that we can drive through every destination city. When testing a particular truck, we use only the bridges with 
sufficiently high weight capacities for that truck. The time complexity is O((E+V) log W), where W is the maximum weight of a truck.

2. (due to Jacob Plachta) By using Prim's algorithm, where the capacity of an edge is taken to be its weight. 
A tree is a graph in which there exists exactly one path between every pair of vertices; a spanning tree of a graph G is a subgraph which 
is also a tree that contains all of G's vertices. What is desired is almost a spanning tree (it doesn't have to have all the vertices, 
but just city 1 and all destinations) whose shortest (lowest capacity) edge is as long as possible. 
This can be computed using Prim's algorithm, which greedily selects the highest-capacity edge possible at each stage and 
requires O((E+V) log V) time.
We stop once we have reached city 1 and all destinations because we know that at any point in time we have a tree.

3. (due to Hanson Wang) Similiar to #2, but using Kruskal's algorithm. This is tricker than with Prim's algorithm because we are not 
guaranteed to have a tree at any given time and it is not immediately obvious in the standard algorithm when to stop. However, 
if each component includes a count of how many destination cities are contained within (where city 1 counts as a destination city)
we can stop once the count in a component reaches the total number of destination cities. 
This can be made to run in essentially O(E) time, although a typical implementation is O(E log E).

4. Using Dijkstra's algorithm. Although Dijkstra's algorithm ordinarily computes shortest paths, it can be modified to find paths in which 
the minimum-weight edge has the maximum possible weight, simply by using the min function instead of adding when pushing new edges on to 
the priority queue. We use city 1 as the source and stop after we have reached every destination city. The time complexity is the same as 
that of Prim's: O((E+V) log V)
