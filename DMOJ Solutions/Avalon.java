import java.util.*;
public class Avalon {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double prob = -1;
		int G = sc.nextInt();
		for(int i=1; i<=G; i++) {
			double e = sc.nextDouble(), p = sc.nextDouble();
			double cur = (p-e)/p;
			if(prob == -1)
				prob = cur;
			else
				prob *= cur;
		}
		
		System.out.printf("%.6f\n",prob);
		sc.close();
	}
}
