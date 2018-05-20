import java.util.*;
public class ccc10s2p4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int T= sc.nextInt();
	int N = sc.nextInt();
	int[][]value = new int[T][3001];
	for(int i =0;i<N;i++)
	{
		int c = sc.nextInt();
		int v = sc.nextInt();
		int t = sc.nextInt()-1;
		value[t][c] = Math.max(value[t][c], v);
	}
	int b = sc.nextInt();
	sc.close();
	for(int t=0;t<T;t++)
		for(int i=1;i<=b;i++)
			value[t][i] = Math.max(value[t][i], value[t][i-1]);
	int[]best = new int[b+1];
	for(int t=0;t<T;t++)
		if(t==0)
			for(int i=1;i<=b;i++)
				best[i]=  value[0][i];
		else
		{
			int[] next = new int[b+1];
			for(int i=1;i<b;i++)
				for(int j =1;i+j<=b;j++)
					next[i+j] = Math.max(next[i+j], best[i]+value[t][j]);
			best = next;
		}
	System.out.println(best[b]);
}
}
