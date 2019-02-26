import java.util.*;
import java.io.*;
public class LongestPath {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	public static void main(String[]args) throws IOException{
		int n = readInt(), m = readInt();
		for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
		for(int i = 0; i < m; i++)
			adj.get(readInt() - 1).add(readInt() - 1);
		
		System.out.println(solve(n));
	}
	static void topsort(int x, Stack<Integer> st, boolean vis[]) {
		vis[x] = true;
		for(int u : adj.get(x))
			if(!vis[u]) topsort(u, st, vis);
		st.push(x);
	}
	static int solve(int n) {
		Stack<Integer> st = new Stack<Integer>();
		boolean vis[] = new boolean[n];
		for(int i = 0; i < n; i++)
			if(!vis[i]) topsort(i, st, vis);
		
		int dp[] = new int[n];
		while(!st.isEmpty()) {
			int next = st.pop();
			for(int x : adj.get(next))
				dp[x] = Math.max(dp[x], dp[next] + 1);
		}
		int max = 0;
		for(int i = 0; i < dp.length; i++)
			max = Math.max(max, dp[i]);
		return max;
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
}
