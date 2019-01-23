import java.util.*;
public class nye18p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[7], max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {int x = sc.nextInt(); a[x]++;}
		for(int i = 1; i < a.length; i++) {max = Math.max(max, a[i]); min = Math.min(min, a[i]);}
		for(int i = 1; i < a.length; i++) if(a[i] == max) {System.out.println(i); break;}
		for(int i = 1; i < a.length; i++) if(a[i] == min) {System.out.println(i); break;}
		sc.close();
	}
}
