import java.util.*;
public class RockPaperScissors {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int alice = 0;
		int bob = 0;
		int n = sc.nextInt();
		String a[] = new String[n];
		String b[] = new String[n];
		for(int i = 0; i < n; i++) 
			a[i] = sc.next();
		for(int i = 0; i < n; i++)
			b[i] = sc.next();
		for(int i = 0; i < n; i++) {
			if(solve(a[i],b[i]) == 2)
				alice++;
			else if(solve(a[i],b[i]) == -1)
				bob++;
		}
		System.out.println(alice + " " + bob);
		sc.close();
	}
	static int solve(String a, String b) {
		if(a.equals(b))
			return 0;
		if(a.equals("rock") && b.equals("scissors"))
			return 2;
		if(a.equals("paper") && b.equals("rock"))
			return 2;
		if(a.equals("scissors") && b .equals("paper"))
			return 2;
		return -1;
	}
}
