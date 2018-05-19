import java.util.*;
	public class clique {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int m = sc.nextInt();
		int[][]adj = new int[n][n];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj[a][b] = adj[b][a] = 1;
		}
		int sza = n/2;
		int szb = n - n/2;
		int a[] = new int[1<<sza];
		for(int i=1;i<1<<sza;i++) {
			boolean valid = true;
			for(int j=0;j<sza;j++)
				for(int k = j+1;k<sza;k++) {
					if((i&1<<j)>0&&(i&1<<k)>0&&adj[j][k]==0)
						valid = false;
				}
			if(valid) {
				int cnt = 0;
				for(int j=0;j<sza;j++)
					if((i&1<<j)>0)
						cnt++;
				a[i] = cnt;
			}
			else {
				for(int j=0;j<sza;j++) {
					if((i&1<<j)>0)
						a[i] = Math.max(a[i], a[i^1<<j]);
				}
			}
		}
		int max = 0;
		for(int i=1;i<1<<szb;i++) {
			boolean valid = true;
			for(int j=0;j<szb;j++)
				for(int k=j+1;k<szb;k++) {
					if((i&1<<j)>0&&(i&1<<k)>0&&adj[j+sza][k+sza]==0)
						valid = false;
				}
			if(valid) {
				int cnt = 0;
				int bit =(1<<sza)-1;
				for(int j=0;j<szb;j++) {
					if((i&1<<j)>0) {
						cnt++;
						for(int k=0;k<sza;k++) {
							if(adj[j+sza][k]==0)
								bit = bit&~(1<<k);
						}
					}
				}
				max = Math.max(max, cnt+a[bit]);
			}
		}
		System.out.println(max);
	}
}
