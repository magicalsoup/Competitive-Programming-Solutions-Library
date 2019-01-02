#include<bits/stdc++.h>
#include "inaho.h"

using namespace std;

#define pb push_back
#define mp make_pair
#define maxint INT_MAX
#define maxlong LONG_MAX
#define INF 0x3f3f3f3f
#define MAXN 500010

typedef pair<int, int> pi;

struct Node{
    int parent, Size;
};

vector<Node> Rank;
stack<pi> nodes;


int Find(int p){
    return p == Rank[p].parent ? p : Find(Rank[p].parent);
}

void Init(int n){
    for(int i = 0; i <= n; i++)
        Rank.pb({i, 1});
}

void Merge(int u, int v){
    if(u == v) return;
    if(Rank[u].Size < Rank[v].Size){
        Rank[v].Size += Rank[u].Size;
        Rank[u].parent = v;
    }
    else{
        Rank[u].Size += Rank[v].Size;
        Rank[v].parent = u;
    }
}
void unMerge(int u, int v){
    if(u == v) return;
    if(Rank[u].Size < Rank[v].Size){
        Rank[v].Size -= Rank[u].Size;
        Rank[u].parent = v;
    }
    else{
        Rank[u].Size -= Rank[v].Size;
        Rank[v].parent = v;
    }
}

void AddEdge(int u, int v){
    u = Find(u); v = Find(v);
    Merge(u, v);
    nodes.push(mp(u, v));
}

void RemoveLastEdge(){
    pi p = nodes.top(); nodes.pop();
    unMerge(p.first, p.second);
}

int GetSize(int u){
    return Rank[Find(u)].Size;
}
