import java.io.*;
import java.util.*;
public class ccc12j5{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[]args) throws IOException{
		int n;
		while((n = readInt())!=0) {
			int[] coins = new int[n];
			for(int i=0;i<n;i++) {
				coins[readInt()-1] = i;
			}
			int start =0;
			int end =0;
			for(int i=0;i<n;i++) {
				start |= coins[i]<<(3*i);
				end |= i<<(3*i);
			}
			byte[] moves = new byte[1<<24];
			for(int i=0;i<(1<<24);i++) {
				moves[i] = Byte.MAX_VALUE;
			}
			moves[start] =0;
			Queue<Integer>q = new ArrayDeque<Integer>();
			q.offer(start);
			while(!q.isEmpty()) {
				int c =q.poll();
				int[]stack = new int[n];
				for(int i=0;i<n;i++) {
					stack[i] = Integer.MAX_VALUE;
				}
				for(int i=n-1;i>=0;i--) {
					stack[(c>>(3*i))%8]=i;
				}
				for(int i=0;i<n-1;i++) {
					for(int j=0;j<2;j++) {
						if(stack[i+j]<stack[i-j+1]) {
							int next = c&~(7<<(3*stack[i+j]))|(i-j+1)<<(3*stack[i+j]);
							if(moves[c]+1<moves[next]) {
								moves[next]= (byte)(moves[c]+1);
								q.offer(next);
							}
						}
					}
				}
			}
			if(moves[end]==Byte.MAX_VALUE) out.println("IMPOSSIBLE");
			else out.println(moves[end]);
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
