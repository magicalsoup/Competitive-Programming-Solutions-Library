#define DIJKSTRAS_CHECK 0	//run Dijkstra's, only output if answers don't match
#define DIJKSTRAS_ANALYZE 0 //run Dijkstra's, output statistics about the optimal path

#define DEBUG 0

#include <algorithm>
#include <functional>
#include <numeric>
#include <iostream>
#include <iomanip>
#include <cstdio>
#include <cmath>
#include <complex>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <cassert>
#include <string>
#include <vector>
#include <list>
#include <map>
#include <set>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <sstream>
using namespace std;

#define LL long long
#define LD long double
#define PR pair<int,int>

#define Fox(i,n) for (i=0; i<n; i++)
#define Fox1(i,n) for (i=1; i<=n; i++)
#define FoxI(i,a,b) for (i=a; i<=b; i++)
#define FoxR(i,n) for (i=(n)-1; i>=0; i--)
#define FoxR1(i,n) for (i=n; i>0; i--)
#define FoxRI(i,a,b) for (i=b; i>=a; i--)
#define Foxen(i,s) for (i=s.begin(); i!=s.end(); i++)
#define Min(a,b) a=min(a,b)
#define Max(a,b) a=max(a,b)
#define Sz(s) int((s).size())
#define All(s) (s).begin(),(s).end()
#define Fill(s,v) memset(s,v,sizeof(s))
#define pb push_back
#define mp make_pair
#define x first
#define y second

template<typename T> T Abs(T x) { return(x<0 ? -x : x); }
template<typename T> T Sqr(T x) { return(x*x); }
string plural(string s) { return(Sz(s) && s[Sz(s)-1]=='x' ? s+"en" : s+"s"); }

const int INF = (int)1e9;
const double EPS = 1e-9;
const LD PI = acos(-1.0);

#if DEBUG
#define GETCHAR getchar
#else
#define GETCHAR getchar_unlocked
#endif

bool Read(int &x)
{
	char c,r=0,n=0;
	x=0;
		for(;;)
		{
			c=GETCHAR();
				if ((c<0) && (!r))
					return(0);
				if ((c=='-') && (!r))
					n=1;
				else
				if ((c>='0') && (c<='9'))
					x=x*10+c-'0',r=1;
				else
				if (r)
					break;
		}
		if (n)
			x=-x;
	return(1);
}

int G,W;
int M[2]; //0: going right, 1: going left (with coordinates 1..G flipped)
pair<PR,LD> seg[2][100000]; //< <start, end>, time>
LD sum[2][100000]; //time to travel from start of segment 0 to start of this one
int swI[2][100000]; //index of next reverse-direction segment
LD swT[2][100000]; //time to travel from start of next reverse-direction segment to start of this one

//calculate time to walk from a to b
LD Walk(int a,int b)
{
	return((LD)abs(a-b)/W*100);
}

LD PointToPoint(int a,int b,int d,bool r);

//calculate time from point a to start of interval i, in direction d, optionally allowing reverse-direction segments
LD PointToStart(int a,int i,int d,bool r)
{
	//vars
	int j;
	LD ans,t;
	//consider walking directly
	ans=Walk(a,seg[d][i].x.x);
		if ((r) && ((j=swI[d][i])>=0))
		{
			//consider using reverse-direction segments
			t=PointToPoint(G-a,seg[1-d][j].x.x,1-d,0) + swT[d][i];
			Min(ans,t);
		}
	return(ans);
}

//calculate time from start of interval i to point b, in direction d, optionally allowing reverse-direction segments
LD StartToPoint(int i,int b,int d,bool r)
{
	//vars
	int j;
	LD ans,t;
	//consider walking directly
	ans=Walk(seg[d][i].x.x,b);
	//consider using interval
		if (r)
			t=seg[d][i].y + PointToPoint(G-seg[d][i].x.y,G-b,1-d,0);
		else
			t=seg[d][i].y + Walk(seg[d][i].x.y,b);
	Min(ans,t);
		if (r)
		{
			//consider using reverse-direction segments
			j=lower_bound(seg[1-d],seg[1-d]+M[1-d],mp(mp(G-seg[d][i].x.y,-1),(LD)0))-seg[1-d]-1;
				if ((j<0) || (G-seg[1-d][j].x.y>=seg[d][i].x.y))
					j++;
				if ((j<M[1-d]) && (G-seg[1-d][j].x.x>b) && (G-seg[1-d][j].x.y<seg[d][i].x.y) && (swI[1-d][j]>=0))
				{
					t=sum[d][swI[1-d][j]]-sum[d][i];
					t+=swT[1-d][j] + PointToPoint(seg[1-d][j].x.x,G-b,1-d,0);
					Min(ans,t);
				}
		}
	return(ans);
}

