import java.util.*;
public class LuckyNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a-->0) {
			String str = sc.next();
			while(str.length()!=1) {
				int sum = 0;
				for(int i = 0; i < str.length(); i++) {
					String c =  str.charAt(i)+"";
					sum += Integer.parseInt(c);
				}
				str = String.valueOf(sum);
			}
			System.out.println(str);
		}
		sc.close();
	}
}
