 import java.util.*;
 import java.io.*;
    public class redneck{
    	static HashMap<String,Integer>mp;
    	static ArrayList<LinkedList<Integer>>par;
    	static ArrayList<LinkedList<Integer>>kid;
    	static boolean[]v;
    	static boolean[]visited;
    	static int n;
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
      int t = readInt();
      while(t-->0) {
    	n = readInt();
    	mp = new HashMap<String,Integer>();
    	par = new ArrayList<LinkedList<Integer>>();
    	kid = new ArrayList<LinkedList<Integer>>();
    	v = new boolean[n+1];
    	visited = new boolean[n+1];
    	for(int i=0;i<=n;i++) {
    		par.add(new LinkedList<Integer>());
    		kid.add(new LinkedList<Integer>());
    		}
    	int cnt = 1;
    	for(int i=0;i<n;i++) {
    		String name = next();
    		if(!mp.containsKey(name))
    			mp.put(name, cnt++);
    		int num = readInt();
    		for(int j=0;j<num;j++) {
    			String fa = next();
    			if(!mp.containsKey(fa))
    				mp.put(fa,cnt++);
    			par.get(mp.get(name)).add(mp.get(fa));
    			kid.get(mp.get(fa)).add(mp.get(name));
    			}
    		}
    		if(isredneck(mp.get("Jim-Bob")))
    			out.println("Redneck");
    		else
    			out.println("Not a redneck");
      	}
      out.close();
    }
      public static boolean inloop(int idx,int id) {
    	  if(v[idx]&&idx==id)
    		  return true;
    	  else if(v[idx])
    		  return false;
    	  v[idx] = true;
    	  boolean ret = false;
    	  for(int i = 0;i<par.get(idx).size();i++) {
    		  ret |= inloop(par.get(idx).get(i),id);
    	  }
    	  return ret;
      }
      public static boolean isredneck(int idx) {
    	  if(visited[idx])
    		  return false;
    	  visited[idx] = true;
    	  for(int i=1;i<=n;i++)
    		  v[i] = false;
    	  if(inloop(idx,idx))
    		  return true;
    	  for(int i=0;i<par.get(idx).size();i++) {
    		  if(isredneck(par.get(idx).get(i)))
    			  return true;
    	  }
    	  for(int i=0;i<kid.get(idx).size();i++) {
    		  if(isredneck(kid.get(idx).get(i)))
    			  return true;
    	  }
    	  return false;
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
