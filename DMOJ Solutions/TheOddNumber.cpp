#include <bits/stdc++.h>
using namespace std;
int main()
{
   int n, x, y;
   scanf("%d", &n);
   while(n--){
       scanf("%d", &y);
       x ^= y;
   }
   printf("%d\n", x);
   return 0;
}
