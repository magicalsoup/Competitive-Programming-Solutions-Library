import java.util.*;
public class coci087p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int total =0;
		int mod= 0;
		for(int x =0;x<s.length();x++) {
			char c = s.charAt(x);
			if(c-'A'>=0&&c-'A'<=25) {
				total+=(4-mod)%4;
				mod = 1;
			}
			else
				mod =(mod+1)%4;
		}
	System.out.println(total);
	}
}
