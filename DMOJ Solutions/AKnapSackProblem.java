import java.util.*;
public class AKnapSackProblem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		item[] items = new item[5001]; // maximum amount is 5000, so set the boundary to 5001
		truck[] trucks = new truck[5001]; // same thing as above
		for(int i = 0; i < n; i++)
			items[i] = new item(sc.nextInt(),sc.nextInt(),sc.nextInt());
		long dp[][] = new long[2][5001]; // the j index will keep track of the capacity
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 5001; j++) {
				long num = 0; // num of items
				while(j >= num * items[i].volume && num <= items[i].num) {
					if(dp[(i % 2 + 1) % 2][(int)(j - num * items[i].volume)] + num * items[i].profit > dp[i % 2][j]) {
						dp[i % 2][j] = dp[(i % 2 + 1) % 2][(int)(j - num * items[i].volume)] + num * items[i].profit;
					}
					num++;
				}
			}
		}
		/*for(int i = 0; i < n; i++) {
			for(int j = 0; j < 5001; j++)
				if(dp[i % 2][j]!=0)
					System.out.print(dp[i % 2][j]+ " ");
		}*/
		long ans = Long.MIN_VALUE;
		for(int i = 0; i < m; i++)
			trucks[i] = new truck(sc.nextInt(),sc.nextInt());
		
		for(int i = 0; i <m; i++) {
			if(dp[(n - 1) % 2][trucks[i].capacity] - trucks[i].fuelCost > ans) // find the maximum profit from the profit - the refuel cost
				ans = dp[(n - 1) % 2][trucks[i].capacity] - trucks[i].fuelCost;
				//ans = dp[n-1][trucks[i].c] - trucks[i].f;
		}
		System.out.println(ans);
		sc.close();
	}
	static class item{
		int num; // number of items
		int volume; // volume of the item
		int profit; // profit of the item
		public item(int n, int v, int p) {
			this.num = n;
			this.volume = v;
			this.profit = p;
		}
	}
	static class truck{
		int capacity; // capacity
		int fuelCost; // refuel cost
		public truck(int c, int f) {
			this.capacity = c;
			this.fuelCost = f;
		}
	}
}
