#include <cstring>
#include<cstdio>
#include<algorithm>
using namespace std;
#define rep(i,n) for(int i=0;i<n;++i)
typedef long long LL;
const int N = 600005;
int n,R,P,L,ans,pos,a[N],q[N],b[N],c[N][4],C[4],u[N];
int work(int w){
    int L =0;rep(i,n*2){if(L==w*2)q[L++] = P;if(i) q[L++]= a[i];}
    rep(i,n*2)b[i]=q[i]<P?0:q[i]>P?2:1;
    rep(i,R)rep(j,3)c[i][j]=0;rep(j,3)C[j]=0;
    if(P>n){
        rep(i,n*2)if(q[i]>n)++c[i/2][2-b[i]];rep(j,3)C[j]+=c[0][j];rep(i,n)u[i]=3;
        for(int i=n-1;i;--i){
            rep(j,3)C[j]+=c[i][j];
            rep(j,u[i]) if(C[j]){--C[j],++C[u[i]],u[i]=j;break;}
        }
        for(int i=n-1;i;--i)
        rep(j,u[i])if(C[j]){--C[j],++C[u[i]],u[i]=j;break;}
        rep(i,n)if(u[i]==1)return i<=w?i+n:i;
    }
    else{
        rep(i,n*2) if(i) ++c[i/2][b[i]]; int x = b[0],T=0,cnt =5;
        rep(i,R){
            rep(j,3)C[j]+=c[i][j];
            int j=0; while(!C[j])++j;--C[j];
            if(x>j)swap(x,j);++c[i+n][j];
            if(j==1)T=i,--cnt;
        }
        return cnt*n-(R-T);
    }
    
}
void get(int l,int r,int L,int R)
{
    if(l>r)return; if(L==R){R%=n; if (R<=ans) ans = R,pos = r;return;}
    int m = l+r+1>>1, M = work(m);
    if(R/n*n<L){if(L<M)get(l,m-1,L,work(m-1));else get(m,r,M,R);return;}
    get(l,m-1,L,work(m-1)),get(m,r,M,R);
}
int main(){
scanf("%d%d",&n,&R),R = 2*n+(R%n),ans =n;
rep(i,n*2)scanf("%d",a+i),--a[i],P=a[0];
if(!P)return printf("%d\n",n),0;
get(0,n-1,work(0),work(n-1)),printf("%d\n",pos+1);return 0;
}
