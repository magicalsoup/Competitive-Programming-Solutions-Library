import java.util.*;
import java.io.*;
    public class RewardReminiscence{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int t = readInt();
    	  while(t-- > 0) {
    		  int n = readInt(), bob = readInt(), index = 0;
    		  for(int i = 0; i < n - 1 ; i++) if(readInt() > bob) index++;
    		  pw.printf("Bob wins $%.2f at IOI!\n",Math.sqrt(n - index) * 100.0);
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
