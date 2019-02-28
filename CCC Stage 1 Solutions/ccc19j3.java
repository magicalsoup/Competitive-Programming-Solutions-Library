import java.util.*;
public class ccc19j3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			String s = sc.next();
			int i = 0;
			for(i = 0; i < s.length(); i++) {
				char c = s.charAt(i); int cnt = 0;
				while(i < s.length()) {
					if(s.charAt(i) != c) {i--; break;}
					i++;
					cnt++;
				}
				System.out.print(cnt + " " + c + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
