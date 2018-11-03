import java.util.*;
public class ProductiveMathClass {
	/**
	 * Input		Output
	 * 1			1
	 * 2			2
	 * 3			3
	 * 4			4
	 * 5			5
	 * 6			6
	 * 7			7
	 * 8			8
	 * 9			9
	 * 1 0			1
	 * 1 1			0
	 * 1 2			1
	 * 1 3			2
	 * 1 4			1
	 * 1 5			2
	 * 1 6			1
	 * 1 7			3
	 * 1 8			1
	 * 1 9			4
	 * 2 0			1
	 * 2 1			5
	 * 2 2			1
	 * 2 3			6
	 * 2 4			7
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long start = 1, len = 1, count = 9;
		while(n > len * count) {
			n -= len * count;
			len++;
			count *= 10;
			start *= 10;
		}
		start += (n-1)/len;
		System.out.println(String.valueOf(start).charAt((int)((n-1) % len)) - '0');
		sc.close();
	}
}
