#include <iostream>
#include <bits/stdc++.h>
using namespace std;
 
const int N=100005;
long long int lazy[4*N];
long long int seg[4*N];
 
void build(int low,int high,int node)
{
    if(low>high)
    return;
    if(low == high)
    {
        seg[node]=0;
        return;
    }
    int mid = low+high>>1;
    build(low,mid,2*node+1);
    build(mid+1,high,2*node+2);
    seg[node]=seg[2*node+1]+seg[2*node+2];
}
 
void update(int low,int high,int lq,int hq,int node,long long int val)
{
    if(lazy[node])
    {
        seg[node]+=(high-low+1)*lazy[node];
        if(high!=low)
        {
            lazy[2*node+1]+=lazy[node];
            lazy[2*node+2]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(low>hq || high<lq)
    return;
    if(lq<=low && high<=hq)
    {
        seg[node]+=(high-low+1)*val;
        if(high!=low)
        {
            lazy[2*node+1]+=val;
            lazy[2*node+2]+=val;
        }
        return;
    }
    int mid=low+high>>1;
    update(low,mid,lq,hq,2*node+1,val);
    update(mid+1,high,lq,hq,2*node+2,val);
    seg[node]=seg[2*node+1]+seg[2*node+2];
}
 
long long int query(int low,int high,int lq,int hq,int node)
{
    if(lazy[node])
    {
        seg[node]+=(high-low+1)*lazy[node];
        if(high!=low)
        {
            lazy[2*node+1]+=lazy[node];
            lazy[2*node+2]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(low>hq || high<lq)
    return 0;
    if(lq<=low && high<=hq)
    {
        return seg[node];
    }
    int mid=low+high>>1;
   return query(low,mid,lq,hq,2*node+1)+query(mid+1,high,lq,hq,2*node+2);
}
int main(){
    int t;
    scanf("%d",&t);
    int n,q;
    while(t--)
    {
        memset(seg,0,sizeof(seg));
        memset(lazy,0,sizeof(lazy));
        scanf("%d %d",&n,&q);
        int type;
        int x,y;
        long long int val;
        build(0,n-1,0);
        while(q--)
        {
            scanf("%d",&type);
            //printf("%dhh\n",type);
            if(type)
            {
                scanf("%d %d",&x,&y);
                printf("%lld\n",query(0,n-1,x-1,y-1,0));
            }
            else
            {
                scanf("%d %d %lld",&x,&y,&val);
                update(0,n-1,x-1,y-1,0,val);
            }
        }
         
    }
     
    return 0;
     
}
