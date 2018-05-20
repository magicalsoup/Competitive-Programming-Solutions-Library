package Douwei;
import java.util.*;
public class SwapTheBits{
	public static int swap(int n, int p, int q){
		if ((((n & (1 << p)) >> p) ^ ((n & (1 << q)) >> q)) == 1){
			n ^= (1 << p);
			n ^= (1 << q);
		}
		return n;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		n = swap (n, p-1, q-1);
		System.out.println(n);
	}
}