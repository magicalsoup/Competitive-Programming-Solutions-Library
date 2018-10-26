import java.util.*;
public class CompositeBag {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		while( n-- > 0) {
			int x = sc.nextInt();
			if(isComposite(x)) 
				num++;
		}
		System.out.println(num);
		sc.close();
	}
	static boolean isComposite(int x) {
		if(x <= 3)
			return false;
		for(int i = 2; i <= Math.sqrt(x); i++) 
			if( x % i == 0)
				return true;
		return false;
	}
}
