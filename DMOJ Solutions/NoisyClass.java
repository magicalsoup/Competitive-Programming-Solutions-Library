import java.util.*;
public class NoisyClass {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static boolean v[];
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static boolean flag = false;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++)
			adj.add(new ArrayList<Integer>());
		v = new boolean[n + 1];
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(!adj.get(a).contains(b))
				adj.get(a).add(b);
		}
		for(int i = 0; i < adj.size(); i++)
			Collections.sort(adj.get(i));
		
		for(int i = 0; i < n; i++){
			Arrays.fill(v, false);
			flag= false;
			for(int x : adj.get(i))
				dfs(x,i);
			if(flag) break;
		}
		
		System.out.println(flag? "N":"Y");
		sc.close();
	}
	static void dfs(int curr, int start){
		if(v[curr]) return;
		if(curr == start){
			flag = true;
			return;
		}
		v[curr] = true;
		for(int i : adj.get(curr))
			dfs(i, start);
	}
}
