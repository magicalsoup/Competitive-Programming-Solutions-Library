import java.util.*;
public class PursuitOfKnowledge {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static int dist[][];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		dist = new int[1005][1005];
		for(int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
			for(int j = 0; j < n; j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj.get(a).add(b);
		}
		for(int i = 0; i < n; i++) {
				dist[i][i] = 0;
				queue.add(i);
				while(!queue.isEmpty()) {
					int curr = queue.poll();
					for(Integer next: adj.get(curr)) {
						int currdist = dist[i][curr] + 1;
						if(currdist >= dist[i][next]) continue;
						else
							dist[i][next] = currdist;
						queue.offer(next);
					}
			}
		}
		int q = sc.nextInt();
		while(q-- > 0) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			System.out.println(dist[a][b] == Integer.MAX_VALUE ? "Not enough hallways!" : dist[a][b] * t);
		}
		sc.close();
	}
}

