import java.util.*;
public class ioi0022 {
	static int [] r;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	r = new int[n];
	for(int x=0;x<n;x++)
		r[x] = sc.nextInt();
	int[][] dp=  new int[k+1][n];
	int[][]prev = new int[k+1][n];
	for(int x=0;x<=k;x++)
		for(int y=0;y<n;y++)
			prev[x][y] = -1;
	
	for(int x=1;x<=k;x++) {
		for(int y=0;y<n;y++ ) {
			if(x>y) {
				dp[x][y] =0;
				prev[x][y] = y-1;
			}
			else {
				int next = Integer.MAX_VALUE;
				int nextprev =-1;
				if(x==1) {
					next =0;
					for(int z=0;z<y;z++)
						next+=r[y]-r[z];
				}
				else
					for(int z=y-1;z>=0;z--) {
						int a = dp[x-1][z]+cost(z,y);
						if(next >a) {
							next = a;
							nextprev= z;
						}
					}
				dp[x][y] = next;
				prev[x][y] = nextprev;
			}
		}
	}
	int min = Integer.MAX_VALUE;
	int minpos = -1;
	for(int x=0;x<n;x++) {
		int next = dp[k][x];
		for(int y=x+1;y<n;y++)
			next+=r[y]-r[x];
		if(next<min) {
			min = next;
			minpos = x;
		}
	}
	Stack<Integer> s = new Stack<Integer>();
	while(minpos!=-1) {
		s.push(r[minpos]);
		minpos = prev[k][minpos];
		k--;
	}
	System.out.println(min);
	for(int x = s.size();x>0;x--)
		System.out.print(s.pop()+" ");
}
public static int cost(int y,int z) {
	int cost =0;
	for(int x=y+1;x	<=z;x++) {
		cost+= Math.min(r[x]-r[y], r[z]-r[x]);
	}
	return cost;
}
}
