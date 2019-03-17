import java.util.*;
public class dwite12c2p4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 for(int t = 0; t < 5; t++) {
			int n = sc.nextInt();
			ArrayList<Integer> cards = new ArrayList<Integer>();
			for(int i = 1; i <= n; i++) cards.add(i);
			Collections.reverse(cards);
			ArrayList<Integer> ans = new ArrayList<Integer>();
			boolean impossible = false;
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				if(x >= cards.size()) {
					impossible = true;
					break;
				}
				ans.add(cards.get(x));
				cards.remove(x);
				
			}
			if(impossible) {
				System.out.println("IMPOSSIBLE");
			}
			else {
				for(int x : ans)
					System.out.print(x + " ");
				System.out.println();
			}
		}
		sc.close();
	}
}
