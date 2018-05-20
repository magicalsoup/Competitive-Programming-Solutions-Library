import java.io.*;
import java.util.*;

public class graph3p1 {
  
  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  
  static int N, M, a, b, K, loc, ans = 0;
  static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
  static Queue<Location> q = new LinkedList<Location>();
  static boolean [] visited = new boolean[100001];
  
	public static void main (String[] args) throws IOException {
	   br = new BufferedReader(new InputStreamReader(System.in));
	   out = new PrintWriter(new OutputStreamWriter(System.out));
   	         N = readInt();
		 M = readInt();
		
		for (int i=0; i<N; i++)
			al.add(new ArrayList<Integer>());
		for (int i=0; i<M; i++) {
			 a = readInt() - 1;
			 b = readInt() - 1;
			al.get(a).add(b);
			al.get(b).add(a);
		}
		K = readInt();		
		for (int i=0; i<K; i++) {
			loc = readInt() - 1;
			visited[loc] = true;
			q.offer(new Location(0, loc));
		}
		while (!q.isEmpty()) {
			Location curr = q.poll();
			ans = Math.max(ans, curr.time);
			for (Integer adj : al.get(curr.idx)) {
				if (visited[adj])	continue;
				visited[adj] = true;
				q.offer(new Location(curr.time + 1, adj));
			}
		}
		System.out.println(ans);
	}

	public static class Location {
		int idx, time;
		Location (int a, int b) {
			this.time = a;
			this.idx = b;
		}
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
