import java.util.*;
 import java.io.*;
    public class coci072p4{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int [] bit = new int	[100001];
      public static void main(String[]args) throws IOException{
      int n = readInt();
      int []p = new int[n+1];
      for(int x=1;x<=n;x++) {
    	  p[readInt()] = x;
    	  update(x,1);
      }
      int lo = 1;
      int hi = n;
      for(int x=1;x<=n;x++) {
    	if(x%2==1) {
    		update(p[lo],-1);
    		out.println(query(p[lo])-query(0));
    		lo++;
    		}
    	else {
    		update(p[hi],-1);
    		out.println(query(n)-query(p[hi]-1));
    		hi--;
    		}
      	}
      out.close();
      }
      static int query(int X) {
    	  int res = 0;
    	  for(int x=X;x>0;x-=(x&-x))
    		  res+=bit[x];
    	  return res;
      }
      static void update(int X,int v) {
    	  for(int x=X;x<100001;x+=(x&-x))
    		  bit[x]+=v;
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
