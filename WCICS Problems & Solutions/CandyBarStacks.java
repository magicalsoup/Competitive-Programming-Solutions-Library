import java.util.*;
public class CandyBarStacks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		String s = sc.next();
		double total = 0, got = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '1') {
				st.push(1);
			}
			if(c == '0') {
				st.push(0);
			}
			if(c == 'R') {
				st.pop();
			}
			if(c == 'C') {
				total++;
				if(st.peek() == 1) got++;
				st.pop();
			}
		}
		
		System.out.println((int)(Math.floor(got / total * 100)));
		sc.close();
	}
}
