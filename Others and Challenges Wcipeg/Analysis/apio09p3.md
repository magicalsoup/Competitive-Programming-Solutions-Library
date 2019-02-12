We begin by finding the strongly connected components of the graph given, and constructing the kernel DAG. A node in the kernel DAG is 
assigned a cash value equal to the sum of the cash values of its constituent nodes in the original graph and it is considered to contain a 
pub if at least one of its constituent nodes in the original graph contained a pub. Also, the component containing the city centre from 
the original graph is considered to be the city centre in the kernel DAG. Now, it is fairly clear that the maximum amount of cash Banditji 
can rob in the kernel DAG is the same as the maximum amount of cash he can rob in the original graph, because when Banditji enters a 
strongly connected component, it is always to his advantage to rob all the nodes in that component, and he can then continue on to any 
other component if there exists a node in the first component with an edge to a node in the second one (exactly the criterion for 
adjacency in the kernel DAG). Similarly, the final component Banditji visits must contain a pub, and if it does, it is guaranteed that he 
is allowed to stop there, because of course it will be accessible from any other node in the component.

That's the hard part, finding the SCCs. I recommend Kosaraju's algorithm, since it's the easiest to remember: do a DFS, then do a
second DFS on the complement graph in reverse postorder of vertices from the first one. (For example, if the first DFS yielded the 
postorder 3, 1, 2, then for the second DFS, one would run a DFS from 2, then possibly a DFS from 1, then possibly a DFS from 3; if a 
vertex has already been visited by the time it is reached, it is simply skipped.) Tarjan's algorithm and Gabow's algorithm are also good 
choices, provided you can remember them; all three algorithms run in linear time.

The easy part is solving the problem for the kernel DAG; since the graph now represents a partial order, DP may be used to finish off the 
solution by computing maximum possible cumulative values for nodes in topological order. However, for reasons that I do not entirely 
understand, this last step is very tricky. hansonw1 removes duplicate edgen, which certainly runs in time, but dispenses with the
linear-time bound (since you have to sort in order to find duplicate elements). In my solution, DFS is first run to identify all nodes 
reachable from the city centre, the unreachable nodes are deleted (this really only means that we ignore them later), and the topological
sort and the DP then run simultaneously. (You need to visit every component, but find the maximum from only the set of those which contain
at least one pub.) 
