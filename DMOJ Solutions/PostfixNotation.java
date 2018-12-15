import java.util.*;
import java.io.*;
public class PostfixNotation{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;	
      public static void main(String[]args) throws IOException{
    	  StringTokenizer st = new StringTokenizer(readLine().trim());
    	  Stack<Double> s = new Stack<Double>();
    	  while(st.hasMoreTokens()) {
    		  String n = st.nextToken();
    		  if(n.equals("+")) s.push(s.pop() + s.pop());
    		  else if(n.equals("-")) s.push(-s.pop() + s.pop());
    		  else if(n.equals("/")) s.push(1 / s.pop() * s.pop());
    		  else if(n.equals("*")) s.push(s.pop() * s.pop());
    		  else if(n.equals("%")) s.push(s.pop() % s.pop());
    		  else if(n.equals("^")) s.push(Math.pow(s.pop(), s.pop()));
    		  else s.push(Double.parseDouble(n));
    	  }
    	  pw.println(s.pop()); pw.close();
      }
      static double solve(double a, double b, char op) {
    	  if(op == '+') return a + b;
    	  if(op == '-') return a - b;
    	  if(op == '/') return 1 / a * b;
    	  if(op == '%') return a % b;
    	  if(op == '*') return a * b;
    	  if(op == '^') return Math.pow(a, b);
    	  return 0;
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
