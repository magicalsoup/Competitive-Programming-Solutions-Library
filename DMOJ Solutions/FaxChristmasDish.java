import java.util.*;
import java.io.*;
    public class FaxChristmasDish{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), d = readInt(), inDegree[] = new int[n + 1], outDegree[] = new int[n + 1]; Arrays.fill(inDegree, 1);
    	  for(int i = 0; i < m; i++) {
    		  int target = readInt(), k = readInt();
    		  inDegree[target] = k;
    		  for(int j = 0; j < k; j++) {
    			  int a = readInt();
    			  outDegree[a] = target;
    		  }
    	  }
    	  int ans = -1;
    	  for(int i = 1; i <= d; i++) {
    		  int pi = readInt();
    		  if(ans == -1 && inDegree[pi] != 0) {
    			  inDegree[pi] = 0;
    			  while(inDegree[pi] <= 0) {
    				  if(pi == 1) {ans = i; break;}
    				  if(inDegree[outDegree[pi]] <= 0) break;
    				  inDegree[outDegree[pi]]--;
    				  pi = outDegree[pi];
    			  }
    		  }
    	  }
    	  pw.print(ans); pw.close();
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
