import java.util.*;
import java.io.*;
    public class MolecularOrNonMolecular{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt();
    	  while(n-- > 0) {
    		  String a[] = readLine().split(" "); boolean m = true;
    		  for(int i = 0; i < a.length; i++) { if(m == false) break; m = check(a[i]);}
    		  pw.println(m? "Molecular!" : "Not molecular!");
    	  }
    	  pw.close();
      }
      static boolean check(String s) {
    	  String molecular = "ClBrXeKrSiAsRnNeHeHCNOFPSI";
    	  if(molecular.contains(s)) return true;
    	  return false;
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
