This is a variant on the knapsack problem. Usually we are only asked for the best time to cross the bridge, but this time, 
we are also asked for the size of the groups as well.

The recursive solution comes to mind easily: at each step, we are given a queue of people Q. We try to take all of the 1 to M people at 
once, remove those people from Q, and then recurse on Q. Our base case would then be 0 time to cross when we have 0 people left, and 
the total time used is the sum of the times used to cross at each step. However, notice that we have overlapping subproblems. 
If we take one person and then two, we will have to calculate the best time required for everyone except the first three people to cross. 
If we tried to take two people then one person, we also have to calculate the best time for everyone except the first three people to 
cross. Thus, we can save a lot of time by not calculating the same things more than once.

The dynamic solution is as follows. We keep an array best[] which stores the best time for the first x people in the line to cross 
the bridge. Our base case is best[0] = 0, since no people take zero time to cross. At time x, we have already calculated the best time 
for x people to cross. Then, we try to cross all 1 to M people c, and see if this time is better than the time to cross x+c people. 
Remember: a person may only cross the bridge once.

This allows us to get the best time to cross, but tells us nothing about how many people crossed at once. 
Notice that since people must cross in the order they were lined up in the queue originally, we can characterize 
how many people crossed at once with an array of integers. As well as the best[] array, we can keep another array who[][] telling us 
the order people crossed.
```cpp
#include <iostream>
using namespace std;

int main()
{
    string names[111];
    int time[111];

    int M; cin >> M;
    int N; cin >> N;
    for (int i = 0; i < N; i++)
        cin >> names[N-i] >> time[N-i];
       
    int dp[111];
    int opt[111];
    dp[0] = 0;
    opt[0] = -1;
    for (int i = 1; i <= N; i++)
    {
        dp[i] = INT_MAX;
        int ma = 0;
        for (int j = i; j >= 1; j--)
        {
            if (i-j+1 > M) break;
            ma >?= time[j];
            if (dp[j-1] + ma < dp[i])
                dp[i] = dp[j-1] + ma, opt[i] = j-1;
        }
    }
   
    cout << "Total Time: " << dp[N] << endl;
   
    int cur = N;
    while (cur)
    {
        for (int i = cur; i > opt[cur]; i--)
            cout << names[i] << " ";
        cout << endl;
        cur = opt[cur];
    }
   
    return 0;
}
```
