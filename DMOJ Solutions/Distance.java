import java.util.*;
public class Distance {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int l=1, r=n;
		while(l <= r) {
			System.out.print(l + " ");
			l++;
			if(l > r) break;
			System.out.print(r + " ");
			r--;
		}

		sc.close();
	}

}
