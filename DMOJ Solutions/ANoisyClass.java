import java.util.*;
public class ANoisyClass {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static boolean v[];
	static boolean flag = false;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		v = new boolean[n];
		for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>()); 
		for(int i = 0; i < m; i++) { 
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1; 
			if(!adj.get(a).contains(b)) adj.get(a).add(b);
		}
		for(int i = 0; i < n; i++) {
			Arrays.fill(v, false);
			flag = false;
			for(Integer x : adj.get(i)) dfs(x, i);
			if(flag) break;
		}
		System.out.println(flag ? "N" : "Y");
		sc.close();
	}
	static void dfs(int start, int dest) {
		if(v[start]) return;
		if(start == dest) { flag = true; return;};
		v[start] = true;
		for(Integer i : adj.get(start)) dfs(i, dest);
	}
}
