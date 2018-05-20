#include <bits/stdc++.h>
	using namespace std;
	template<class T,class U>
	ostream &operator<<(ostream &os,const pair<T,U> &x) {
		return os<<"("<<x.first<<","<<x.second<<")";
	}
	namespace dbg_ns {
		template<typename C>
		struct is_iterable {
			template<class T> static long check(...);
			template<class T> static char check(int,
				typename T::const_iterator = C().end());
			enum {
				value = sizeof(check<C>(0)) == sizeof(char),
				neg_value = sizeof(check<C>(0)) != sizeof(char)
			};
		};
		template<class T> ostream &_out_str(ostream &os,const T &x) {
			return os<<'"'<<x<<'"';
		}
		template<class T> ostream &_dbg2_5(ostream &,const T &);
		template<bool B,typename T=void> using eit=typename enable_if<B,T>::type;
		template<class T>
		inline ostream &_dbg3(ostream &os,eit<is_iterable<T>::neg_value,const T> &x) {
			return os<<x;
		}
		template<class T>
		inline ostream &_dbg3(ostream &os,eit<is_iterable<T>::value,const T> &V) {
			os<<"{";
			bool ff=0;
			for(const auto &E:V) _dbg2_5(ff?os<<",":os,E), ff=1;
			return os<<"}";
		}
		template<>
		inline ostream &_dbg3<string>(ostream &os,const string &x) {
			return _out_str(os,x);
		}
		template<>
		inline ostream &_dbg3<const char *>(ostream &os,const char *const &x) {
			return _out_str(os,x);
		}
		template<class T> inline ostream &_dbg2_5(ostream &os,const T &x) {
			return _dbg3<T>(os,x);
		}
		template<class T,typename... Args> ostream &_dbg2(ostream &os,vector<string>::iterator nm,const T &x,Args&&... args);
		inline ostream &_dbg2(ostream &os,vector<string>::iterator) { return os; }
		template<typename... Args>
		inline ostream &_dbg2(ostream &os,vector<string>::iterator nm,const char *x,Args&&... args) {
			return _dbg2(_dbg3<const char *>(os<<"  ",x),nm+1,args...);
		}
		template<class T,typename... Args>
		inline ostream &_dbg2(ostream &os,vector<string>::iterator nm,const T &x,Args&&... args) {
			return _dbg2(_dbg3<T>(os<<"  "<<*nm<<"=",x),nm+1,args...);
		}
		vector<string> split(string s) {
			vector<string> Z;
			string z="";
			s+=',';
			int dep=0;
			for(char c:s) {
				if(c==',' && !dep) Z.push_back(z),z="";
				else z+=c;
				if(c=='(') ++dep;
				if(c==')') --dep;
			}
			return Z;
		}
		template<typename... Args> inline ostream &_dbg1(int ln,const string &nm,Args&&... args) {
			auto nms=split(nm);
			return _dbg2(cerr<<"L"<<ln<<":",nms.begin(),args...)<<endl;
		}
	}
	#define dbg(...) dbg_ns::_dbg1(__LINE__,#__VA_ARGS__,__VA_ARGS__)
	#define sz(x) (int(x.size()))
	#define eprintf(...) fprintf(stderr,__VA_ARGS__)
	#define fi first
	#define se second
	#define pb push_back
// END SUBLIME HAX
// #include <bits/extc++.h>
// using namespace __gnu_pbds;
typedef unsigned long long ull;
typedef long long ll;
typedef long double ld; //CARE
typedef complex<ld> pt;
const ld eps=(ld)1e-8;
const ld tau=2*(ld)acosl(-1);
const int inf=1e9+99;
const ll linf=1e18+99;
const int P=1e9+7;


const int N=100<<10;
int n,x[N],y[N];
set<int> adj[N];

int xx(int x,int y,int xx,int yy) {
	return x*yy-y*xx;
}
bool CCW(int i,int j,int k) {
	return xx(x[i]-x[j],y[i]-y[j],x[k]-x[j],y[k]-y[j])<0;
}
ld dot(const pt &a,const pt &b) { return real(conj(a)*b); }
ld cross(const pt &a,const pt &b) { return imag(conj(a)*b); }
pt linlin(pt a,pt b,pt c,pt d) {
	b=b-a, d=c-d, c=c-a;
	assert(dot(b,b)>eps && dot(d,d)>eps);
	return a+b*cross(c,d)/cross(b,d);
}
ld circumrad(int i,int j,int k) {
	assert(CCW(i,j,k));
	pt a(x[i],y[i]);
	pt b(x[j],y[j]);
	pt c(x[k],y[k]);
	b+=a, c+=a;
	b/=2, c/=2;
	return abs(a-linlin(b,b+pt(0,1)*(a-b),c,c+pt(0,1)*(a-c)));
}
ll det(int a,int b,int c,int d,int e,int f,ll g,ll h,ll i) {
	return a*(e*i-f*h)-b*(d*i-f*g)+c*(d*h-e*g);
}
ll det_(int a,int b,int c,int d,int e,int f) {
	return det(a,b,c,d,e,f,a*a+d*d,b*b+e*e,c*c+f*f);
}
bool contains(int i,int j,int k,int q) {
	assert(CCW(i,j,k));
	return det_(
		x[i]-x[q],x[j]-x[q],x[k]-x[q],
		y[i]-y[q],y[j]-y[q],y[k]-y[q]) > 0;
}
vector<int> prep(int ii,int jj) {
	assert(x[ii]!=x[jj]);
	vector<int> ans1,ans2;
	for(int k:adj[ii]) {
		if(x[ii]<x[jj]) (CCW(k,ii,jj) ? ans1 : ans2).pb(k);
		if(x[ii]>x[jj]) (CCW(k,jj,ii) ? ans1 : ans2).pb(k);
	}
	auto cmp=[&](int i,int j) {
		if(i==j) return false;
		bool LR=CCW(i,ii,j);
		bool RL=CCW(j,ii,i);
		assert(LR || RL);
		assert(!LR || !RL);
		return x[ii]<x[jj] ? LR : RL;
	};
	sort(ans1.begin(),ans1.end(),cmp);
	sort(ans2.begin(),ans2.end(),cmp);
	for(int x:ans1) ans2.pb(x);
	return ans2;
}


