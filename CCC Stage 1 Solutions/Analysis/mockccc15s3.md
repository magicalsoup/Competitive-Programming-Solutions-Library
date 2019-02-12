In this problem, we must find the number of distinct polygons that can be made using a set of points. 
The fact that N doesn't exceed 10 should immediately suggest to us that the solution has an exponential or 
factorial running time. We’ve made it easier by specifying that no three adjacent vertices in the tachyon trap can lie on the 
same line. Thus, we don't have to worry about the relative orderings of adjacent vertices.

To draw any valid polygon, we can picture the Flash starting at any arbitrary point, visiting the remaining points in some order, 
and returning to the original point. No line segments created in the process should intersect another line segment. 
If we number the points from 1 to N, we can first create a size N + 1 list of the points he will visit in order: {1, 2, 3, …, N−1, N, 1}. 
Then we can permute all the points except the first and last one (as highlighted). In each of these permutations, we check to see if any
line segments created by adjacent points intersect. In the end, we will have obtained all valid ways to trace the polygon in a clockwise
and counter-clockwise manner given a starting point. In other words, each polygon is repeated, so we will have to divide the final 
count by two.

The hardest part of this problem is finding a way to see if two line segments intersect. A clean way is by using the cross product. 
This article explains line segment intersections using cross products well: 

[http://www.geeksforgeeks.org/check-if-two-given-line-segments-intersect/](http://www.geeksforgeeks.org/check-if-two-given-line-segments-intersect/).

Be aware that when calculating the cross product, multiplications will almost certainly go out of bounds. 
We can use a 64-bit integer in the process, or just worry about the sign of the cross product (since that's all that's needed).

The following code takes advantage of C++'s library function ```std::next_permutation``` to generate the permutations of points, 
but you are also free to use recursive backtracking to generate the permutations too. 
Theoretically, the algorithm takes O(N!×N2) time to run. However, if we analyze the running time more precisely, 
we only have to permute at most N−1 = 9 numbers. For each permutation, we only have to check N(N + 1)/2 = 10*11/2 = 55 segments. 
Overall, this is 9!*55 ≈ 20 million steps, which is fast enough to pass in time.

```cpp
#include <algorithm>
#include <iostream>
using namespace std;

typedef pair<int, int> Pt;
#define x first
#define y second

inline int sgn(int x) { return (0 < x) - (x < 0); }

inline int cross(const Pt &A, const Pt &O, const Pt &B) { //sign only
  return sgn((A.x - O.x)*(B.y - O.y) - (A.y - O.y)*(B.x - O.x));
}

bool intersect(const Pt &a, const Pt &b, const Pt &c, const Pt &d) {
  if (a == c || a == d || b == c || c == d) return false; //endpoints
  return cross(a, c, d)*cross(b, c, d) <= 0 &&
         cross(c, a, b)*cross(d, a, b) <= 0;
}

int N, ans, a[15];
Pt P[15];

int main() {
  cin >> N;
  for (int i = 0; i < N; i++) cin >> P[i].x >> P[i].y;
  for (int i = 0; i < N; i++) a[i] = i;
  a[N] = 0;
  do {
    bool ok = true;
    for (int i = 1; ok && i <= N; i++)
      for (int j = i + 1; ok && j <= N; j++)
        if (intersect(P[a[i-1]], P[a[i]], P[a[j-1]], P[a[j]]))
          ok = false;
    if (ok) ans++;
  } while (next_permutation(a + 1, a + N));
  cout << ans / 2 << endl;
  return 0;
}
```
