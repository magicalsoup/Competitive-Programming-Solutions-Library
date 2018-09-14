import java.util.*;
public class UniqueElement {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		while(n-->0) {
			int x = sc.nextInt();
			if(!list.contains(x))
				list.add(x);
		}
		System.out.println(list.size());
		sc.close();
	}
}
