import java.util.*;
import java.io.*;
public class Sorting2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;	
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), k = readInt(); ArrayList<ArrayList<Integer>> p = new ArrayList<ArrayList<Integer>>(); 
    	  ArrayList<Integer> a = new ArrayList<Integer>();
    	  for(int i = 0 ; i < n; i++) p.add(new ArrayList<Integer>());
    	  for(int i = 0; i < n; i++) p.get(i % k).add(readInt());
    	  for(int i = 0; i < k; i++) Collections.sort(p.get(i));
    	  for(int i = 0; i < n; i++) a.add(p.get(i % k).get(i / k));
    	  for(int i = 0; i < n - 1; i++) {
    		  if(a.get(i) < a.get(i + 1)) continue;
    		  else { pw.println("NO"); pw.close(); return;}
    	  }
    	  pw.print("YES"); pw.close();
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
