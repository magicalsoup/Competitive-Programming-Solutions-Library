import java.util.*;
public class TudorLearnsDDR {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char m1 = str.charAt(0);
		char m2 = str.charAt(1);
		char m3 = str.charAt(2);
		if( ((m1 == 'R' && m3 == 'L') || (m1 == 'L' && m3 == 'R')) && (m2 != m1 && m2 != m3) )
			System.out.println("Crossover");
		else if( ((m1 == 'U' && m3 == 'D') || (m1 == 'D' && m3 == 'U')) && (m2 != m1 && m2 != m3) )
			System.out.println("Candle");
		else
			System.out.println("Neither");
		sc.close();
	}
}
