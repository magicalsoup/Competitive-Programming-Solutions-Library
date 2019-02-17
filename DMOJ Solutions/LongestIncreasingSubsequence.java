import java.util.*;
public class LongestIncreasingSubsequence {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		System.out.println(LIS(a, n)); sc.close();
	}
	static int bs(int a[], int l, int r, int key) {
		while(r - l > 1) {
			int m = l + (r - l ) / 2;
			if(a[m] >= key) r = m;
			else l = m;
		}
		return r;
	}
	static int LIS(int v[], int n) {
		if(n == 0) return 0;
		int a[] = new int[n], len = 1;
		a[0] = v[0];
		
		for(int i = 1; i < n; i++) {
			if(v[i] < a[0]) a[0] = v[i];
			else if(v[i] > a[len - 1]) a[len++] = v[i];
			else a[bs(a, -1, len - 1, v[i])] = v[i];
		}
		return len;
		
	}
}
