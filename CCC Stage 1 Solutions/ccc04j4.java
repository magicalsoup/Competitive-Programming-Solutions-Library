import java.util.*;
public class ccc04j4{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		String  line = scan.nextLine();
		line = line.replaceAll("\\P{L}+", "");
		String ans = "";
		for(int i=0;i<line.length();i++) {
			char shiftCode = key.charAt(i%key.length());
			char code = line.charAt(i);
			code = shift(getShift(shiftCode),code);
			ans +=code;
		}
		System.out.println(ans);
	}
		public static int getShift(char c) {
			int value = c-65;
			return value;
		}
		public static char shift(int shift,char c) {
			String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
			return s.charAt(s.indexOf(c)+shift);
		}
		}