import java.util.*;
public class MimiAndKuteness {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); long a[] = new long[n + 1];
		for(int i = 1; i <= n; i++) {a[i] = sc.nextLong(); a[i] += a[i - 1];}
		long last = 0;
		for(int i=1, l=0, r=n; i<=n; i++, l++, r--){
			last += a[r] - a[l];
			System.out.println(last);
		}
		sc.close();
	}
}
