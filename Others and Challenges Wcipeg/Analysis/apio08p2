I claim that the following algorithm may be used to solve this problem:

  1.Determine a set of cobblestone roads critical to connectivity. If the number C of such roads is greater than K, there is no solution.
  2.Choose K-C of the remaining, non-critical cobblestone roads such that, when combined with the critical C cobblestone roads, 
    K cobblestone roads are obtained and no cycle is formed.
  3.Choose N-K-1 concrete roads such that, when combined with the K cobblestone roads, a spanning tree is obtained.
  
If any of these steps fail, there is no solution.

Step 1 is accomplished by attempting to build a spanning tree edge-by-edge (using the disjoint-set data structure, as in Kruskal's 
algorithm) using only the concrete roads, and, if these prove insufficient, progressing to the cobblestone roads; the cobblestone roads 
added in this process are labelled "critical". In steps 2 and 3 we again use disjoint sets.
