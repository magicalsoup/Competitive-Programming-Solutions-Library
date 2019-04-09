import java.util.*;
public class PresentProductionPredictions {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int presents[] = new int[d + 1];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			for(int j = 1; j <= d; j++)
				if(j % x != 0) presents[j]++;
					
		}
		for(int i = 1; i <= d; i++)
			System.out.println(presents[i]);
		sc.close();
	}
}
