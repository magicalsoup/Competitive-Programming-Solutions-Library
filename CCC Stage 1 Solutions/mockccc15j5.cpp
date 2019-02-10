#include <iostream>
#include<algorithm>
#include<vector>
using namespace std;
typedef pair<int, int> pi;
int N, M, x0, y0, x1, y1; vector<pi> px, py; long long ans;
int main(){
    scanf("%d", &N);
    for(int i = 0, x, y; i < N; i++){
        scanf("%d %d", &x, &y);
        px.push_back({x, y}); py.push_back({y, x});
    }
    sort(px.begin(), px.end()); sort(py.begin(), py.end());
    scanf("%d %d %d", &M, &x0, &y0);
    for(int i = 1; i < M; i++){
        scanf("%d %d", &x1, &y1);
        if(y0 == y1){
            int lft = lower_bound(py.begin(), py.end(), pi{y0, min(x0, x1)}) - py.begin();
            int rit = upper_bound(py.begin(), py.end(), pi{y0, max(x0, x1)}) - py.begin();
            ans += rit - lft;
        }
        else{
            int lft = lower_bound(px.begin(), px.end(), pi{x0, min(y0, y1)}) - px.begin();
            int rit = upper_bound(px.begin(), px.end(), pi{x0, max(y0, y1)}) - px.begin();
            ans += rit - lft;
        }
        x0 = x1; y0 = y1;
    }

    printf("%lld\n", ans);
}
