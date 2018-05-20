import java.util.*;
public class ccc07s4{
	static int n;
	static int [] paths;
	static int numpaths =0;
	static int[] startingpts;
	static int[] endingpts;
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	paths = new int[n+1];
	for(int i=0;i<n+1;i++)
		paths[i] = -1;
	numpaths =0;
	int x = scan.nextInt();
	int y = scan.nextInt();
	startingpts = new int[99999];
	endingpts = new int[99999];
	numpaths  =0;
	while(!(x==0&&y==0))
	{
		startingpts [numpaths] = x;
		endingpts[numpaths] = y;
		numpaths++;
		x = scan.nextInt();
		y = scan.nextInt();
	}
	System.out.println(find(1));
	}
	public static int find(int pt) {
		if(pt==n)
			return 1;
		else {
			int sum =0;
			for(int i=0;i<numpaths;i++)
			{
				if(startingpts[i] ==pt) {
					int ans =paths[endingpts[i]];
					if(ans!=-1)
						sum+=ans;
					else
					{
						int a =find(endingpts[i]);
						paths[endingpts[i]]=a;
						sum+=a;
					}
				}
			}
			return sum;
		}
	}
}
