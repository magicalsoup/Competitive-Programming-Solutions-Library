Given a list of N values, we just want to count the number of distinct values in the list. 
One way to do this is to just throw numbers into an ```std::set``` as they are inputted, and then just output the size of the set at the end. 
Another way is to note that the input values do not exceed 1000, so we just keep an array marking whether a value has been input, 
and in the end just looping the array and counting. The second solution is implemented below.

```cpp
#include <iostream>
using namespace std;

int N, x, ans = 0;
bool a[1005] = {0};

int main() {
  cin >> N;
  for (int i = 0; i < N; i++) {
    cin >> x;
    a[x] = 1;
  }
  for (int i = 1; i <= 1000; i++) {
    if (a[i]) ans++;
  }
  cout << ans << endl;
  return 0;
}
```
