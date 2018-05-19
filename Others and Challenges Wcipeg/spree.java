import java.util.*;
public class spree{
	public static int code(int val[],int wt[], int w) {
		int n = wt.length;
		int[][]v = new int[n+1][w+1];
		for(int col =0;col<=w;col++) {
			v[0][col] =0;
		}
		for(int row= 0;row<=n;row++) {
			v[row][0] = 0;
		}
		for(int item = 1;item<=n;item++) {
			for(int weight = 1;weight<=w;weight++) {
				if(wt[item-1]<=weight) {
					v[item][weight] = Math.max(val[item-1]+v[item-1][weight-wt[item-1]],v[item-1][weight]);
				}
				else {
					v[item][weight] = v[item-1][weight];
				}
			}
		}
		return v[n][w];
	}
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int w = sc.nextInt();
	int[]val = new int[n];
	int []wt = new int[n];
	for(int i=0;i<n;i++) {
		val[i] = sc.nextInt();
		wt[i] = sc.nextInt();
	}
	System.out.println(code(val,wt,w));
}
}