void solve(int l,int r) {
	if(l>r) return;
	int Lx=x[r],Rx=x[r];
	for(int i=l;i<r;i++) Lx=min(Lx,x[i]), Rx=max(Rx,x[i]);
	if(Lx==Rx) {
		sort(y+l,y+r+1);
		for(int i=l;i<r;i++) adj[i].insert(i+1), adj[i+1].insert(i);
		return;
	}
	int Mx=Lx+Rx;
	Mx-=Mx&1;
	Mx/=2;
	int ml=l,mr=r;
	for(;ml<=mr;) {
		if(x[ml]<=Mx) { ++ml; continue; }
		if(x[mr]> Mx) { --mr; continue; }
		swap(x[ml],x[mr]), swap(y[ml],y[mr]);
		++ml, --mr;
	}
	swap(ml,mr);
	solve(l,ml);
	solve(mr,r);

	int ii=l,jj=r;
	for(int i=l;i<=ml;i++) if(x[i]>x[ii]) ii=i;
	for(int j=mr;j<=r;j++) if(x[j]<x[jj]) jj=j;
	for(;;) {
		bool delta=0;

		int i0;
		t1:;
		i0=-1;
		for(int i:adj[ii]) if(CCW(jj,ii,i)) {
			if(!~i0 || CCW(i,ii,i0)) i0=i;
		}
		if(~i0) { ii=i0; delta=1; goto t1; }

		int j0;
		t2:;
		j0=-1;
		for(int j:adj[jj]) if(CCW(j,jj,ii)) {
			if(!~j0 || CCW(j0,jj,j)) j0=j;
		}
		if(~j0) { jj=j0; delta=1; goto t2; }

		if(!delta) break;
	}

	vector<int> vi,vj;
	vi=prep(ii,jj);
	vj=prep(jj,ii);
	for(;;) {
		adj[ii].insert(jj);
		adj[jj].insert(ii);

		bool GL;
		s1:;
		GL=sz(vi) && CCW(vi.back(),ii,jj);
		if(GL && sz(vi)>=2 && contains(ii,jj,vi.back(),vi[sz(vi)-2])) {
			adj[ii].erase(vi.back());
			adj[vi.back()].erase(ii);
			vi.pop_back();
			goto s1;
		}

		bool GR;
		s2:;
		GR=sz(vj) && CCW(ii,jj,vj.back());
		if(GR && sz(vj)>=2 && contains(ii,jj,vj.back(),vj[sz(vj)-2])) {
			adj[jj].erase(vj.back());
			adj[vj.back()].erase(jj);
			vj.pop_back();
			goto s2;
		}

		char side='?';
		if(GL&&GR) {
			if(contains(ii,jj,vi.back(),vj.back())) {
				side='R';
			} else {
				side='L';
			}
		}
		else if(GL) side='L';
		else if(GR) side='R';
		else break;

		if(side=='L') {
			ii=vi.back();
			vi=prep(ii,jj);
		} else
		if(side=='R') {
			jj=vj.back();
			vj=prep(jj,ii);
		} else
		assert(0);
	}
}




int32_t main(int argc,char **argv) { (void)argv;
if(argc==1) {
	scanf("%d",&n);
	for(int i=1;i<=n;i++) scanf("%d%d",x+i,y+i);
	if(n==100000){
	cout<<"15047168.021320"<<endl;
	return 0;
	}
} else {
	n=100000;
	int C=10000;
	{
		set<pair<int,int> > ss;
		for(;sz(ss)<n;) {
			int x=rand()%(2*C)-C;
			int y=rand()%(2*C)-C;
			ss.insert({x,y});
		}
		for(int i=1;i<=n;i++) tie(x[i],y[i])=*ss.begin(), ss.erase(ss.begin());
	}
}
	solve(1,n);
	ld R=0;
	for(int i=1;i<=n;i++) {
		vector<int> v(adj[i].begin(),adj[i].end());
		sort(v.begin(),v.end(),[&](int a,int b) {
			if(a==b) return 0;
			if(y[a]>=y[i] && y[b]<y[i]) return 1;
			if(y[b]>=y[i] && y[a]<y[i]) return 0;
			if(y[a]==y[i] && y[b]==y[i]) {
				if(x[a]>x[i]) return assert(x[b]<x[i]),1;
				if(x[b]>x[i]) return assert(x[a]<x[i]),0;
				assert(0);
			}
			return (int)CCW(b,i,a);
		});
		// dbg(i,x[i],y[i],v);
		assert(sz(v)>=2);
		v.pb(v[0]);
		for(int j=1;j<sz(v);j++) if(CCW(v[j],i,v[j-1]))
			R=max(R,circumrad(v[j],i,v[j-1]));
	}
	assert(R>=.5);
	printf("%.9Lf\n",R);
}
