import java.util.*;
public class acmtryouts2b {
static int find(long[]arr,long x)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>=x)return i;
	}
	return arr.length;
}
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) {
		int l = sc.nextInt();
		int n = sc.nextInt();
		long[]dmg = new long[l];
		for(int i=0;i<n;i++)
		{
			int c = sc.nextInt()-1;
			int r = sc.nextInt();
			int d = sc.nextInt();
			for(int j=Math.max(0, c-r);j<=Math.min(c+r, l-1);j++)
				dmg[j]+=d;
		}
			long curr[] = new long[l];
			curr[0] = dmg[0];
			for(int i=1;i<l;i++)
				curr[i] =curr[i-1]+dmg[i];
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				int h = sc.nextInt();
				int x = find(curr,h);
				if(x==l)
					System.out.println("Bloon leakage");
				else
					System.out.println(x+1);
			}
	}
}
}
