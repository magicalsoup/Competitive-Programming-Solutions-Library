import java.util.*;
public class nccc6j2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); String b = "pusheen"; int cnt = 0;
		for(int i = 0; i < a.length(); i++)
			if(a.charAt(i) != b.charAt(i)) cnt++;
		System.out.println(cnt);
		sc.close();
	}
}
