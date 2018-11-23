import java.io.*;
import java.util.*;
public class dwite11c2p5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static HashMap<String, Integer> mp;
	public static void main(String[]args) throws IOException{
		for(int t = 0; t < 5; t++) {
			int n = readInt();
			mp = new HashMap<>();
			DUS tree = new DUS(100000); boolean vis[] = new boolean[100000];
			for(int i = 0; i < n; i++) {
				char c = next().charAt(0); int nodeA = getNode(next()), nodeB = getNode(next());
				if(c == 'p') {
					tree.union(nodeA, nodeB);
					vis[nodeA] = true; vis[nodeB] = true;
				}
				else {
					boolean con = tree.find(nodeA) == tree.find(nodeB);
					pw.println(con ? "connected" : "not connected");
				}
			}
		}
		pw.close();
	}
	static int getNode(String name) {
		if(!mp.containsKey(name)) mp.put(name, mp.size());
		return mp.get(name);
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
	static class DUS {
		public Node[] nodes;
		public DUS(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++)
				nodes[i] = new Node();
		}
		public Node find(int i) {
			Node node = nodes[i];
			if (node.parent == node)
				return node;
			else {
				Node temp = node;
				while (temp.parent != temp)
					temp = temp.parent;
				node.parent = temp;  // Path compression
				return temp;
			}
		}
		public void union(int i, int j) {
			Node x = find(i);
			Node y = find(j);
			if (x == y)
				return;
			else if (x.rank < y.rank)
				x.parent = y;
			else if (x.rank > y.rank)
				y.parent = x;
			else {
				x.parent = y;
				y.rank++;
			}
		}
	}
	static class Node{
		public Node parent;
		public int rank;
		public Node() {parent = this; rank = 0;}
	}
}
