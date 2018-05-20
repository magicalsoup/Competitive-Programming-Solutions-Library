import java.util.*;
import java.io.*;
public class coci081p5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static long[] compressedGrid;
	static int n;
	public static void main(String[]args) throws IOException{
		n = readInt();
		int r = readInt()-1;
		int c = readInt()-1;
		compressedGrid = new long[(n*n)/3+1];
		long[][] bestR = new long[n][4];
		long[][] bestC = new long[n][4];
		int amt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				long now = readInt();
				int index = (i*n+j)/3;
				int offset = (i*n+j)%3;
				compressedGrid[index] |= now<<(20*offset);
			}
		}
		br.close();
		br=  null;
		st  = null;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(get(i,j)>get(r,c)) {
					amt++;
				}
			}
		}
		long[] order = new long[amt];
		int index =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(get(i,j)>get(r,c)) {
					order[index++] = pack(i,j,get(i,j));
				}
			}
		}
		bestR[r][3]=  pack(r,c,1);
		bestC[c][3]=  pack(r,c,1);
		Arrays.sort(order);
		int ret = 1;
		for(long temptemp:order) {
			int[]temp = unpack(temptemp);
			int currR = temp[0];
			int currC = temp[1];
			int val =0;
		for(int dx = -1;dx<=1;dx+=2) {
			int row = currR+dx;
			if(row>=0&&row<n) {
				for(long out2:bestR[row]) {
					int[] other = unpack(out2);
					if(other[2]==0)continue;
					int out2R = other[0];
					int out2C=  other[1];
					if(Math.abs(out2C-currC)>1&&get(currR,currC)>get(out2R,out2C)) {
						val = Math.max(val, 1+other[2]);
					}
				}
			}
			int col=  currC+dx;
			if(col>=0&&col<n) {
				for(long out2:bestC[col]) {
					int[] other = unpack(out2);
					if(other[2]==0)continue;
					int out2R = other[0];
					int out2C=  other[1];
					if(Math.abs(out2R-currR)>1&&get(currR,currC)>get(out2R,out2C)) {
						val = Math.max(val, 1+other[2]);
					}
				}
			}
		}
		if(val>0) {
			ret = Math.max(ret, val);
			long cand=  pack(currR,currC,val);
			if(cand>bestR[currR][0]) {
				bestR[currR][0] = cand;
				Arrays.sort(bestR[currR]);
			}
			if(cand>bestC[currC][0]) {
				bestC[currC][0] = cand;
				Arrays.sort(bestC[currC]);
			}
		}
		}
		System.out.println(ret);
	}
	public static int get(int r,int c) {
		int start = (r*n+c);
		int index = start/3;
		int offset = start%3;
		long val = compressedGrid[index];
		val>>=20*offset;
			return(int)((val)&MASK);
	}
	static final int MASK = -1+(1<<20);
	public static int[] unpack(long x) {
		int[]ret = new int[3];
		ret[1] = (int)(x&(-1+(1<<15)));
		x>>=15;
		ret[0]=  (int)(x&(-1+(1<<15)));
		x>>=15;
		ret[2] = (int)x;
		return ret;
	}
	public static long pack(int r,int c,int f) {
		long ret =0 ;
		ret|=((long)c);
		ret|=((long)r)<<15;
		ret|=((long)f)<<30;
		return ret;
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
