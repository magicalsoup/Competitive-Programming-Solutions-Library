import java.util.*;
public class HouseOfCards {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(); Integer a[] = new Integer[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		Arrays.sort(a, new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1.compareTo(arg0);
			}
		});
		int cnt = 1; int cur = a[0];
		for(int i = 1; i < n; i++) {
			if(cur - a[i] >= k) {
				cur = a[i];
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
