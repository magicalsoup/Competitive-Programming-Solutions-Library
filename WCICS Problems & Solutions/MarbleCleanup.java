import java.util.*;
public class MarbleCleanup {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int marbles[] = new int[1010];
		int n = sc.nextInt(), k = sc.nextInt();
		int max = 0;
		int psa[] = new int[1010];
		for(int i = 0; i < n; i++)
			marbles[sc.nextInt()]++;
		
		for(int i = 1; i <= 1000; i++) {
			psa[i] = marbles[i];
			psa[i] += psa[i-1];
		}
		
		for(int i = 1; i <= 1000 - k; i++) {
		
			max = Math.max(psa[i+k-1] - psa[i-1], max);
		}
		System.out.println(max);
		sc.close();
	}
}
