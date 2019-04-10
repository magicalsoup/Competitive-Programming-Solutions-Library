import java.util.*;
public class PresentInsertionScandal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), total = 0;
		for(int i = 0; i < n; i++) 
			if(valid(sc.next()))
				total++;
		
		System.out.println(total);
		sc.close();
	}
	static boolean valid(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		return sb.reverse().toString().equals(s) && s.contains("hohoho");
	}
}
