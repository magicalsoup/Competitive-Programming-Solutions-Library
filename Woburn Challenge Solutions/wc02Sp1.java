import java.io.*;
import java.util.*;
public class wc02Sp1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int[][][]g;
	public static void main(String[]args)throws IOException{
		int n =readInt();
		while(n!=-1) {
			g = new int[n+1][n+1][n+1];
			boolean pos = false;
			int maxsingle = - 1<<30;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					for(int k=1;k<=n;k++) {
						int in = readInt();
						g[i][j][k] = in + g[i-1][j][k] + g[i][j-1][k] + g[i][j][k-1]-g[i-1][j-1][k]-g[i][j-1][k-1]-g[i-1][j][k-1]+g[i-1][j-1][k-1];
						if(in>=0)
							pos = true;
						maxsingle = Math.max(maxsingle, in);
					}
				}
			}
			int max =0;
			int curr =0;
			for(int j1=1;j1<=n;j1++) {
				for(int j2 =j1;j2<=n;j2++) {
					for(int k1 = 1;k1<=n;k1++) {
						for(int k2 = k1;k2<=n;k2++) {
							curr =0;
							for(int i=1;i<=n;i++) {
								curr = Math.max(curr+sum(i,j1,k1,i,j2,k2),0);
								max = Math.max(curr, max);
							}
						}
					}
				}
			}
			if(pos)
				out.println(max);
			else
				out.println(maxsingle);
			n = readInt();
		}
		out.close();
	}
	static int sum (int x1,int y1,int z1,int x2,int y2,int z2) {
		x1--;y1--;z1--
		return g[x2][y2][z2] - g[x1][y2][z2] - g[x2][y1][z2] - g[x2][y2][z1] + g[x1][y1][z2] + g[x1][y2][z1] + g[x2][y1][z1] - g[x1][y1][z1];
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
}
