import java.util.*;
import java.io.*;
public class ccc13s2p4{
	private static ccc13s2p4 o = new ccc13s2p4();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	private static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	public class fenwicktree{
	int[][]array;
	public fenwicktree(int sizex,int sizey) {
		array = new int[sizex+1][sizey+1];
	}
	public int rsq(int indx,int indy) {
		int sum =0;
		for(int x= indx;x>0;x-=(x&-x)) {
			for(int y = indy;y>0;y-=(y&-y)) {
				sum+=array[x][y];
			}
		}
		return sum;
	}
	public int rsq(int x1,int y1,int x2,int y2) {
		return rsq(x2,y2)+rsq(x1-1,y1-1)-rsq(x1-1,y2)-rsq(x2,y1-1);
	}
	public void	update(int indx,int indy, int value) {
		for(int x = indx;x<array.length;x+=(x&-x)) {
			for(int y = indy;y<array[x].length;y+=(y&-y)) {
				array[x][y] += value;
			}
		}
	}
	public int sizex() {
		return array.length-1;
	}
	public int sizey() {
		return array[0].length-1;
	}
	}
	public static class seat{
		public int r;
		public int c;
		public seat(int r,int c) {
			this.r = r;
			this.c = c;
		}
	}
	public static int L,T,B;
	public static void main(String[]args)throws IOException{
		L = readInt();
		B = 1500;
		T = readInt();
		fenwicktree ft = o.new fenwicktree(2*B+1,2*B+1);
		boolean [][]taken = new boolean[B+2][1001];
		for(int i =0;i<T;i++) {
			char e = next().charAt(0);
			int r = readInt();
			int c = readInt();
			seat s = toseat(new seat(r,c));
			if(e=='E') {
				if(r<=B) {
					ft.update(s.r, s.c, 1);
					taken[r][c] = true;
				}
			}
			else if(e=='L') {
				if(r<=B) {
					ft.update(s.r, s.c, -1);
					taken[r][c] = false;
				}
			}
			else {
				seat s2 = toseat(new seat(r,c+1));
				if(taken[r][c]||taken[r][c+1]) out.println("No");
				else
					out.println(ft.rsq(s.r, s.c)+ft.rsq(s2.r,s2.c));
			}
		}
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int r = L+1;r<=L+501;r++) {
			for(int c = 1;c<=1000;c++) {
				seat s = toseat(new seat(r,c));
				if(taken[r][c])continue;
				int res = ft.rsq(s.r, s.c);
				if(res<=min) {
					min2 =min;
					min = res;
				}
				else if(res<min2) {
					min2 = res;
				}
			}
		}
		out.println(min+min2);
		out.close();
	}
	static String next() throws IOException{
        while(st==null||!st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException{
        return Long.parseLong(next());
    }
    static int readInt() throws IOException{
        return  Integer.parseInt(next());
    }
     static double readDouble() throws IOException{
        return  Double.parseDouble(next());
    }
    static char readCharacter() throws IOException{
        return next().charAt(0);
    }
    static String readLine() throws IOException{
        return br.readLine().trim();
    }
private static seat toseat(seat s) {
	return new seat(s.r-s.c+B,s.r+s.c);
}
}
