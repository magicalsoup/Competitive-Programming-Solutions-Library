import java.util.*;
public class dsp1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt(), m = sc.nextInt();
		for(int i = 0; i < n; i++) stack.push(new Integer(sc.nextInt()));
		for(int i = 0; i < m; i++) {
			char op = sc.next().charAt(0);
			if(op == 'I') {
				int x = sc.nextInt();
				stack.push(new Integer(x));
			}
			if(op == 'R') {
				stack.pop();
			}
			if(op == 'T') {
				System.out.println(stack.peek());
			}
			if(op == 'P') {
				System.out.println(stack.pop());
			}
			if(op == 'N') {
				System.out.println(stack.size());
			}
		}
		sc.close();
	}
}
