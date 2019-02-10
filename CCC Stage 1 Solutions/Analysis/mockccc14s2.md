This problem seems straightfoward at first sight, but the edge cases may be tricky to get. 
The bounds are low enough that even an O(N<sup>2</sup>) algorithm would pass, however an O(N) algorithm is not necessarily harder to come up 
with and implement. We keep a pointer which we will use to loop through the array. At every iteration, we increment our pointer while 
values are decreasing, then while values are the same, then while values are increasing. If during this process the pattern does not hold, 
we move on. At the end of the iteration, we check the length that we have incremented the pointer by and compare it with our best answer. 
Moving forward, we skip over all of the values that have been examined. The difficult part is being careful with the indices, as it is 
very easy to make one-off errors.

The following solution is more or less O(N), except, the failed sequence should be skipped over 
(by moving the pointer forward appropriately) before the continue statements. This has been omitted for the sake of clarity.

```cpp
#include <iostream>
using namespace std;

int N, arr[1001];

int main() {
  cin >> N;
  for (int i = 0; i < N; i++) cin >> arr[i];

  int maxlen = 0;
  for (int p = 0; p < N; p++) {
    int i = p + 1;
    while (i < N && arr[i-1] > arr[i]) i++;
    if (--i <= p) continue; //did not decrease

    int k = i + 1;
    while (k < N && arr[k-1] == arr[k]) k++;

    int j = k;
    while (j < N && arr[j-1] < arr[j]) j++;
    if (j == k) continue; //did not increase

    if (j - p > maxlen) maxlen = j - p;
    p = j - 2;
  }
  cout << maxlen << endl;
  return 0;
}
```
