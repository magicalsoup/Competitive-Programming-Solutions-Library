import java.util.*;
public class ecoo16r1p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 10; t++) {
			int n = sc.nextInt();
			Set<Double> spinner = new HashSet<Double>();
			
			for(int i = 0; i < n; i++) spinner.add(sc.nextDouble());
			
			double endValues[] = new double[5];
			for(int i = 0; i < 5; i++) endValues[i] = sc.nextDouble();
			
			boolean isPossible[] = new boolean[5];
			
			for(int i = 0; i < 5; i++) {
				
			loop:for(double j : spinner) {
					
					for(double k : spinner) {
						
						if(spinner.contains(endValues[i] / j / k) || spinner.contains((endValues[i] - j) / k)
								|| spinner.contains(endValues[i] / j - k) || spinner.contains(endValues[i] - j - k)) {
							isPossible[i] = true;
							break loop;
						}
					}
				}
			}
			for(int i = 0; i < 5; i++)
				System.out.print(isPossible[i] ? "T" : "F");
			System.out.println();
		}
		sc.close();
	}
}
