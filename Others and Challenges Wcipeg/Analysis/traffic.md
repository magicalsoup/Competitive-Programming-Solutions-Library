It's simple to think of the city as a graph, and to see that you simply want the shortest path between two nodes. 
The presence of the traffic lights doesn't change the fact that you always want to get to an intersection as early as possible, 
making this problem doable using a variation on Dijkstra's shortest path algorithm. This is a Breadth-First-Search algorithm, 
which can be implemented with a priority queue. The traffic lights make it a bit more annoying, but you can determine the state of a 
light at a certain point in time using mod, so it's not too much extra code.
