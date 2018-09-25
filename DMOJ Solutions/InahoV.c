#include <stdio.h>
int main() 
{
    unsigned long long sum = 0;
    long long a;
    int m;
    scanf("%d",&m);
    while(m--){
        scanf("%ld",&a);
        sum += -a;
    }
    if(sum!=0)
        printf("-");
    printf("%lu\n",sum);
    return 0;
}
