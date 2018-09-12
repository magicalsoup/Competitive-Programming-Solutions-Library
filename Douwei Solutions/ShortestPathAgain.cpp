#include <bits/stdc++.h>
 
#define MAXN 501
#define INF 0x3f3f3f3f
 
using namespace std;
 
int N, M, src, dist[MAXN][MAXN];
int main(){
    cin >> N >> M >> src;
    memset(dist, 0x3f, sizeof dist);
 
    for (int i = 0, a, b, w; i < M; i++){
        cin >> a >> b >> w;
        dist[a][b] = w;
    }
 
    for (int k = 0; k < N; k++){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                int alt = dist[i][k] + dist[k][j];
                if (dist[i][j] > alt){
                    dist[i][j] = alt;
                }
            }
        }
    }
 
    int ans = INF;
    for (int i = 0; i < N; i++){
        ans = min(ans, dist[src][i] + dist[i][src]);
    }
 
    if (ans == INF)
        cout << "NO" << endl;
    else
        cout << ans << endl;
}
