	import java.util.*;
	import java.io.*;
	    public class coci17c1p1{
	      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	      static StringTokenizer st;
	      public static void main(String[]args) throws IOException{
	    	  int n = readInt(), cards[] = new int[14], sum = 0;
	    	  for(int i = 0; i < cards.length; i++) cards[i] = 4;
	    	  for(int i = 0; i < n; i++) { int x = readInt(); sum += x; cards[x]--;}
	    	  int difference = 21 - sum, greater = 0, less = 0;
	    	  for(int i = 0; i < cards.length; i++) {
	    		  if(i >= difference) greater += cards[i];
	    		  else less += cards[i];
	    	  }
	    	  if(greater >= less) pw.println("DOSTA");
	    	  else pw.println("VUCI"); pw.close();
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
