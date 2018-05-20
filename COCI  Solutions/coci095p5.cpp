c++ version - AC:
#include <bits/stdc++.h>
using namespace std;
const int MAX = 1000001;
int n,k,q;
int nums[MAX};
int mod[MAX];
long long sum[MAX];
int main()
{
    scanf("%d%d",&n,&k);
    for(int x=0;x<k;x++)
        scanf("%d",mod+x);
    sort(mod,mod+k);
    for(int x=0;x<k;x++){
        int curr = mod[x];
        int count =1;
        while(x+1<k&&mod[x+1]==curr){
            count++;
            x++;
        }
        for(int y=1;y<=n;y+=curr)
            nums[y]+=count; 
    }
    for(int y =1;y<=n;y++){ 
        sum[y] = nums[y]+sum[y-1];   
    }
    scanf("%d",&q);
    while(q--){
        int a,b;
        scanf("%d%d",&a,&b);
        b++;
        printf("%lld\n",sum[b]-sum[a]);
    }
    return 0;
}
