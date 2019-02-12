The objective is to construct a minimum spanning tree that uses as few dangerous links as possible. 

This can be done with any standard minimum spanning tree algorithm, such as Kruskal's algorithm or Prim's algorithm, as long as we 

consider every dangerous edge to be more expensive than every non-dangerous edge. The simplest way to do this is to consider danger to add 

a large constant (say, 10<sup>6</sup>) to the cost of an edge, then run the MST algorithm as you would otherwise
