If there are a dupvotes, b upvotes, and c downvotes, then this problem is asking for how many ordered triplets of (a, b, c) 
satisfy the following system of equations:
```
2a + b − c = P
a + b + c = U
and x:y = R1:R2, where x and y could be any two values of a, b, and c.
```

No need to do anything fancy for the first problem. Just brute force all possibilities of upvotes, downvotes, and 
dupvotes and see how many of them add to the net points and satisfy the ratio. Don't be fooled! Although there are three unknowns, 
the solution is not O(N<sup>3</sup>). You only need to brute force a and b. Since U is given, c is already solved as U − a − b. 
Another thing to note is that the statement mentioned that all three values will be positive, so we need not worry about infinite ratios.

Real numbers are icky, and reducing the ratios is just too much work. To check if two ratios x:y and R1:R2 are equal, 
we can simply cross multiply and see if x*R2 equals y*R1.

```cpp
#include <iostream>
using namespace std;

int P, U, R1, R2, ans = 0;

int main() {
  cin >> P >> U >> R1 >> R2;
  for (int a = 1; a <= 1000; a++) {   //dupvotes
    for (int b = 1; b <= 1000; b++) { //upvotes
      if (a + b >= U) continue;
      int c = U - a - b;              //downvotes
      if (a*2 + b - c != P) continue;
      ans += ((R1*a == R2*b) || (R1*b == R2*a) ||
              (R1*a == R2*c) || (R1*c == R2*a) ||
              (R1*b == R2*c) || (R1*c == R2*b));
    }
  }
  cout << ans << endl;
  return 0;
}
```
