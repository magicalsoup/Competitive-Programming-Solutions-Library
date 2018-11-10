import java.util.*;
import java.io.*;
    public class dwite10c1p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  String line[] = next().split(""); int index = 0; 
    		  for(int i = 0; i < line.length; i++) if(line[i].equals("*")){index = i; break;}
    		  for(int i = 0; i < 5; i++) {
    			  char c = next().charAt(0);
    			  if(c == 'R') {
    				  if(index + 1 < 5) { line[index + 1] = "*"; line[index] = "."; index++;}
    			  }
    			  else {
    				  if(index - 1 >= 0) { line[index - 1] = "*"; line[index] = "."; index--;}
    			  }
    		  }
    		  for(String s : line) pw.print(s); pw.println();
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
