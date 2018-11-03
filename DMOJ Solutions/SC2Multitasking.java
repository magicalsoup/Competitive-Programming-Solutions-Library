import java.util.*;
public class SC2Multitasking {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String firstRow = "qwertyuiop";
		String secondRow = "asdfghjkl";
		String thirdRow = "zxcvbnm";
		int n = sc.nextInt();
		int cnt = 0;
		while(n-->0) {
			String str = sc.next();
			int f = 0;
			int s = 0;
			int t = 0;
			for(int i = 0; i < str.length(); i++) {
				String c = str.charAt(i) + "";
				if(firstRow.contains(c)) f++;
				else if(secondRow.contains(c)) s++;
				else if(thirdRow.contains(c)) t++;
			}
			if(f > 0 && s == 0 && t == 0)
				cnt++;
			else if(s > 0 && f == 0 && t == 0)
				cnt++;
			else if(t > 0 && s == 0 && f ==0)
				cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
