import java.util.*;
import java.io.*;
public class ccc17s5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int [] station;
	static int [] passenger;
	static int n;
	static int m;
	static int q;
	static int [] shift;
	static int [] blocksum;
	static int blocksize;
	static ArrayList<Integer>[] ib, lbx, lix;
	public static void build() {
		if(blocksize==1) {
			int p = 1;
			int blockindex = 1;
			int pblock = 1;
			while(p<=n) {
				int sp = station[p];
				blocksum[blockindex] += passenger[p];
				if(blockindex==ib[sp].get(ib[sp].size()-1)) {
					ib[sp].add(blockindex);
					lbx[sp].add(passenger[p]);
					passenger[p] = ib[sp].size()-1;
				}
				else {
					ib[sp].add(blockindex);
					lbx[sp].add(passenger[p]);
					lix[sp].add(ib[sp].size()-2);
					passenger[p] = ib[sp].size()-1;
				}
				p++;
				pblock++;
				if(pblock>blocksize) {
					pblock = 1;
					blockindex++;
				}
			}
		}
		else {
			int p = 1;
			int blockindex = 0;
			while(p<=n) {
				if(p%blocksize==1) {
					blockindex++;
				}
				int sp = station[p];
				blocksum[blockindex] += passenger[p];
				if(blockindex==ib[sp].get(ib[sp].size()-1)) {
					ib[sp].add(blockindex);
					lbx[sp].add(passenger[p]);
					passenger[p] = ib[sp].size()-1;
				}
				else {
					ib[sp].add(blockindex);
					lbx[sp].add(passenger[p]);
					lix[sp].add(ib[sp].size()-2);
					passenger[p] = ib[sp].size()-1;
				}
				p++;
			}
		}
	}
	public static void update(int x) {
		for(int i=0;i<lix[x].size();i++) {
			int pi = lix[x].get(i);
			if(pi==0) {
				pi = ib[x].size()-1;
			}
			int p2 = pi - shift[x];
			if(p2<0) {
				p2+=(ib[x].size()-1);
			}
			if(p2==0) {
				p2 = ib[x].size()-1;
			}
			int p3 = pi+1;
			if(p3>=ib[x].size()) {
				p3 = 1;
			}
			blocksum[ib[x].get(p3)] += lbx[x].get(p2);
			blocksum[ib[x].get(pi)] -= lbx[x].get(p2);
		}
		shift[x]++;
		shift[x] %= (ib[x].size()-1);
	}
	public static int query(int l,int u) {
		int c = l / blocksize;
		int d = u / blocksize;
		if(u%blocksize!=0) {
			d++;
		}
		int total = 0;
		for(int i=c;i<=d;i++) {
			total+=blocksum[i];
		}
		int cons = Math.max(1, (c-1)*(blocksize)+1);
		for(int i=l-1;i>=cons;i--) {
			int line = station[i];
			int indexforit = passenger[i] - shift[line];
			if(indexforit<=0) {
				indexforit += (lbx[line].size()-1);
			}
			total -= lbx[line].get(indexforit);
		}
		if(u%blocksize!=0) {
			cons = Math.min(n, d*blocksize);
			for(int i=u+1;i<=cons;i++) {
				int line = station[i];
				int indexforit = passenger[i] - shift[line];
				if(indexforit<=0) {
					indexforit += (lbx[line].size()-1);
				}
				total -= lbx[line].get(indexforit);
			}
		}
		return total;
	}
	@SuppressWarnings("unchecked")
	public static void main(String[]args) throws IOException{
	n = readInt();
	m = readInt();
	q = readInt();
	blocksize = (int)(Math.sqrt(n));
	station = new int [n+1];
	passenger = new int[n+1];
	shift = new int[m+1];
	blocksum = new int[blocksize+3];
	ib = new ArrayList[m+1];
	lbx = new ArrayList[m+1];
	lix = new ArrayList[m+1];
	for(int i=1;i<=n;i++) {
		station[i] = readInt();
		}
	for(int i=1;i<=n;i++) {
		passenger[i] = readInt();
		}
	for(int i=0;i<m+1;i++) {
		ib[i] = new ArrayList<Integer>();
		ib[i].add(-1);
		lbx[i] = new ArrayList<Integer>();
		lbx[i].add(-1);
		lix[i] = new ArrayList<Integer>();
		}
	build();
	for(int i=0;i<q;i++) {
		int type = readInt();
		if(type==1) {
		out.println(query(readInt(),readInt()));	
			}
		else {
		update(readInt());
			}
		}
		out.close();
		System.exit(0);
	}
	 		static String next () throws IOException {
		    while (st == null || !st.hasMoreTokens())
		      st = new StringTokenizer(br.readLine().trim());
		    return st.nextToken();
		  }

		  static long readLong () throws IOException {
		    return Long.parseLong(next());
		  }

		  static int readInt () throws IOException {
		    return Integer.parseInt(next());
		  }

		  static double readDouble () throws IOException {
		    return Double.parseDouble(next());
		  }

		  static String readLine () throws IOException {
		    return br.readLine().trim();
		  } 
}
