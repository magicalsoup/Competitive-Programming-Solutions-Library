import java.util.*;
public class RainbowRating {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x-- > 0) {
			int n = sc.nextInt();
			if(n < 1000) System.out.println("Newbie");
			else if(n <= 1199) System.out.println("Amateur");
			else if(n <= 1499) System.out.println("Expert");
			else if(n <= 1799) System.out.println("Candidate Master");
			else if(n <= 2199) System.out.println("Master");
			else if(n <= 2999) System.out.println("Grandmaster");
			else if(n <= 3999) System.out.println("Target");
			else System.out.println("Rainbow Master");
		}
		sc.close();
	}
}
