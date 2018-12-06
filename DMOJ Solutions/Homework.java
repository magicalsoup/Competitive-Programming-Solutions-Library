import java.util.*;
import java.io.*;
    public class Homework{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int t = readInt();
    	  for(int test = 1; test <= t; test++) {
    		  int a = readInt(), b = readInt(), k = readInt(), cnt[] = new int[b + 1], ans = 0; boolean prime[] = new boolean[b + 1]; 
    		  for(int x = 2; x <= b; x++) {
    			  if(!prime[x]) {
    				  cnt[x]++;
    				  for(int y = x * 2; y <= b; y += x) { prime[y] = true; cnt[y]++;}
    			  }
    		  }
    		  for(int x = a; x <= b; x++) {if(cnt[x] == k) ans++;}
    		  pw.println("Case #" + test + ": " + ans);
    	  }
    	  pw.close();
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
