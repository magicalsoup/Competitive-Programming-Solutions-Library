import java.util.*;
public class gcc1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); long sum = 0;
		while(n-- > 0) sum += sc.nextLong();
		System.out.println(sum - 1);
		sc.close();
	}
}
