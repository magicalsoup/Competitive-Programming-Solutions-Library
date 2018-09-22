import java.util.*;
public class coci14c1p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int pao = Math.max(Math.abs(x[0] - x[n-1]), Math.abs(y[0] - y[n-1])); 
		System.out.println(pao * pao); // pao pao, get it?
		sc.close();
		}
}
