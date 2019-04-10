import java.util.*;
public class PriorityQueueExercise {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		int n = sc.nextInt();
		while(n-- > 0) {
			String s = sc.next();
			if(s.equals("n"))
				System.out.println(pq.poll());
			else if(s.equals("s"))
				System.out.println(pq.size());
			else
				pq.add(Integer.parseInt(s));
		}
		sc.close();
	}
}
