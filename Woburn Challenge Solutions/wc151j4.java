import java.util.*;
public class wc151j4{
	static final int maxn = 20;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int emin,tbase,hbase,fbase,n, ans = Integer.MAX_VALUE;
	int[] e=  new int[maxn], t= new int[maxn],h =new int[maxn],f = new int[maxn];
	emin = sc.nextInt();
	tbase = sc.nextInt();
	hbase = sc.nextInt();
	fbase = sc.nextInt();
	n= sc.nextInt();
	for(int i=0;i<n;i++) {
		e[i] = sc.nextInt();
		t[i] = sc.nextInt();
		h[i] = sc.nextInt();
		f[i] = sc.nextInt();
	}
	for(int mask=0;mask<(1<<n);mask++) {
		int E = 0, T = tbase,H = hbase, F = fbase;
		for(int i=0;i<n;i++) {
			if((mask&1<<i)>0) {
				E+=e[i];
				T+=t[i];
				H = Math.max(H,h[i]);
				F= Math.max(0, F-f[i]);
			}
		}
		int cost = T+H+F;
		if(E>=emin) {
		ans = Math.min(ans, cost);	
		}		
	}
	System.out.println(ans);
}
}
