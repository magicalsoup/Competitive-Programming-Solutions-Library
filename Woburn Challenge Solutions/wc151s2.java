import java.util.*;
public class wc151s2{
	static int[] v = new int[2],c = new int[6];
	static int wildv,wildc,wildany;
	public static boolean canmake(int n) {
			int vneeded	=0, cneeded = 0;
			for(int i=0;i<2;i++)
				if(v[i]<n)
					vneeded +=n-v[i];
			for(int i=0;i<6;i++)
				if(c[i]<n)
					cneeded	+=n-c[i];
			vneeded = Math.max(0, vneeded-wildv);
			cneeded = Math.max(0, cneeded-wildc);
			return vneeded+cneeded<=wildany;
	}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	c[0]= sc.nextInt();
	v[0] = sc.nextInt();
	c[1] =sc.nextInt();
	c[2] = sc.nextInt();
	c[3] = sc.nextInt();
	v[1] = sc.nextInt();
	c[4] = sc.nextInt();
	c[5] = sc.nextInt();
	wildv = sc.nextInt();
	wildc = sc.nextInt();
	wildany = sc.nextInt();
	sc.close();
	int lo = 0, hi = 100000001;
	while(lo<hi) {
		int mid = lo+(hi-lo+1)/2;
		if(canmake(mid)) {
			lo = mid;
		}
		else {
			hi = mid-1;
		}
	}
	System.out.println(lo);
	System.exit(0);
}
}
