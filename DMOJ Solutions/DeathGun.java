import java.util.*;
import java.io.*;
    public class DeathGun{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int m = readInt(); int inDegree[] = new int[2 * m]; int key = 0; String names[] = new String[2 * m];
    	  HashMap<String, Integer> map = new HashMap<String, Integer>(); ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    	  for(int i = 0; i < 2 * m; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 0; i < m; i++) {
    		  String a = next(), b = next();
    		  if(!map.containsKey(a)) {map.put(a, key); names[key] = a; key++;}
    		  if(!map.containsKey(b)) {map.put(b, key); names[key] = b; key++;}
    		  adj.get(map.get(b)).add(map.get(a)); inDegree[map.get(a)]++;
    		  
    	  }
    	  while(true) {
    		  int id = -1;
    		  for(int i = 0; i < key; i++)
    			  if(inDegree[i] == 0) {inDegree[i]--; id = i; break;}
    		  if(id == -1) break;
    		  pw.println(names[id]); for(int v : adj.get(id)) inDegree[v]--;
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
