import java.io.*;
import java.util.*;
public class Dimethylbenzene{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    public static void main(String[]args) throws IOException{
    	int n = readInt(), m = readInt(); for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
    	for(int i = 0; i < m; i++) {int u = readInt(), v = readInt(); adj.get(u).add(v); adj.get(v).add(u); }
    	for(int a = 1; a <= n; a++) {
    		for(int b : adj.get(a)) {
    			if(b == a) continue;
    			for(int c : adj.get(b)) {
    				if(c == a || c == b) continue;
    				for(int d : adj.get(c)) {
    					if(d == c || d == b || d == a) continue;
    					for(int e : adj.get(d)) {
    						if(e == d || e == c || e == b || e == a) continue;
    						for(int f: adj.get(e)) {
    							if(f == e || f == d || f == c || f == b || f == a) continue;
    							for(int j : adj.get(f)) {
    								if(j != f && j != e && j != d && j != c && j != b && j == a) {pw.println("YES"); pw.close(); return;}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	pw.println("NO"); pw.close();
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
