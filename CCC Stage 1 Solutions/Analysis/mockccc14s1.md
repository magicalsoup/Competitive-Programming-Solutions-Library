Simply reverse the string and find the starting index of the first occurrence of the pattern. Subtract this index from the length of the 
string to get the forward index of the reverse pattern in the text. Make sure to account for 0-based indexing 
(in the implementation below, the 0-based indexing of C++'s string.find() and subtraction just happen to cancel out to a 1-based answer 
without explicitly adding/subtracting 1 anywhere).

```cpp
//Note, this code does not work on wcipeg, please look at the java solution that I did
#include <algorithm>
#include <iostream>
using namespace std;

string T, P;

int main() {
  getline(T, cin);
  getline(P, cin);
  reverse(T.begin(), T.end());
  int index = T.find(P);
  if (index == string::npos) {
    cout << -1 << endl;
  } else {
    cout << T.size() - index << endl;
  }
  return 0;
}
```
