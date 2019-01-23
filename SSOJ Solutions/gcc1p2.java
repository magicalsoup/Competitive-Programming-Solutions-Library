import java.util.*;
public class gcc1p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int count = 0;
		while(n-- > 0) count += countA(sc.next());
		System.out.println(count);
		sc.close();
	}
	static int countA(String s) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++) if(s.charAt(i) == 'a') sum++;
		return sum;
	}
}
