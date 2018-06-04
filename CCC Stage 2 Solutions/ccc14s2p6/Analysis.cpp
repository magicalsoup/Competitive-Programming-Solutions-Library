As a Shortest Path Problem
Seems straightforward enough, right? Walkways are directed edges (compute their traversal times for their weights), and gates are vertices. Additionally, add "walking" edges between gates. Then, we can run Dijkstra's algorithm once for each query to get shortest times. This will work in time O(QG log G). But even O(G log G) isn't going to work when G = 109.

There are two main ways to be cleverer with the graph approach:

Observe that most of the gates are uninteresting. The only thing you'll ever do with most of the gates is to pass it while walking. The exceptions (where turning points may or may not occur) are the endpoints of walkways and queries, of which there are at most 2N + Q ≤ 300000. Call these points "critical", and suppose there are C = O(N) of them. This optimization brings us into the realm of O(C log C) per query. At least it's not a billion!
When queries are dense, we can cache the results of our shortest path computations. This observation lends itself to solutions of wildly varying complexities.
But even with caching, this approach won't get anywhere near O(NQ), a barrier that we'll need to shatter using…

Dark Magic
Disclaimer: Cyril wrote this during the last hour of the competition, based on helpful advice from Dave and Jacob. There is no assurance whatsoever of coherency or correctness.

This problem admits a solution that works in time O(C log C) for all queries. Many thanks and kudos go to Jacob Plachta and David Pritchard for grappling with this beast. The wordings and intuitions here are Dave's, and the astonishingly clean implementation comes from Jacob.

Since no two walkways in the same direction can overlap, we can imagine that there are two "tracks": an increasing one and a decreasing one. The increasing track contains all of the increasing walkways, and the space to walk from the end of each walkway to the beginning of the next, which might be subdivided at critical points. The decreasing track is similar. Idea: except in special cases when switching directions or at the beginning and end, you're always on a track.

Let (s, t) be a query. Assume s < t. (Otherwise, just reverse the configuration, and the proof still works.)

Idea: if you switch directions too many times, you can't have an optimal solution. Let's suppose for now, to simplify the analysis, that s is the beginning point of some walkway, and t is the end point of some walkway. Then:

If you pass an interval twice in the same direction while walking, your path clearly has a cycle, so it can't be optimal.
If you pass an interval twice in the same direction while on a walkway, your path also has a cycle (at the point where you got on the walkway).
Thus, you can't pass an interval more than 3 times, and if you pass an interval twice, you walked by it once, and zoomed by it once. Then (sorry for sketchy diagram):

s ----->                <---- s              s ------------>
    <---                --->                            <---
    ---------> t      <-----                            ------>
                      -----------------> t          t <--------
Impossible case 1     Impossible case 2       Impossible case 3
Case 1: If you switched directions between s and t, then you passed the same interval twice in the forward direction. Along that interval, you walked once and zoomed once. But you could have just zoomed along the forward track.
Case 2: there's an interval you passed 4 times, twice forwards and twice backwards. Thus, you walked past it both forwards and backwards. But this creates a cycle, so this path can't be optimal either.
Case 3: symmetric with Case 2.
This leaves 4 cases:

s -----> t    <--- s            s --------->    <--- s
              -----------> t           t <--    --------------->
                                                          t <---
   Case 1          Case 2          Case 3           Case 4
We need a data structure that can answer 4 types of queries (then we just take the minimum of the four answers):

Cost of the (unique) direct route from s to t.
Cost of the best route that goes from s back to some point a, then to t.
Cost of the best route that starts at s, overshoots to some point b, and goes back to t.
Cost of the best route that goes from s back to some point a, then overshoots to some point b, then goes back to t.
Consider each type of query separately. Each query will require sorted walkways for pre-processing, which we can compute in time O(C log C). This turns out to be the bottleneck, as we can achieve O(log C) time complexity on each type of query.

Precompute prefix sums of forward times. Binary search to find the range of walkways to take. Query time: O(log C) for binary search.
It only makes sense to go back to the last point that's the beginning of a forward walkway, or the end of a backward walkway. Use Case 1 backwards to find the best way to do each. Use Case 1 forwards to compute the time for the rest.
Similarly, it only makes sense to overshoot to the first point that's the beginning of a backward walkway that ends ahead of t, or the end of a forward walkway. Use Case 1 in the same way as above.
Reduces to Case 2 and Case 3.
Finally, to solve the problem for general s and t, we notice that there are only 4 possible first walkways to take: the one immediately to the [left or right] of s going [left or right]. The same is true for the last walkway. We can just run the 4 queries over each of 16 (first walkway, last walkway) pairs.

Floating Point Nightmare
Since we already gave you a Dijkstra problem, we didn't want to give you too many redundant points. So, we added an extra tricky factor: answers can be as low as 10−7, or as high as 109. So, if you did printf("%.5lf\n", ans) with the correct answer, you would fail quite a few cases on account of relative error.

One way to solve this was to display the output to more than 7 + 4 = 11 decimal places. Another was to display the output in scientific notation. Both input formats were accepted by the grade script.
