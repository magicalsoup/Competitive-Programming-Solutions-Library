import java.util.*;
public class NagaramProblems {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			String a = sc.next(), b = sc.next();
			System.out.println(anagram(a, b)? "y" : "n");
		}
		sc.close();
	}
	static boolean anagram(String a, String b) {
		char s1[] = a.toCharArray(), s2[] = b.toCharArray();
		Arrays.sort(s1); Arrays.sort(s2);
		return String.valueOf(s1).equals(String.valueOf(s2));
	}
}
