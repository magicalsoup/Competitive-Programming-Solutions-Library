import java.util.*;
public class MrWhitesCarnival {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
