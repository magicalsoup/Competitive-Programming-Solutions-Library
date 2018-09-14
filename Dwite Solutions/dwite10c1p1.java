import java.util.*;
public class dwite10c1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			int day = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			System.out.println(solve(day,month,year)? "old enough" : "too young");
		}
		sc.close();
	}
	static boolean solve(int day, int month, int year) {
		boolean bool = year < 1997 
						|| year == 1997	&& month < 10
						|| year == 1997 && month == 10 && day <=27;
		return bool;
	}
}
