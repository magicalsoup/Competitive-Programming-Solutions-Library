package Douwei;
import java.util.Scanner;
public class Hamburgers {
	static final int maxn = 3;
	static long [] need = new long[maxn], num = new long[maxn], p = new long[maxn], temp = new long[maxn];
	static long r, per;
	static boolean could(long n) {
		long money = 0;
		for(int i=0;i<maxn;i++)
			if(n*need[i]>num[i])
				money+=p[i]*(n*need[i]-num[i]);
		return money>r;
	}
	static long division(long l, long r) {
		if(l==r) {
			return l;
		}
		long mid = (l+r)/2;
		if(could(mid))
			return division(l,mid);
		else
			return division(mid+1,r);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		need[0] = need[1] = need[2] = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='B')
				need[0]++;
			if(s.charAt(i)=='S')
				need[1]++;
			if(s.charAt(i)=='C')
				need[2]++;
		}
		per = 0;
		for(int i=0;i<3;i++)
			num[i] = sc.nextLong();
		for(int i=0;i<3;i++) {
			p[i] = sc.nextLong();
			per+= need[i]*p[i];
		}
		r = sc.nextLong();
		System.out.println(division(0,2000000000000L)-1);
		sc.close();
	}
}
