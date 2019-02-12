For a graph-theory problem, this is deceptively simple-looking. We have to determine whether or not there exists two distinct, 
simple paths from 1 to N. As it turns out, there are so many ways to approach this.

1. Brute Force — O(N!)
Starting at node 1, we perform a depth-first search to generate all the possible paths. 
In the parameter of the function, we can have a set or bitset to keep track of visited nodes which we will not return to. 
In the worst case, the graph is a clique and the algorithm runs in O(N!). 
It is guaranteed that cases worth 5/15 of the points will have N ≤ 10, so this algorithm will pass in time, 
performing about 10! = 3 628 800 operations.

2. Removing Edges — O(N×M)
This approach was discovered by Timothy Li, of Don Mills Collegiate Institute. 
It is similar to the solution to the problem Roadblock from USACO December 2011 and February 2014. 
First, we DFS once to find a single path from 1 to N. If it cannot be found, we're done, and should print "No".
Otherwise, observe that if there is more than one route from 1 to N, there will be at least one edge on that route such that 
if we were to remove it, we would still be able to get from 1 to N. Take the sample input for example, where the two ways to get from 1 
to 6 are 1→2→3→5→6 and 1→2→4→5→6. Say we've found the first path with our first DFS. Removing either edge 2—3 or 3—5 will still leave 1 
reachable from 6. This will always be the case for graphs with multiple distinct paths from 1 to N.

We can try deleting each edge from the path found by the first DFS, one by one. For each deleted edge, we can than check with a 
second DFS to see if we can still find another route. If we do, then we're done, and should output "Yes". 
If we've tried removing every single edge from the original path, and all of the subsequent DFSes could not reach the end, then the 
original path is the only way, and thus we should output "No". Since we never revisit a node, there are at most N nodes (and N−1 edges) 
in the original path. For each of those, we do a DFS, which is O(N+M). On top of the first DFS to find the original path, the total 
running time of the algorithm is O(N×(N+M) + N) = O(N×M).

We know that for cases worth 10/15 of the points, N ≤ 1 000 and M ≤ 10 000. The worst case will be around 
1 000 × (1 000 + 10 000) = 11 000 000 operations, so this will run in time for at least those cases. 
In practice, it is much faster. The worst case occurs when the input graph is a linked list (hence, the answer is "No"), and the 
algorithm tries to remove every single edge on the original path. When the answer is "Yes", the algorithm will likely shortcircuit and 
print the answer before all edges have been trial removed. Remarkably, an efficient implementation scores 13/15 on the real test data.

3. Randomized Edge Removal — O(Trials×(N+M))
In the previous approach, we try to remove all of the edges from the path found by the first DFS. 
If we pick only a randomized subset of the edges from the initial path, we end up with a probabilistic algorithm that may work on even 
larger test data sizes. The number of points that this solution would get is dependent on the implementation.

4. Randomized Adjacency List — O(Trials×(N+M))
This approach was suggested by Jacob Jackson, of University of Toronto Schools. Once again we shall DFS first, and store the path 
we've found from 1 to N. Instead of randomly removing the edges, we can loop through the adjacency list and scramble up the outgoing 
edges from every node so that if we were to DFS again, we just might find a different path. We can repeat this for some number of 
trials for a probabilistic answer.

5a. DFS + Dijkstra's Algorithm — O(M log(N))
This approach was suggested by Frank Liu, of Don Mills Collegiate Institute. First, a path is found using DFS. 
Let's say there are L edges on this path. We assign the weight of 1 to each of these L edges, for a total path length of L. 
We set all other edges not on this path to 0. We run Dijkstra's algorithm. In the end, 
if the distance of the shortest path from 1 to N is still L, that means the original path is the only way to reach the destination. 
Otherwise, that means we have found another path to N. This is because if another path existed, 
there would be at least one edge not on the original path, so the new path would be L minus the number of edges not on the path. 
DFS runs in O(N+M), and Dijkstra's run in O(M log(N)), yielding a total running time of O((N+M)+M log(N)) = O(M log(N)).

5b. Dijkstra Twice — O(M log(N))
Ted Ying from the University of Waterloo came up with the same concept from 5a, except to avoid coding a separate DFS, 
we can use Dijkstra the first time to find the original path.

5c. DFS + Minimal Spanning Tree — O(M log(N))
An alternative approach to Dijkstra's algorithm, suggested by Calvin Liu of Glenforest Secondary School, 
is to find the connected component that contains 1 and N, finding any path using DFS, setting all edges on that path to 
weight 1 and other edges to weight 0, and then use Kruskal or Prim's algorithm to find a minimal spanning tree. On the MST, 
perform a single DFS from 1 to N to find the unique path. If the weights of the path is the same as the length of the path you found 
before, then there can only be one path in the graph from 1 to N.

