import java.util.*;
public class LoveGuru {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase(); int ans1 = 0, ans2=0;
		for(int i=0; i<s.length(); i++)
			ans1 = (ans1 + mypow(s.charAt(i)-'a'+1, i+1, 10))%10;
		s = sc.next().toLowerCase(); 
		for(int i=0; i<s.length(); i++)
			ans2 = (ans2+ mypow(s.charAt(i)-'a'+1, i+1, 10))%10;
		if(ans1 == 0) ans1 = 10;
		if(ans2 == 0) ans2 = 10;
		System.out.println(ans1 + ans2);
		sc.close();
	}
	static int mypow(int base, int exp, int mod){
		if(exp==1) return base;
		int t = mypow(base, exp/2, mod);
		if(exp % 2 != 0 ) return t*t*base%mod;
		else return t*t%mod;
	}
}
