import java.util.*;
import java.io.*;
public class StringFindingHard{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      public static void main(String[]args) throws IOException{
    	  String a = next(), b = next(); pw.println(KMP(b, a)); pw.close();
      }
      static int KMP(String a, String b) {
    	  int m = a.length(), n = b.length(), lps[] = new int[m], j = 0, i = 0;
    	  computeLps(a, m, lps);
    	  while(i < n) {
    		  if(a.charAt(j) == b.charAt(i)) {j++; i++;}
    		  if(j == m) return i - j;
    		  else if(i < n && a.charAt(j) != b.charAt(i)) {if(j != 0) j = lps[j - 1]; else i++;}
    	  }
    	  return -1;
      }
      static void computeLps(String s, int m, int lps[]) {
    	  int len = 0, i = 1; lps[0] = 0;
    	  while(i < m) {
    		  if(s.charAt(i) == s.charAt(len)) {len++; lps[i] = len; i++;}
    		  else {
    			  if(len != 0) len = lps[len - 1];
    			  else {lps[i] = len; i++;}
    		  }
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
}
