import java.util.*;
import java.io.*;
public class wc99Sp6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static int r,c;
	static int[][]g;
	static boolean[][]v;
	public static void main(String[]args)throws IOException{
		int t= readInt();
		for(int qq=0;qq<t;qq++) {
			r = readInt();
			c = readInt();
			g = new	 int[r+2][c+2];
			int max =0;
			for(int i=1;i<=r;i++) {
				for(int j =1;j<=c;j++) {
					g[i][j] = readInt();
					max = Math.max(g[i][j], max);
				}
			}
			int[][] waterfull = new int [r+2][c+2];
			for(int i=1;i<=r;i++)
				for(int j= 1;j<=c;j++)
					waterfull[i][j] = max;
			boolean iscomplete = false;
			while(!iscomplete) {
				iscomplete = true;
				for(int i=1;i<=r;i++)
					for(int j=1;j<=c;j++) {
						int min = Math.max(g[i][j],Math.min(Math.min(waterfull[i-1][j], waterfull[i+1][j]), Math.min(waterfull[i][j-1], waterfull[i][j+1])));
						if(min<waterfull[i][j]) {
							waterfull[i][j] = min;
							iscomplete = false;
						}
			}
			}
			int ans =0;
			for(int i=1;i<=r;i++)
				for(int j=1;j<=c;j++)
					ans+=waterfull[i][j]-g[i][j];
			out.println(ans);
		}
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
}
