import java.io.*;
import java.util.*;
public class ncco4d1p3{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
    static long dist[][];
    public static void main(String[]args) throws IOException{
    	InputReader ir = new InputReader(System.in);
    	int n = ir.readInt(), m = ir.readInt(); dist = new long[n + 1][2];
    	for(int i = 0; i <= n; i++) adj.add(new ArrayList<Edge>()); 
    	for(int i = 0; i <= n; i++) Arrays.fill(dist[i], 0x3f3f3f3f);
    	for(int i = 0; i < m; i++){
    		int u = ir.readInt(), v = ir.readInt(), w = ir.readInt(); adj.get(u).add(new Edge(v, w)); adj.get(v).add(new Edge(u, w));
    	}
    	dijkstras(1); pw.println(dist[n][1]); pw.close();
    }
    static void dijkstras(int src){
    	PriorityQueue<Edge> q = new PriorityQueue<Edge>();
    	q.add(new Edge(src, 0));
    	while(!q.isEmpty()) {
    		Edge u = q.poll();
    		//if(u.weight > dist[u.dest][0]) continue;
    		for(Edge e: adj.get(u.dest)) {
    			if(dist[e.dest][0] > e.weight + u.weight) {
    				dist[e.dest][1] = dist[e.dest][0];
    				dist[e.dest][0] = e.weight + u.weight;	
    				q.add(new Edge(e.dest, e.weight + u.weight));
    			}
    			else if(dist[e.dest][0] != e.weight + u.weight && dist[e.dest][1] > e.weight + u.weight) {
    				dist[e.dest][1] = e.weight + u.weight;
    				q.add(new Edge(e.dest, e.weight + u.weight));
    			}
    		}
    	}
    }
    static class Edge implements Comparable<Edge>{
    	int dest; long weight;
    	public Edge(int dest, long weight) {
    		this.dest = dest;
    		this.weight = weight;
    	}
    	public int compareTo(Edge a){
    		return Long.compare(weight, a.weight);
    	}
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
