import java.util.*;
import java.io.*;
    public class ccc09s2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int r = readInt(), l = readInt(); String lights[] = new String[r];
    	  for(int i = 0; i < r; i++)  lights[i] = readLine().replaceAll(" ", "");
    	  Set<String> set = new HashSet<String>();
    	  for(int i = 0; i < r; i++) {
    		  String res = lights[i];
    		  for(int j = i + 1; j < r; j++) res = pushButton(res, lights[j]);
    		  set.add(res);
    	  }
    	  pw.println(set.size()); pw.close();
      }	
      static String pushButton(String a, String b) {
    	  String res = "";
    	  for(int i = 0; i < a.length(); i++) {
    		  	if(a.charAt(i) == b.charAt(i)) res += 0;
    		  	else res += 1;
    	  }
    	  return res;
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
