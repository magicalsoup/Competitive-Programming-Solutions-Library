import java.util.*;
public class TheThirdCellar {
	static boolean s[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sieve(1000000);
		while(n-- > 0) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(solve(l, r));
		}
		sc.close();
	}
	static int solve(int l, int r){
		int cnt = 0;
		for(int i = l; i < r; i++)
			if(!s[i]) cnt++;
		return cnt;
	}
	static void sieve(int x) {
		s = new boolean[1000001];
		s[0] = true; s[1] = true; 
		for(int i = 2; i * i <= x; i++) {
			if(!s[i])
				for(int j = i * i; j <= x; j += i)
					s[j] = true;
		}
	}
}
