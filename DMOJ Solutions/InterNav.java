import java.util.*;
public class InterNav {
	static ArrayList<Character> rooms = new ArrayList<Character>();
	static LinkedList<Node> queue = new LinkedList<Node>();
	static int[] moveX = {-1, 1, 0, 0 }, moveY = {0, 0, -1, 1 };
	static char [][] grid;
	static boolean vist[][];
	static int r, c;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt(); r = sc.nextInt(); grid = new char[r][c]; vist = new boolean[r][c];
		Node start = new Node(0, 0);
		for(int i = 0; i < r; i++) {
			String s = sc.next();
			for(int j = 0; j < c; j++) {
				grid[i][j] = s.charAt(j);
				if(grid[i][j] == '1')  start = new Node(i, j);
			}
		}
		bfs(start);
		Collections.sort(rooms);
		for(Character i : rooms) { System.out.print(i + " "); }
		sc.close();
	}
	static void bfs(Node start) {
		vist[start.x][start.y] = true;
		queue.add(start);
		rooms.add(grid[start.x][start.y]);
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			for(int i = 0; i < 4; i++) {
				int nx = moveX[i] + curr.x, ny = moveY[i] + curr.y;
				if(nx < 0 || nx >= r || ny < 0 || ny >= c || grid[nx][ny] == '#' || vist[nx][ny]) continue;
				if(Character.isDigit(grid[nx][ny])) rooms.add(grid[nx][ny]);
				vist[nx][ny] = true;
				queue.add(new Node(nx, ny));
			}
		}
	}
	static class Node{
		int x, y;
		public Node(int x, int y) { this.x = x; this.y = y; }
	}
}
