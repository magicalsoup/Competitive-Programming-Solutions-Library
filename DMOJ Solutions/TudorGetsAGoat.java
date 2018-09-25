import java.util.*;
public class TudorGetsAGoat {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if( n != m)
			System.out.println("Stay");
		else
			System.out.println("Switch");
		sc.close();
	}
}