//calculate time from a to b, in direction d, optionally allowing reverse-direction segments
LD PointToPoint(int a,int b,int d,bool r)
{
	//vars
	int i,j;
	bool ca,cb;
	LD ans,t;
	//consider walking directly
		if (a==b)
			return(0);
	ans=Walk(a,b);
		if ((a>b) || (!M[d]))
			return(ans);
	//find segments containing points
	i=lower_bound(seg[d],seg[d]+M[d],mp(mp(a,-1),(LD)0))-seg[d]-1;
	ca=(i>=0) && (seg[d][i].x.x<a) && (a<seg[d][i].x.y);
	j=lower_bound(seg[d],seg[d]+M[d],mp(mp(b,-1),(LD)0))-seg[d]-1;
	cb=(j>=0) && (seg[d][j].x.x<b) && (b<seg[d][j].x.y);
	//no segments in between?
		if (i==j)
		{
				if ((ca) || (cb))
				{
					t=PointToStart(a,i,d,r);
					t+=StartToPoint(i,b,d,r);
					Min(ans,t);
				}
			return(ans);
		}
	//at least one segment in between
		if (i>=0)
			t=min(Walk(a,seg[d][i+1].x.x),PointToStart(a,i,d,r)+sum[d][i+1]-sum[d][i]);
		else
			t=Walk(a,seg[d][i+1].x.x);
	t+=sum[d][j]-sum[d][i+1];
	t+=min(Walk(seg[d][j].x.x,b),StartToPoint(j,b,d,r));
	Min(ans,t);
	return(ans);
}

