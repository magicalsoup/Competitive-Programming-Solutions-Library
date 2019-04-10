import java.util.*;
public class HiddenPresents {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = ""; int max = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j < s.length(); j++) {
				String cur = s.substring(i, j + 1);
				if(valid(cur)) {
					if(cur.length() > max) {
						max = cur.length();
						ans = cur;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
	static boolean valid(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString().equals(s) && s.contains("hohoho");
	}
}
