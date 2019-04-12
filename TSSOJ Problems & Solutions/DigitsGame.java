import java.util.*;
public class DigitsGame {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String s = sc.next();
		for(int i = 0; i < s.length(); i++)
			sum += Integer.parseInt(s.substring(i, i+1));
		System.out.println(sum);
		sc.close();
	}
}
