package Douwei;
import java.util.*;
public class BlackBox {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> max = new PriorityQueue<Integer>(40000,Collections.reverseOrder());
		int add = sc.nextInt();
		int include = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();
		
		for(int i = 0; i < add; i++) 
			ar.add(sc.nextInt());
		
        /*
         * number of elemeents required in min queue is only
         * total# - get#
         * 
         * because you already know what number you're trying
         * to get next time, so you just make the queue that
         * size.
         * 
         * this way you only use O(1) operations to get the #
         */
		
		ArrayList<Integer> includes = new ArrayList<Integer>();
		for(int i = 0; i < include; i++) 
			includes.add(sc.nextInt());
		
		int c = 0;
		while(!includes.isEmpty()) {
			int next = includes.get(0);
			includes.remove(0);
			
			for(int q = next - c; q > 0; q--) {
				max.add(ar.get(0));
				ar.remove(0);
				min.add(max.poll());
			}
			System.out.println(min.peek());
			max.add(min.poll());
			c = next;
		}
		sc.close();
	}
}
