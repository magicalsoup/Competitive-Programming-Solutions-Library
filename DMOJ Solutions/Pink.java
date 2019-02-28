import java.util.*;
public class Pink {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), cnt = 0;
		while(t-- > 0) {
			int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
			if(r >= 240 && r <= 255 && g >= 0 && g <= 200 && b >= 95 && b <= 220)
				cnt++;
		}
		System.out.println(cnt); sc.close();
	}
}
