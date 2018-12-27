import java.util.*;
import java.io.*;
    public class BaramBe{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
	  public static void main(String[]args) throws IOException{
		  String s = readLine();
		  for(int i = 0; i < s.length(); i++) {
			  char c = s.charAt(i);
			  if(i < s.length() - 2 && Character.isUpperCase(s.charAt(i + 2))) pw.print(c + ".");
			  else pw.print(c);
		  }
		  pw.print(".");
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
