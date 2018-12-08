import java.util.*;
import java.io.*;
    public class ecoo13r1p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int index = readInt(), late = 0, stu = 0;
    	  while(true) {
    		  String in = next(); if(in.equals("EOF")) break;
    		  if(index > 999) index = 1;
    		  if(in.equals("TAKE")) {index++; late++;}
    		  if(in.equals("SERVE")) stu++;
    		  if(in.equals("CLOSE")) { pw.println(late + " " + (late - stu) + " " + index); late = 0; stu = 0;}
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