int main()
{
		if (DEBUG)
			freopen("in.txt","r",stdin);
	//vars
	int N,Q;
	int i,j,k;
	LD t,d,d2;
	int a,b,c,a2,b2,c2;
	static LD dist[2][100001][2];
	static int cntS[2][100001][2][2],cntD[2][100001][2],prevD[2][100001][2];
	static bool vis[2][100001][2];
	static int pos[2][100001][2];
	priority_queue <pair<pair<LD,int>,PR> > QQ;
	//input
	Read(G),Read(W),Read(N),Read(Q);
	G++;
		while (N--)
		{
			Read(i),Read(j),Read(k);
				if (i<j)
					seg[0][M[0]++]=mp(mp(i,j),(LD)(j-i)/(k+W)*100);
				else
					seg[1][M[1]++]=mp(mp(G-i,G-j),(LD)(i-j)/(k+W)*100);
		}
	//precompute times to travel in a single direction
		Fox(i,2)
		{
			sort(seg[i],seg[i]+M[i]);
			sum[i][0]=0;
				Fox1(j,M[i]-1)
					sum[i][j]=sum[i][j-1] + seg[i][j-1].y + Walk(seg[i][j-1].x.y,seg[i][j].x.x);
		}
	//precompute times to switch directions
		Fox(i,2)
		{
			k=M[1-i]-1;
				Fox(j,M[i])
				{
					//find first reverse-direction segment which starts after this one
						while ((k>=0) && (G-seg[1-i][k].x.x<=seg[i][j].x.x))
							k--;
					//find time from there to here
						if (k<0)
							swI[i][j]=-1;
						else
						{
							swI[i][j]=k;
							//consider walking directly
							swT[i][j]=Walk(seg[i][j].x.x,G-seg[1-i][k].x.x);
							//consider using the reverse-direction segment
							t=seg[1-i][k].y + Walk(seg[i][j].x.x,G-seg[1-i][k].x.y);
							Min(swT[i][j],t);
							//consider going back to the previous same-direction segment
								if (j)
								{
									t=sum[1-i][swI[i][j-1]]-sum[1-i][k];
									t+=swT[i][j-1];
									t+=sum[i][j]-sum[i][j-1];
									Min(swT[i][j],t);
								}
						}
				}
		}
	//handle queries
		while (Q--)
		{
			//input
			Read(i),Read(j);
				if (i==j)
					t=0;
				else
				if (i<j)
					t=PointToPoint(i,j,0,1);
				else
					t=PointToPoint(G-i,G-j,1,1);
			//output
			printf("%.12Lf\n",t);
			//check answer with dijkstra's
				if ((DIJKSTRAS_CHECK) || (DIJKSTRAS_ANALYZE))
				{
						Fox(a,2)
							Fox(b,(a ? M[a] : M[a]+1))
								Fox(c,2)
								{
									dist[a][b][c]=1e11;
									vis[a][b][c]=0;
										if ((!a) && (b==M[a]))
										{
											if (c)
												pos[a][b][c]=j;
											else
												pos[a][b][c]=i;
										}
										else
										if (!a)
										{
											if (c)
												pos[a][b][c]=seg[a][b].x.y;
											else
												pos[a][b][c]=seg[a][b].x.x;
										}
										else
										if (c)
											pos[a][b][c]=G-seg[a][b].x.y;
										else
											pos[a][b][c]=G-seg[a][b].x.x;
								}
						while (!QQ.empty())
							QQ.pop();
					dist[0][M[0]][0]=0,QQ.push(mp(mp(0,0),mp(M[0],0)));
					cntS[0][M[0]][0][0]=cntS[0][M[0]][0][1]=0;
					cntD[0][M[0]][0]=prevD[0][M[0]][0]=-1;
						while (!QQ.empty())
						{
							d=-QQ.top().x.x;
							a=QQ.top().x.y;
							b=QQ.top().y.x;
							c=QQ.top().y.y;
							QQ.pop();
								if (vis[a][b][c])
									continue;
								if ((!a) && (b==M[0]))
								{
									if (c)
										break;
								}
								else
								if (!c)
								{
									d2=d+seg[a][b].y;
										if (dist[a][b][1]>d2)
										{
											dist[a][b][1]=d2,QQ.push(mp(mp(-d2,a),mp(b,1)));
											cntS[a][b][1][0]=cntS[a][b][c][0] + (a==0 ? 1 : 0);
											cntS[a][b][1][1]=cntS[a][b][c][1] + (a==1 ? 1 : 0);
											cntD[a][b][1]=cntD[a][b][c] + (prevD[a][b][c]==a ? 0 : 1);
											prevD[a][b][1]=a;
										}
								}
								Fox(a2,2)
									Fox(b2,(a2 ? M[a2] : M[a2]+1))
										Fox(c2,2)
										{
											d2=d+Walk(pos[a][b][c],pos[a2][b2][c2]);
												if (dist[a2][b2][c2]>d2)
												{
													dist[a2][b2][c2]=d2,QQ.push(mp(mp(-d2,a2),mp(b2,c2)));
													cntS[a2][b2][c2][0]=cntS[a][b][c][0];
													cntS[a2][b2][c2][1]=cntS[a][b][c][1];
														if (pos[a][b][c]==pos[a2][b2][c2])
														{
															cntD[a2][b2][c2]=cntD[a][b][c];
															prevD[a2][b2][c2]=prevD[a][b][c];
														}
														else
														{
															k=(pos[a][b][c]<pos[a2][b2][c2] ? 0 : 1);
															cntD[a2][b2][c2]=cntD[a][b][c] + (prevD[a][b][c]==k ? 0 : 1);
															prevD[a2][b2][c2]=k;
														}
												}
										}
						}
						if ((DIJKSTRAS_CHECK) && (fabs(d-t)>EPS))
							printf("%d -> %d, produced %.6Lf instead of %.6Lf\n",i,j,t,d);
						if (DIJKSTRAS_ANALYZE)
						{
							a2=cntS[a][b][c][0];
							b2=cntS[a][b][c][1];
								if (j<i)
									swap(a2,b2);
							c2=max(0,cntD[a][b][c]);
							printf("%d -> %d \tsame-direction walkways: %d \treverse-direction walkways: %d \tchanges of direction: %d\n",i,j,a2,b2,c2);
						}
				}
		}
	return(0);
}
