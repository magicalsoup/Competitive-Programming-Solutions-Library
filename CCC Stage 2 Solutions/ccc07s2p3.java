import java.util.*;
public class ccc07s2p3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int c =0;c<T;c++) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int W = sc.nextInt();
		int[] scores = new int[N];
		int[] sum = new int[N+W];;
		for(int i=0;i<N+W;i++)
		{
			if(i<N)
			{
				scores[i] = sc.nextInt();
				sum[i] = scores[i];
			}
			if(i>0)
				sum[i] +=sum[i-1];
		}
		int[][] max =new int[K+1][N+W];
		for(int i=1;i<=K;i++)
			for(int j=0;j<N+W;j++)
			{
				max[i][j] = sum[j];
				if(j-W>=0)
					max[i][j]+=max[i-1][j-W]-sum[j-W];
				if(i>=2)
					for(int k=1;k<W;k++)
					{
						int x = sum[j];
						if(j-W-k>=0)
							x+=max[i-2][j-W-k]-sum[j-W-k];
						if(x>max[i][j])
							max[i][j] = x;
					}
				if(j>0&&max[i][j-1]>max[i][j])	
					max[i][j]=max[i][j-1];
				if(max[i][j]<0)
					max[i][j]=0;
			}
		System.out.println(max[K][N+W-1]);
	}
}
}
