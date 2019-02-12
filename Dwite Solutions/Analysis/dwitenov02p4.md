This is a dynamic programming problem with a twist.

You should know how to find the best path: use a 2D grid that stores the best way to get to that particular point.

```(The formula is best(row,col) = money(row,col) + max(best(row+1,col), best(row,col-1))```

To extend this to the top 5, the answer is surprisingly simple: instead of storing the best path in best(r,c), 

store the 5 top paths that end at r,c!

The recurrence remains roughly the same, but we have to merge the top 5 from the left and bottom neighbors.

This can be done with a few loops. (See the admin solution for details)

Alternatively, with C++ you can use the STL to simplify things like this:

```cpp
vector<int> v1; //assume stuff in here
vector<int> v2; //assume stuff in here

vector<int> merged = v1;
merged.insert(v2.begin(), v2.end());
sort(merged.begin(), merged.end(), greater<int>);
while (merged.size() > 5)
	merged.pop_back();
```
