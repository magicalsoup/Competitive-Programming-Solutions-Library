import java.util.*;

public class ecoo18r2p2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		for(int testcases=1; testcases <=10; testcases++) {
			int n = sc.nextInt(); assignment a[] = new assignment[n];
			for(int i=0; i<n; i++)
				a[i] = new assignment(sc.nextInt(), sc.nextDouble());
			Arrays.sort(a);
			double ans = 0;	
			TreeSet<Integer> days = new TreeSet<Integer>();
			for(int i=0; i <= 1000010; i++) days.add(i);
			
			for(int i=0; i<n; i++) {
				int val = days.floor(a[i].days);
				if(val != 0) {
					days.remove(val);
					ans += a[i].weight;
				}
			}
			System.out.printf("%.4f\n", ans);
		}
	}
	static class assignment implements Comparable<assignment>{
		int days; double weight;
		public assignment(int days, double weight) {
			this.days = days; this.weight = weight;
		}
		@Override
		public int compareTo(assignment o) {
			if(o.weight == weight) {
				return Double.compare(days, o.days);
			}
			return Double.compare(o.weight, weight);
		}
	}
}
