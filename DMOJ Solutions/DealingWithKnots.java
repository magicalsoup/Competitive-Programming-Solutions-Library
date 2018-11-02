import java.util.*;
public class DealingWithKnots {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static boolean v[];
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
			adj.add(new ArrayList<Integer>());
		v = new boolean [n + 1];
		for(int i = 0; i < n; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj.get(a).add(b);
		}
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		if(bfs(x , y))
			System.out.println("Tangled");
		else
			System.out.println("Not Tangled");
		sc.close();
	}
	static boolean bfs(int start, int dest) {
		v[start] = true;
		queue.add(start);
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(Integer e : adj.get(cur)) {
				if(e == dest) {
					return true;
				}
				if(!v[e]) {
					v[e] = true;
					queue.add(e);
				}
			}
		}
		return false;
	}
}
