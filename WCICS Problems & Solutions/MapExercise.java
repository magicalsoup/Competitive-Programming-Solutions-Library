import java.util.*;
public class MapExercise {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		while(n-- > 0) {
			int c = sc.nextInt();
			if(c == 1) {
				int user = sc.nextInt(), points = sc.nextInt();
				if(mp.get(user) == null) mp.put(user, points);
				else mp.put(user, mp.get(user) + points);
			}
			if(c == 2) {
				int user = sc.nextInt(), points = sc.nextInt();
				if(mp.get(user) == null) mp.put(user, -points);
				else mp.put(user, mp.get(user) - points);
			}
			if(c == 3) {
				int user = sc.nextInt();
				if(mp.get(user) == null) System.out.println(0);
				else System.out.println(mp.get(user));
			}
			if(c == 4) {
				System.out.println(mp.size());
			}
		}
		sc.close();
	}
}
