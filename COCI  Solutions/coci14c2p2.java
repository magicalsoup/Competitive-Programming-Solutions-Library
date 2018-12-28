import java.util.*;
import java.io.*;
    public class coci14c2p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); Map<String, Integer> mp = new HashMap<String, Integer>(); ArrayList<String> list = new ArrayList<String>();
    	  for(int i = 0; i < n; i++) {
    		  String s = next(); list.add(s);
    		  if(mp.containsKey(s)) mp.put(s, mp.get(s) + 1);
    		  else mp.put(s, 1);
    	  }
    	  for(int i = 0; i < n - 1; i++) {String s = next(); mp.put(s, mp.get(s) - 1);}
    	  for(String i : list) if(mp.get(i) == 1){ pw.println(i); break;} pw.close();
    	  
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
