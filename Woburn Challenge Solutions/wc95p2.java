import java.util.*;
import java.math.*;
public class wc95p2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long [][] dp = new long	[33][33];
	for(int x=0;x<=32;x++) {
		for(int y=0;y<=x;y++) {
			dp[x][y]+=C(x,y);
		}
	}
	int sum =0;
	int length = (int)(Math.log(n)/Math.log(2))+1;
	for(int x=1;x<length;x++) {
		for(int y=(x+1)/2;y<x;y++) {
			sum+=dp[x-1][y];
		}
	}
	int totalone =0;
	int currzero =0;
	for(int x=0;x<=length;x++)
		if((n&1<<x)>0)
			totalone++;
	boolean first = true;
	if(totalone<=(length)/2) {
		sum++;
	}
	for(int x=length-1;x>=0;x--) {
		if((n&1<<x)>0) {
			if(first) {
				first = false;
				totalone--;
				continue;
			}
			int digits= x;
			for(int y=digits;y<=digits;y++) {
				for(int z=0;z<=y;z++) {
					if(currzero+1+z>=(length+1)/2) {
						sum+=dp[y][z];
					}
				}
			}
			totalone--;
		}
		else {
			currzero++;
		}
	}
	System.out.printf("There are %d round numbers less than or equal to %d.\n",sum,n);
}
public static long C(int n,int k ) {
	BigInteger result = new BigInteger("1");
	if(n-k<k)
		k = n-k;
	for(int x=n-k+1;x<=n;x++) {
		result = result.multiply(new BigInteger(Integer.toString(x)));
	}
	for(int x=2;x<=k;x++)
		result = result.divide(new BigInteger(Integer.toString(x)));
	return result.longValue();
}
}
