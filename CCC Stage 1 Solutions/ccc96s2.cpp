#include <iostream>
#include<vector>
#include<string>
using namespace std;
int main()
{
    int T;
    scanf("%d",&T);
    while(T--)
    {
        string str;
        cin>>str;
        int n[str.size()];
        int i,j,k;
        for(i=0;i<str.size();i++)
        n[i]=  str[i]-'0';
        i =0; j = str.size()-1;
        while(j-i>=1){
            for(k=i;k<=j;k++)
            printf("%d",n[k]);
            printf("\n");
            int digit = n[j--];
            k = j;
            n[k]-=digit;
            while(n[k]<0&&k>i)
            {
                n[k-1]--;
                n[k]+=10;
                k--;
            }
            while(n[i]==0)i++;
        }
        i = std::min(i,j);
        if(n[i]==0)printf("The number %s is divisible by 11.\n",str.c_str());
        else printf("The number %s is not divisible by 11.\n",str.c_str());
    }
    return 0;
}
