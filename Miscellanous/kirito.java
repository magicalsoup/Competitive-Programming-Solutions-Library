import java.util.*;
import java.io.*;

public class kirito {
	
	public static class hash{
		long hashval[] = new long[5001];
		
		public hash(String s) {
			hashval = new long[5001]; hashval[0] = 1;
			for(int i = 1; i<=s.length(); i++) this.hashval[i] = (int) (this.hashval[i-1]*seed+s.charAt(i-1));
		}
		
		public long getHash(int idx) {
			return hashval[idx];
		}
	}
	
	public static int LCP(hash h, hash g) {
		int lo = 0, hi = M+1;
		while(lo < hi) {
			int mid = (lo+hi)/2;
			if(h.getHash(mid) == g.getHash(mid)) lo = mid+1;
			else hi = mid;
		}
		return hi-1;
	}
	public static long seed = 31;
	public static int N, M;
	
	public static class node{
		int l, r, val;
		public node(int l, int r) {
			this.l = l; this.r = r; 
		}
	}
	
	static node seg[] = new node[50000];
	static hash arr[] = new hash[2001];
	static int LCP[][] = new int[2001][2001];
	static int ID[] = new int[2001];
	
	static void build(int l, int r, int idx) {
		seg[idx] = new node(l, r);
		if(l == r) {seg[idx].val = M; return;}
		int mid = (l+r)/2;
		build(l, mid, 2*idx); build(mid+1, r, 2*idx+1);
		seg[idx].val = Math.min(Math.min(seg[2*idx].val, seg[2*idx+1].val), LCP[ID[mid]][ID[mid+1]]);
	}
	
	static void update(int pos, int idx) {
		if(seg[idx].l == pos && seg[idx].r == pos) {return;}
		
		int mid = (seg[idx].l + seg[idx].r)/2;
		if(pos <= mid) update(pos, 2*idx); else update(pos, 2*idx+1);
		seg[idx].val = Math.min(Math.min(seg[2*idx].val, seg[2*idx+1].val), LCP[ID[mid]][ID[mid+1]]);
	}
	
	static int query(int l, int r, int idx) {
		if(seg[idx].l == l && seg[idx].r == r) return seg[idx].val;
		int mid = (seg[idx].l + seg[idx].r)/2;
		if(l > mid) return query(l, r, 2*idx+1);
		else if(r <= mid) return query(l, r, 2*idx);
		else return Math.min(Math.min(query(l, mid, 2*idx), query(mid+1, r, 2*idx+1)), LCP[ID[mid]][ID[mid+1]]);
	}

	public static void main(String[] args) throws IOException {
		N = readInt(); M = readInt(); hash arr[] = new hash[N+1]; 
		for(int i = 1; i<=N; i++) arr[i] = new hash(next()); 
		for(int i = 1; i<=N; i++) ID[i] = i;
		for(int i = 1; i<=N; i++) for(int j = 1; j<=N; j++) {
			LCP[i][j] = LCP(arr[i], arr[j]);
		}
		
//		for(int i = 1; i<=N; i++) {for(int j = 1; j<=M; j++) print(arr[i].getHash(j) + " "); println();}
		build(1, N, 1);
		int Q = readInt();
		for(int q = 0; q<Q; q++) {
			int l = readInt(), r = readInt();
			println((r-l+1)*query(l, r, 1)); int temp = ID[l]; ID[l] = ID[r]; ID[r] = temp; 
			update(l, 1); update(r, 1);
		}
		
		exit();
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static float readFloat() throws IOException {
		return Float.parseFloat(next());
	}

	static boolean readBool() throws IOException {
		return Boolean.parseBoolean(next());
	}

	static short readShort() throws IOException {
		return Short.parseShort(next());
	}

	static byte readByte() throws IOException {
		return Byte.parseByte(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readChar() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		br.close();
		pr.close();
		System.exit(0);
	}
}
