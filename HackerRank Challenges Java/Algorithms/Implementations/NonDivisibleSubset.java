package Implementations;
import java.util.*;
public class NonDivisibleSubset {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int cnts[] = new int [k];
		Arrays.fill(cnts, 0);
		for(int i = 0; i < n; i++)
			cnts[arr[i] % k]++;
		int cnt = cnts[0] < 1? cnts[0] : 1;
		for(int i = 1; i < k/2 +1; i++) {
			if(i != k - i)
				cnt += Math.max(cnts[i], cnts[k - i]);
		}
		cnt += k % 2 == 0 ? 1 : 0;
		System.out.println(cnt);
		sc.close();
	}
}
