import java.util.*;
public class StringFinding {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), p = sc.next();
		System.out.println(s.indexOf(p));
		sc.close();
	}
}
