import java.util.*;
public class BreadthFirstNotQuiteTree {
	static int edges [][];
	static int dist[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 5; t++) {
			int n = sc.nextInt();
			dist = new int[101];
			edges = new int[n][2];
			for(int i = 0; i < n; i++) {
				edges[i][0] = sc.nextInt();
				edges[i][1] = sc.nextInt();
			}
			Arrays.fill(dist, 999);
			dist[1] = 0;
			for(int i = 0; i < dist.length; i++) {
				for(int [] e : edges) {
					dist[e[0]] = Math.min(dist[e[1]] + 1, dist[e[0]]);
					dist[e[1]] = Math.min(dist[e[0]] + 1, dist[e[1]]);
				}
			}
			int sameLevel = 0;
			for(int [] e : edges) {
				if(dist[e[0]] != -1 && dist[e[0]] == dist[e[1]])
					sameLevel++;
			}
			System.out.println(sameLevel);
		}
		sc.close();
	}
}
