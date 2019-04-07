import java.util.*;
public class SetExercise {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		while(n-- > 0) {
			int c = sc.nextInt();
			if(c == 1) {
				set.add(sc.nextInt());
			}
			if(c == 2) {
				set.remove(sc.nextInt());
			}
			if(c == 3) {
				System.out.println(set.contains(sc.nextInt()) ? "Y" : "N");
			}
			if(c == 4) {
				System.out.println(set.size());
			}
		}
		sc.close();
	}
}
