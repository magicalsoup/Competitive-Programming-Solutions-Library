#include<iostream>
#include<cstdio>
#include<set>
#include<sstream>
#include<queue>
#include<algorithm>
#define to_s(N) static_cast<ostringstream*>( &(ostringstream() << N) )->str()
using namespace std;

const int MAXN = 4;
enum DIRECTIONS{UP,RT,DN,LT};

struct grid{
  int G[MAXN][MAXN];
  string id;
  grid(int (&_G)[MAXN][MAXN]){
    for(int r = 0;r < MAXN;r++)
        for(int c = 0;c < MAXN;c++)
            G[r][c] = _G[r][c];
    update_id();
  }
  void translate_col(int d,int c){
    bool change = true;
    if(d == UP){
      while(change){
        change = false;
        for(int r = 0;r < MAXN-1;r++)
          if(G[r][c] == 0 && G[r+1][c] != 0)
            G[r][c] = G[r+1][c],G[r+1][c] = 0,change = true;
      }
    }else if(d == DN){
      while(change){
        change = false;
        for(int r = MAXN-1;r >= 1;r--)
          if(G[r][c] == 0 && G[r-1][c] != 0)
            G[r][c] = G[r-1][c],G[r-1][c] = 0,change = true;
      }
    }
  }
  void translate_row(int d,int r){
    bool change = true;
    if(d == RT){
      while(change){
        change = false;
        for(int c = MAXN-1;c >= 1;c--)
          if(G[r][c] == 0 && G[r][c-1] != 0)
            G[r][c] = G[r][c-1],G[r][c-1] = 0,change = true;
      }
    }else if(d == LT){
      while(change){
        change = false;
        for(int c = 0;c < MAXN-1;c++)
          if(G[r][c] == 0 && G[r][c+1] != 0)
            G[r][c] = G[r][c+1],G[r][c+1] = 0,change = true;
      }
    }
  }
  void translate(int d){
      if(d == UP|| d == DN)
        for(int c = 0;c < MAXN;c++)
           translate_col(d,c);
      else
        for(int r = 0;r < MAXN;r++)
            translate_row(d,r);
  }
  void shift(int d){
    if(d == UP){
       translate(UP);
       for(int r = 1;r < MAXN;r++)// addition
          for(int c = 0;c < MAXN;c++)
            if(G[r-1][c] == G[r][c])
              G[r-1][c]+=G[r][c], G[r][c]=0;
       translate(UP);
    }else if(d == RT){
      translate(RT);
      for(int c = 0;c < MAXN-1;c++)// addition
          for(int r = 0;r < MAXN;r++)
            if(G[r][c+1] == G[r][c])
              G[r][c+1]+=G[r][c], G[r][c]=0;
      translate(RT);
     }else if(d == DN){
      translate(DN);
      for(int r = MAXN-1;r >= 1;r--)// addition
          for(int c = 0;c < MAXN;c++)
            if(G[r][c] == G[r-1][c])
              G[r][c]+=G[r-1][c], G[r-1][c]=0;
      translate(DN);
    }else if(d == LT){
      translate(LT);
      for(int c = MAXN-1;c >= 1;c--)// addition
          for(int r = 0;r < MAXN;r++)
            if(G[r][c-1] == G[r][c])
              G[r][c-1]+=G[r][c], G[r][c]=0;
      translate(LT);
    }
    update_id();
  }
  void update_id(){
    id = "";
    for(int r = 0;r < MAXN;r++)
        for(int c = 0;c < MAXN;c++)
            id+=to_s(G[r][c]);
  }
  int get_max(){
    int m = 0;
    for(int r = 0;r < MAXN;r++)
        for(int c = 0;c < MAXN;c++)
          m = max(m,G[r][c]);
    return m;
  }
  bool operator < (const grid &grid2)const{
     return id < grid2.id;
  }
};

int G[MAXN][MAXN];
int best = 0;
set<string>used;

int main(){
    //freopen("input.txt","r",stdin);
    for(int t = 0;t < 5;t++){
        for(int r = 0;r < MAXN;r++)
            for(int c = 0;c < MAXN;c++)
                scanf("%d",&G[r][c]);
        grid init = (grid){G};
        best = max(best,init.get_max());
        queue<grid>q;
        q.push(init);
        while(!q.empty() && best != 2048){
            grid current = q.front();
            q.pop();
            used.insert(current.id);
            for(int d = 0;d < 4;d++){
              grid temp = current;
              temp.shift(d);
              if(!used.count(temp.id)){
                q.push(temp);
                used.insert(temp.id);
                best = max(best,temp.get_max());
              }
            }
        }
        printf("%d\n",best);
        used.clear();
        best = 0;
    }
    return 0;
}
