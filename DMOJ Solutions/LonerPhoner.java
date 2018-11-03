import java.util.*;
import java.io.*;
    public class LonerPhoner{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); 
    	  while(n-- > 0) {
    		  String s = next(); if(isPhoneNumber(s)) pw.println(format(s)); else pw.println("not a phone number");
    	  }
    	  pw.close();
      }
      static boolean isPhoneNumber(String s) {
    	  if(s.length() != 10) return false;
    	  if(s.substring(0, 3).equals("416")) return true;
    	  if(s.substring(0, 3).equals("647")) return true;
    	  return false;
      }
      static String format(String s) {
    	  String res = ""; res += "(" + s.substring(0, 3) + ")";
    	  res += "-"; res += s.substring(3, 6) + "-"; res += s.substring(6);
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
