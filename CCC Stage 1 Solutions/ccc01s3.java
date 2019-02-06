import java.io.*;
import java.util.*;
public class ccc01s3 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
  static StringTokenizer st;
  static Map<Character, Integer> mp = new HashMap<Character, Integer>();
  static boolean adj[][] = new boolean[100][100];
  public static void main (String[] args) throws IOException {
	  ArrayList<String> nodes = new ArrayList<String>(), ans = new ArrayList<String>(); 
	  for(char i = 'A'; i <= 'Z'; i++) mp.put(i, mp.size());
	  while(true) {
		  String str = next();
		  if(str.equals("**")) break;
		  char a = str.charAt(0), b = str.charAt(1);
		  int u = nodeId(a), v = nodeId(b);
		  adj[u][v] = true;
		  adj[v][u] = true;
		  nodes.add(str);
	  }
	  for(String i : nodes) {
		  int a = nodeId(i.charAt(0)), b = nodeId(i.charAt(1));
		  adj[a][b] = false;
		  adj[b][a] = false;
		  if(bfs(nodeId('A'), nodeId('B')) == false)
			  ans.add(i);
		  adj[a][b] = true;
		  adj[b][a] = true;
	  }
	  for(String i : ans)
		  pw.println(i);
	  pw.println("There are " + ans.size() + " disconnecting roads.");
	  pw.close();
  }
  static boolean bfs(int s, int e) {
	  LinkedList<Integer> q = new LinkedList<Integer>();
	  boolean vis[][] = new boolean[100][100];
	  q.add(s);
	  while(!q.isEmpty()) {
		  int cur = q.poll();
		  for(int i = 0; i < adj[cur].length; i++) {
			  if(adj[cur][i] && !vis[cur][i]) {
				  q.add(i);
				  vis[cur][i] = true;
				  if(i == e || cur == e) return true;
			  }
		  }
	  }
	  return false;
  }
  static int nodeId(char c) {
	  if(!mp.containsKey(c))
		  mp.put(c, mp.size());
	  return mp.get(c);
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
