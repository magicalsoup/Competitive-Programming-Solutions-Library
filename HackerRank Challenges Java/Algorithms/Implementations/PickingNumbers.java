import java.util.*;
public class PickingNumbers {
	
	static int pickingNumbers(int[] a) {
		int[] counts = new int[100];
		for (int number : a) {
			counts[number]++;
		}
		int result = Arrays.stream(counts).max().getAsInt();
		for (int i = 0; i + 1 < counts.length; i++) {
			result = Math.max(result, counts[i] + counts[i + 1]);
		}
		return result;
	}
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println(pickingNumbers(a));
		sc.close();
	}
}
