import java.util.*;
public class NightmareAThon {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		int prefixMaxArray[] = new int[n + 1], suffixMaxArray[] = new int[n + 2], cnt1[] = new int[n + 1], cnt2[] = new int[n + 2];
		int a[] = new int[n + 1];
		for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(int i = 1; i <= n; i++) prefixMaxArray[i] = Math.max(prefixMaxArray[i - 1], a[i]);
		for(int i = n; i >= 1; i--) suffixMaxArray[i] = Math.max(a[i], suffixMaxArray[i + 1]);
		int max = prefixMaxArray[1]; 
		for(int i = 1; i <= n; i++) {
			if(a[i] == max) 
				cnt1[i] = cnt1[i - 1] + 1;
			else if(a[i] < max) 
				cnt1[i] = cnt1[i - 1];
		}
		max = suffixMaxArray[n];
		for(int i = n; i >= 1; i--) {
			if(a[i] == max)
				cnt2[i] = cnt2[i + 1] + 1;
			else if(a[i] < max) 
				cnt2[i] = cnt2[i + 1];
		}
		
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt(), r = sc.nextInt();
			if(prefixMaxArray[l - 1] == suffixMaxArray[r + 1]) {
				System.out.println(prefixMaxArray[l - 1] + " " + (cnt1[l - 1] + cnt2[r + 1]));
			}
			else if(prefixMaxArray[l - 1] > suffixMaxArray[r + 1]) {
				System.out.println(prefixMaxArray[l - 1] + " " + cnt1[l - 1]);
			}
			else if(suffixMaxArray[r + 1] > prefixMaxArray[l - 1]) {
				System.out.println(suffixMaxArray[r + 1] + " " + cnt2[r + 1]);
			}
		}
		sc.close();
	}
}
