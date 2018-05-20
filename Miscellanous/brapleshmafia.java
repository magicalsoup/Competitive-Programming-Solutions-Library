import java.math.*;
import java.util.Scanner;
public class brapleshmafia {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long g = scan.nextLong();
		BigInteger bg = BigInteger.valueOf(g); 
		BigInteger y= BigInteger.valueOf(0);
		long arr[] = new long[t];
		
		long arrs[] = new long[t];
		
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextLong();
			arrs[i] =scan.nextLong();
			BigInteger t_i = BigInteger.valueOf(arr[i]);
			BigInteger t_s_i = BigInteger.valueOf(arrs[i]);
			BigInteger t_x = t_i.multiply(t_s_i);
			y=y.add(t_x);
		}
		
		System.out.println(y.mod(bg));


	}
}
