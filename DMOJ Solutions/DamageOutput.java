import java.util.*;
public class DamageOutput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long a[] = new long[n + 1];
		int leftPointer = 0;
		int rightPointer = 0;
		for(int i = 1; i <=n; i++) a[i] = sc.nextInt();
		for(int i = 1; i <= n; i++) a[i] += a[i-1];
		long ans = Integer.MAX_VALUE;
		while(leftPointer <= n && rightPointer <= n) {	
			if(a[rightPointer] - a[leftPointer] >= m) {  
				ans = Math.min(ans, rightPointer - leftPointer);
				leftPointer++;
			}
			else if(a[rightPointer] - a[leftPointer] < m) 
				rightPointer++;
		}
		if(a[n] < m)
			ans = -1;

		System.out.println(ans);
		sc.close();
	}
}
