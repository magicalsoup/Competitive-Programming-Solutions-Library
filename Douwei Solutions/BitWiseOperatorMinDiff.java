package Douwei;
import java.util.*;
public class BitWiseOperatorMinDiff {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] arr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(sc.next(),2);
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; i++) {
				min = Math.min(Long.bitCount(arr[i]^arr[j]), min);
			}
		}
		System.out.println(min);
		sc.close();
	}
}
