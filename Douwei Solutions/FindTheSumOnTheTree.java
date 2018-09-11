import java.util.*;
public class FindTheSumOnTheTree {
	static ArrayList<ArrayList<Integer>> adj;
	static int [][] dp;
	static int [] coins;
	
	static int dfs(int n , int take, int parent){
		if(dp[n][take] != -1)
			return dp[n][take];
		
		int maxsum = 0;
		int dontsum = 0;
		
		for(int i =0 ; i<adj.get(n).size();i++){
			if(adj.get(n).get(i) != parent) 
				dontsum += dfs(adj.get(n).get(i),1,n);
		}
		if(take==1){
			for(int i =0 ; i<adj.get(n).size();i++){
				if(adj.get(n).get(i)!=parent) 
					maxsum += dfs(adj.get(n).get(i), 0 ,n);
			}
			maxsum +=coins[n];
		}
		maxsum = Math.max(maxsum, dontsum);
		dp[n][take] = maxsum;
		return maxsum;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		adj = new ArrayList<>();
		dp = new int[n][2];
		coins = new int[n];
		
		for(int i = 0;i<n;i++){
			adj.add(new ArrayList<Integer>());
		}
		for(int i = 0; i<n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
		}
	}
}
