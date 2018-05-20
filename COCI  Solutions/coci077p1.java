import java.util.*;
import java.io.*;
public class coci077p1 {
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt();
		int[][]platforme = new int[n+1][3];
		platforme[0][0] = 0;
		platforme[0][1]= 0;
		platforme[0][2] =Integer.MAX_VALUE;
		int count = 0;
		for(int x =1;x<platforme.length;x++) {
			platforme[x][0] = readInt();
			platforme[x][1] = readInt();
			platforme[x][2] = readInt();
		}
		Arrays.sort(platforme,new Comparator<int[]>() {
			@Override
			public int compare(int[]o1,int[]o2) {
				return o1[0]-o2[0];
			}
		});
		for(int x=1;x<platforme.length;x++) {
			int x1 = Integer.MAX_VALUE;
			int x2 = Integer.MAX_VALUE;
			for(int y=x-1;y>=0&&(x1==Integer.MAX_VALUE||x2 == Integer.MAX_VALUE);y--) {
				if(x1==Integer.MAX_VALUE&&platforme[x][1]>=platforme[y][1]&&platforme[x][1]<platforme[y][2]) {
				x1 = platforme[x][0] - platforme[y][0];
				}
				if(x2==Integer.MAX_VALUE&&platforme[x][2]>platforme[y][1]&&platforme[x][2]<=platforme[y][2]) {
					x2 = platforme[x][0] - platforme[y][0];
				}
			}
			count+=x1+x2;
		}
		System.out.println(count);
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
