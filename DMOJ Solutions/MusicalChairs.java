import java.util.*;
public class MusicalChairs {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		boolean chairs[] = new boolean[n];
		int students[] = new int[n]; Arrays.fill(students, -1);
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < k; i++) chairs[sc.nextInt() - 1] = true;
		for(int i = 0; i <= k; i++) students[sc.nextInt() - 1] = i + 1;
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < n; i++) {
				if(students[i] != -1 && chairs[i]) {
					chairs[i] = false;
					students[i] = -1;
				}
				else if(chairs[i]) {
					if(!st.isEmpty()) {
						st.pop();
						chairs[i] = false;
					}
				}
				else {
					if(students[i] != -1) {
						st.push(students[i]);
						students[i] = -1;
					}
				}
			}
		}
		System.out.println(st.pop());
		sc.close();
		
	}
}
