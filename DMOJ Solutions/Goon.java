import java.util.*;
import java.io.*;
    public class Goon{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s[] = next().split("-"); String s2 = s[0] + s[1] + s[2]; String s3[] = s2.split("");
    	  int a = 0, b = 0, c = 0;
    	  for(int i = 0; i < 3; i++) a += Integer.parseInt(s3[i]);
    	  for(int i = 3; i < 6; i++) b += Integer.parseInt(s3[i]);
    	  for(int i = 6; i < 10; i++) c += Integer.parseInt(s3[i]);
    	  pw.println(a == b && b == c? "Goony!" : "Pick up the phone!"); pw.close();
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
