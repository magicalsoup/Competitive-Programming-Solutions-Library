#include <iostream>
using namespace std;
int main()
{
    int n,x,a,c,fox =0;
    int num[1000]= {1}, numl = 1;
    cin>>n;
    for(x=1;x<=n;x++)
    {
        c =0;
        for(a=0;a<numl;a++){
        c+=x*num[a];
        num[a] = c%10000;
        c/=10000;
    }
    if(c)
    num[numl++]= c;
}
for(a=0;a<numl;a++)
for(x=0;x<4;x++)
{
    fox+=(num[a]%10==0);
    num[a]/=10;
    if(a==numl-1&&!num[a])
    break;
}
cout<<fox<<endl;
    return 0;
}
