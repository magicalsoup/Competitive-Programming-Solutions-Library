import java.util.*;
public class ccc07s4{
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static int dp[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); dp = new int[n + 1];
		for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
		while(true) {
			int x = sc.nextInt(), y = sc.nextInt();
			if(x == 0 && y == 0) break;
			adj.get(x).add(y);
		}
		dp[1] = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < adj.get(i).size(); j++) {
				int next = adj.get(i).get(j);
				dp[next] += dp[i];
			}
		}
		System.out.println(dp[n]);
		sc.close();
	}
}
