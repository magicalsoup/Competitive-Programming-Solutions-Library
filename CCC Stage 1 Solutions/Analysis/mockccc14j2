We make the observation that the word starts at the last line of input, running in forward order. 
The 2nd last line is the next part, and runs in reverse order. The 3rd last line has characters in forward order, 
and so on. In general, the lines alternate between forward and reverse order, and are to be concatenated from bottom to top. 
We read the input line by line (trimming whitespaces), reversing every other line, and concatenating each processed line to the 
front of our current answer.

```cpp
#include <algorithm>
#include <iostream>
using namespace std;

int N;
string str, ans;

int main() {
  cin >> N;
  for (int i = N; i >= 1; i--) {
    cin >> str;
    if (i % 2 == 0)
      reverse(str.begin(), str.end());
    ans = str + ans;
  }
  cout << ans << endl;
  return 0;
}
```
