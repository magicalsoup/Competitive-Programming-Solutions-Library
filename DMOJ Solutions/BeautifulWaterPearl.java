import java.util.*;
public class BeautifulWaterPearl {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
		int a = 0, b = 0;
		for(int i = 30; i >= 0; i--) {
			if(((c >> i) & 1) == 0) {
				a = a <<1;
				b = b <<=1;
			}
			else if(((d >> i) & 1) != 0) {
				a  = a <<1|1;
				b = b << 1|1;
			}
			else if(((e>>i) & 1) != 0) {
				a = a <<1; 
				b = b <<1|1;
			}
		}
		if((a|b) != c || (a&b) != d || (a^b) != e) System.out.println(0);
		
		else System.out.println((int)(Math.pow(2, Integer.bitCount(e))));

		sc.close();
	}
}
