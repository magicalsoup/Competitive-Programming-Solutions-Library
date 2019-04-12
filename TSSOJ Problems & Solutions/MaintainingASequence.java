import java.util.*;
public class MaintainingASequence {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> st = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(st.contains(x)) {
				System.out.println("YES");
				sc.close();
				return;
			}
			else
				st.add(x);
		}
		System.out.println("NO");
		sc.close();
	}
}
