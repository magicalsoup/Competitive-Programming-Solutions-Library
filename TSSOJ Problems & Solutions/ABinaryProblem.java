import java.util.*;
public class ABinaryProblem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), one = 0;
		for(int i = 0; i < n; i++)
			if(sc.nextInt() == 1) one++;
		
		System.out.println(one % 2 == 0? 0 : 1);
		sc.close();
	}
}
