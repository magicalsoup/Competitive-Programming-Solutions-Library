import java.util.*;
public class BrunoAndPumpkins {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = sc.nextInt();
		ArrayList<Integer> pos = new ArrayList<Integer>(), neg = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x > 0) pos.add(x);
			else neg.add(-x);
		}
		Collections.sort(pos); Collections.sort(neg);
		int ans = 0x3f3f3f3f;
		for(int i = 0; i <= Math.min(t, pos.size()); i++) {
			if(neg.size() < t - i) continue;
			
			int px = 0, nx = 0;
			if(i > 0 && i < t) {
				px = pos.get(i - 1); nx = neg.get(t - i - 1);
				ans = Math.min(ans, 2*Math.min(px, nx) + Math.max(px, nx));
			}
			else if(i == 0)
				ans = Math.min(ans, neg.get(t - 1));
			else if(i == t) 
				ans  = Math.min(ans, pos.get(t - 1));
			
		}
		System.out.println(ans);
		sc.close();
	}
}
