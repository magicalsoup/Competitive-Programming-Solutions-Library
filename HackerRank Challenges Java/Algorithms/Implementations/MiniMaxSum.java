import java.util.*;
public class MiniMaxSum {
	
	static void miniMaxSum(long[] arr) {
		Arrays.sort(arr);
		long min = arr[0]+arr[1]+arr[2]+arr[3];
		long max = arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println(min+" "+max);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long a[] = new long[5];
		for(int i=0;i<5;i++)
			a[i] = sc.nextLong();
		miniMaxSum(a);
		sc.close();
	}
}
