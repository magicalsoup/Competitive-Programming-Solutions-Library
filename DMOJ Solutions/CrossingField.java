import java.util.*;
public class CrossingField {
	static int movex[] = {-1, 1, 0, 0};
	static int movey[] = {0, 0, 1, -1};
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int grid[][] = new int[n][n];
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < n; j++)
				grid[i][j] = sc.nextInt();
		sc.close();
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.offer(new Node(0, 0));
		boolean v[][] = new boolean[n][n];
		while(!queue.isEmpty()) {
			Node p = queue.poll();
			if(p.x == n - 1 && p.y == n - 1) {
				System.out.println("yes");
				return;
			}
			for(int i = 0; i < 4; i++) {
				int nx = p.x + movex[i];
				int ny = p.y + movey[i];
				if( nx < 0 || ny < 0 || nx >= n || ny >= n || v[nx][ny] || Math.abs(grid[nx][ny] - grid[p.x][p.y]) > h)
					continue;
				v[nx][ny] = true;
				queue.offer(new Node(nx, ny));
			}
		}
		System.out.println("no");
	}
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
