import java.util.*;
public class nccc1j2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				System.out.println("Even");
				sc.close();
				return;
			}
		}
		System.out.println("Odd");
		sc.close();
	}
}
