import java.util.*;

import java.io.*;
public class smac082p5{

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  static StringTokenizer st;
  public static void main (String[] args) throws IOException {
   int n = readInt();
   String[]left = new String[n];
   String[] right = new String[n];
   Map<String,Integer>map = new HashMap<String,Integer>();
   for(int i=0;i<n;i++) {
	   left[i] = next();
	   right[i] = next();
	   if(!map.containsKey(left[i])) {
		   map.put(left[i], map.size());
	   }
	   if(!map.containsKey(right[i])) {
		   map.put(right[i], map.size());
	   }
   }
   @SuppressWarnings("unchecked")
ArrayList<Integer>[] edges = new ArrayList[map.size()];
   for(int i=0;i<edges.length;i++) {
	   edges[i] = new ArrayList<Integer>();
   }
   for(int i=0;i<n;i++) {
	   edges[map.get(left[i])].add(map.get(right[i]));
   }
   pw.println(map.size());
   boolean[] seen = new boolean[map.size()];
   LinkedList<Integer>q = new LinkedList<Integer>();
   for(String out:map.keySet()) {
	   int index = map.get(out);
	   int ret = -1;
	   Arrays.fill(seen, false);
	   seen[index] = true;
	   q.add(index);
	   while(!q.isEmpty()) {
		   int curr = q.removeFirst();
		   ret++;
		   for(int out2:edges[curr]) {
			   if(!seen[out2]) {
				   seen[out2] =true;
				   q.add(out2);
			   }
		   }
	   }
	   pw.println(out+" "+ret);
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

  static char readCharacter () throws IOException {
    return next().charAt(0);
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }
}