6. Reversing the Adjacency List — O(N+M)
This is the official solution. In approach 4 above, we randomize the adjacency list to try to find a second distinct path. 
This probabilistic method can also work if we wanted to find three or more distinct paths. However, the problem only requires us to 
find two. Without loss of generality, assume that the outgoing edges for each node are sorted in increasing order in the adjacency list. 
A DFS would then find the lexicographically smallest path (if the path was interpreted as a string of radix N). 
For the sample input, the path found would be 1→2→3→5→6, which is lexicographically smaller than 1→2→4→5→6. 
If the outgoing edges in the adjacency list were sorted in decreasing order, a DFS would find the lexicographically greatest path. 
If there is only one path from 1 to N, then the lexicographically smallest and largest paths would be the same. 
If there are two or more paths, then they would obviously be different.

Notice that we don't actually ever have to sort the outgoing edges. Simply reversing the order of the outgoing edges after the first 
DFS will ensure that the second DFS produces a lexicographically different path, unless of course there is only one path 
(in which case the paths will be equal, and you can print "No"). The two DFS have a total running time of O(N+M) algorithm, 
and also happens to use the smallest memory of all the solutions (having to store only the adjacency list and the two paths). 
Below is the implementation in C++.

```cpp
#include <algorithm>
#include <bitset>
#include <cstdio>
#include <vector>
using namespace std;

const int MAXN = 40000;

int N, M, a, b;
vector<int> adj[MAXN+1];

bool found;
bitset<MAXN+1> visit;
vector<int> *path, path1, path2;

void DFS(int n) {
  if (n == N) {
    found = true;
    return;
  }
  visit[n] = true;
  vector<int>::iterator it = adj[n].begin();
  for (; it != adj[n].end(); it++)
    if (!visit[*it]) {
      path->push_back(*it);
      DFS(*it);
      if (found) return;
      path->pop_back();
    }
}

int main() {
  scanf("%d%d", &N, &M);
  for (int i = 0; i < M; i++) {
    scanf("%d%d", &a, &b);
    adj[a].push_back(b);
    adj[b].push_back(a);
  }

  found = false;
  path = &path1;
  DFS(1);

  if (!found) {
    printf("No\n");
    return 0;
  }
  
  for (int i = 1; i <= N; i++)
    reverse(adj[i].begin(), adj[i].end());
  
  found = false;
  path = &path2;
  visit.reset();
  DFS(1);
  
  printf(path1 == path2 ? "No\n" : "Yes\n");
  return 0;
}
```
7. Biconnected Components - O(N+M)
Let's discuss one last solution. Calvin Liu from Glenforest Secondary School and Daniel Hui from the University of Waterloo both 
came up with this idea. A biconnected component of an undirected graph is a subgraph that has no articulation points, or cut 
vertices. That means if any vertex in a biconnected component is removed, the rest of the subgraph will still remain connected. 
An obvious property of this is that there are at least two distinct paths between any pair of vertices in a biconnected component. 
Suppose we know the biconnected components. There are two paths from 1 to N if and only if DFS can find a path from 1 to N containing 
at least one biconnected component such that:

the component is size 3 or larger, and
the path enters and exits the component at different vertices.
If the first condition is not met, we are not guaranteed to have two paths from the entrance and exit points. 
If the second condition is not met, we will enter a cycle and visit the entrance vertex twice, which is not acceptable. 
The biconnected components can be computed in linear O(N+M) time using DFS. Once we have the components, 
we can then DFS to find whether such a path exists. This solution is more complicated and memory hungry than approach 6, and can be 
difficult to get right in an actual timed contest. Following is the official implementation of this method:

```cpp
#include <cstdio>
#include <stack>
#include <vector>
using namespace std;

int N, M;
vector<int> adj[40001];

int id[40001], low[40001], nextid;
int ncomponents, component[40001];
bool onstack[40001], visit[40001];
stack<int> S;

void DFS(int u, int p) {
  id[u] = low[u] = ++nextid;
  onstack[u] = true;
  S.push(u);
  vector<int>::iterator it = adj[u].begin();
  for (; it != adj[u].end(); it++) {    
    if (!id[*it]) {
      DFS(*it, u);
      low[u] = min(low[u], low[*it]);
    }
    else if (onstack[*it] && *it != p)
      low[u] = min(low[u], id[*it]);
  }
  if (low[u] == id[u]) {
    int n, first = -1, amount = 0;
    ncomponents++;
    do {
      n = S.top();
      S.pop();
      onstack[n] = false;
      if (first == -1) first = n;
      component[n] = ncomponents;
      amount++;
    } while (n != u);
    if (amount == 1) component[first] = 0;
  }
}

bool DFS2(int u, bool pass) {
  visit[u] = true;
  if (u == N) return pass;
  vector<int>::iterator it = adj[u].begin();
  for (; it != adj[u].end(); it++)
    if (!visit[*it])
      if (DFS2(*it, pass || (component[u] &&
            component[u] == component[*it])))
        return true;
  return false;
}

int main() {
  scanf("%d%d", &N, &M);
  int a, b;
  for (int i = 0; i < M; i++) {
    scanf("%d%d", &a, &b);
    adj[a].push_back(b);
    adj[b].push_back(a);
  }
  
  //Tarjan's biconnected components algorithm
  for (int i = 1; i <= N; i++)
    if (!id[i]) DFS(i, -1);
  
  printf(DFS2(1, false) ? "Yes\n" : "No\n");
  return 0;
}
```
