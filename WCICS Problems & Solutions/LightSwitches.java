import java.util.*;
public class LightSwitches {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(n-- > 0) {
			if(sc.nextInt() != sc.nextInt())
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
