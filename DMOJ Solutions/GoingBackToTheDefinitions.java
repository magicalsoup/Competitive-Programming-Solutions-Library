import java.util.*;
public class GoingBackToTheDefinitions {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		while(n-->0) {
			list.add(sc.next());
		}
		solve(list);
		sc.close();
	}
	static void solve(ArrayList<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String x, String y) {
				String xy = x + y;
				String yx = y + x;
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		});
		for(String i : list)
			System.out.print(i);
	}
}
