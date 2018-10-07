import java.util.*;
public class Maze {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int dist[][] = new int[r][c];
			char grid[][] = new char[r][c];
			for(int i = 0; i < dist.length; i++)
				Arrays.fill(dist[i], -1);
			for(int i = 0; i < r; i++) {
				String s = sc.next();
				for(int j = 0; j < c; j++) 
					grid[i][j] = s.charAt(j);
			}
			LinkedList<Node> queue = new LinkedList<Node>();
			queue.add(new Node(0, 0, 1));
			while(!queue.isEmpty()) {
				Node n = queue.poll();
				if(n.x < 0 || n.y >= r || n.y < 0 || n.x >= c)
					continue;
				if(grid[n.y][n.x] == '*')
					continue;
				if(dist[n.y][n.x] + 1 != 0)
					continue;
				dist[n.y][n.x] = n.dist;
				if(grid[n.y][n.x] == '|' || grid[n.y][n.x] == '+')
				{
					queue.add(new Node(n.x, n.y - 1, n.dist + 1));
					queue.add(new Node(n.x, n.y + 1, n.dist + 1));
				}
				if(grid[n.y][n.x] == '-' || grid[n.y][n.x] == '+') {
					queue.add(new Node(n.x + 1, n.y, n.dist + 1));
					queue.add(new Node(n.x - 1, n.y, n.dist + 1));
				}
			}
			System.out.println(dist[r-1][c-1]);
		}
		sc.close();
	}
	static class Node{
		int x;
		int y;
		int dist;
		public Node(int x,int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
}
