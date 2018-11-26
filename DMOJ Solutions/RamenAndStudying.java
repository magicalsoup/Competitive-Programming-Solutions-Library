import java.util.*;
import java.io.*;
    public class RamenAndStudying{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int c = readInt(), n = readInt(), cnt = 0, cnt2 = 0;
    	  for(int i = 0; i < c; i++) {
    		  String s = next();
    		  if(s.equals("TOK")) cnt += 1;
    		  else if(s.equals("English")) cnt += 2;
    		  else if(s.equals("Chemistry")) cnt += 3;
    		  else cnt += 4;
    		  if(cnt <= n) cnt2++;
    	  }
    	  if(cnt <= n) pw.println("YEA BOI");
    	  else { pw.println("Go to Metro"); pw.println(cnt2);}
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
