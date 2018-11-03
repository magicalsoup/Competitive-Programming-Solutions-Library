import java.util.*;
 import java.io.*;
    public class SaveNagato{
      static InputReader br = new InputReader(System.in);
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int n, far, len, ans;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      public static void main(String[]args) throws IOException{
    	  n = br.readInt();
    	  for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 1; i < n; i++) { int a = br.readInt(), b = br.readInt(); adj.get(a).add(b); adj.get(b).add(a);}
    	  int dist1[] = new int[n + 1], dist2[] = new int[n + 1];
    	  bfs(1, dist1);
    	  int p1 = far; bfs(p1, dist1);
    	  int p2 = far; bfs(p2, dist2);
    	  for(int i = 1; i <= n; i++)
    		  pw.println(Math.max(dist1[i], dist2[i]) + 1);
    	  pw.close();
      }
      static void bfs(int st, int [] dist) {
    	  boolean [] vis = new boolean [n + 1]; LinkedList<Integer> queue = new LinkedList<Integer>();
    	  queue.add(st); vis[st] = true; 
    	  dist[st] = 0; len = 0;
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  if(dist[cur] > len) { len = dist[cur]; far = cur;}
    		  for(int e : adj.get(cur)) {
    			  if(!vis[e]) { queue.add(e); vis[e] = true; dist[e] = dist[cur] + 1;}
    		  }
    	  }
      }
      static class InputReader {
    		
    		public static void exitImmediately() {
    			pw.close();
    			System.exit(0);
    	  	}
    		private InputStream stream;
    		private byte[] buf = new byte[1<<10];
    		private int curChar;
    		private int numChars;

    		public InputReader(InputStream stream) {
    			this.stream = stream;
    		}

    		public int read() {
    			if (numChars == -1) {
    				exitImmediately();
    				throw new InputMismatchException();
    			}
    			if (curChar >= numChars) {
    				curChar = 0;
    				try {
    					numChars = stream.read(buf);
    				} catch (IOException e) {
    					throw new InputMismatchException();
    				}
    				if (numChars <= 0)
    					return -1;
    			}
    			return buf[curChar++];
    		}

    		public int readInt() {
    			int c = read();
    			while (isSpaceChar(c))
    				c = read();
    			int sgn = 1;
    			if (c == '-') {
    				sgn = -1;
    				c = read();
    			}
    			int res = 0;
    			do {
    				if (c < '0' || c > '9')
    					throw new InputMismatchException();
    				res *= 10;
    				res += c - '0';
    				c = read();
    			} while (!isSpaceChar(c));
    			return res * sgn;
    		}

    		public long readLong() {
    			int c = read();
    			while (isSpaceChar(c))
    				c = read();
    			int sgn = 1;
    			if (c == '-') {
    				sgn = -1;
    				c = read();
    			}
    			long res = 0;
    			do {
    				if (c < '0' || c > '9')
    					throw new InputMismatchException();
    				res *= 10;
    				res += c - '0';
    				c = read();
    			} while (!isSpaceChar(c));
    			return res * sgn;
    		}

    		public double readDouble() {
    			return Double.parseDouble(next());
    		}

    		public String readString() {
    			int c = read();
    			while (isSpaceChar(c))
    				c = read();
    			StringBuilder res = new StringBuilder();
    			do {
    				res.appendCodePoint(c);
    				c = read();
    			} while (!isSpaceChar(c));
    			return res.toString();
    		}

    		public boolean isSpaceChar(int c) {
    			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    				}
    			
    				public String next() {
    					return readString();
    				}
    	    	}
    	    }
  
