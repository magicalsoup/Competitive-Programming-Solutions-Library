import java.util.*;
public class GreedyForCandy {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		candy c[] = new candy[26];
		for(int i = 0; i < 26; i++) {
			char nom = sc.next().charAt(0);
			c[nom % 26] = new candy(nom, sc.nextInt());
		}
		String str = sc.next();
		ArrayList<candy> ans = new ArrayList<candy>();
		
		for(int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			ans.add(new candy(cur, c[cur % 26].value));
		}
		
		Collections.sort(ans);
		
		for(candy i : ans)
			System.out.print(i.name);
		sc.close();
	}
	static class candy implements Comparable<candy>{
		char name; int value;
		public candy(char name, int value) {
			this.name = name;
			this.value = value;
		}
		@Override
		public int compareTo(candy o) {
			return Integer.compare(value, o.value);
		}
	}
}
