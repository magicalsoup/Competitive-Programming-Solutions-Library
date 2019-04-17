import java.util.*;
public class ORdeal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(int i = 1; i <= Long.toBinaryString(n).length(); i++)
			System.out.print(1);
		sc.close();
	}
}
