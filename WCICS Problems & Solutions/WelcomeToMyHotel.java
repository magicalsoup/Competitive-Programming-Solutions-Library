import java.util.*;
public class WelcomeToMyHotel {
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
		
		Integer[] requests = new Integer [n];
		for(int i = 0; i < n; i++) requests[i] = sc.nextInt();
		
		LinkedList<Integer> rooms = new LinkedList<Integer>();
		
		for(int i = 0; i < m; i++) rooms.add(sc.nextInt());
		
		Collections.sort(rooms, Collections.reverseOrder());

		
		int total = 0;
		Arrays.sort(requests, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1 - arg0;
			}
		});

		for(int i = 0; i < n; i++) {
			
			if(!rooms.isEmpty() && requests[i] <= rooms.peek()) {
				total++;
				rooms.pop();
			}
		}
		System.out.println(total);
		sc.close();
	}
}
