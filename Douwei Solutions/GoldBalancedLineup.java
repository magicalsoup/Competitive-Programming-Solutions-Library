#include <stdio.h>
#include <string.h>
 
int h[1000000],hsize,lis[100001][30],n,k;
 
int findid(int v[30]){
    int i,p,can,i1;
    for(p=0,i=0;i<k;i++)
        p=((p<<2)+(v[i]>>4))^(v[i]<<10);
    p=p%hsize;
    if(p<0)  p+=hsize;
    for(can=0;(!can)&&(h[p]!=-1);p++)
        for(i1=h[p],can=1,i=0;(can)&&(i<k);i++)
            can=(v[i]==lis[i1][i]);
    if(can) p--;
    return p;
}
 
main(){
    int i,i1,j,ans,p,same,tem,shif,a;
    hsize=997001;
    for(i=0;i<1000000;i++)   h[i]=-1;
    for(scanf("%d%d",&n,&k),k--,i=0;i<k;lis[0][i]=0,i++);
    h[findid(lis[0])]=0;
    for(ans=0,i=1,i1=0;i<=n;i++,i1++){
        scanf("%d",&a);
        for(shif=a%2,a=(a>>1),j=0;j<k;j++,a=(a>>1))
            lis[i][j]=lis[i1][j]+(a%2)-shif;
        p=findid(lis[i]);
        if(h[p]==-1)    h[p]=i;
        if((tem=i-h[p])>ans) ans=tem;
    }
    printf("%d\n",ans);
    return 0;
}
