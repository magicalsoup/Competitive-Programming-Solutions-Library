import java.util.*;
public class AFK {
	static char [][] grid;
	static int movex[] = {0, 0, -1, 1};
	static int movey[] = {-1, 1, 0 ,0};
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int c = sc.nextInt();
			int r = sc.nextInt();
			grid = new char[r][c];
			int startX = 0, startY = 0, endX = 0, endY = 0;
			for(int i = 0; i < r; i++) {
				String s = sc.next();
				for(int j = 0; j < c; j++) {
					grid[i][j] = s.charAt(j);
					if(s.charAt(j) == 'C') {
						startX = i;
						startY = j;
					}
					if(s.charAt(j) == 'W') {
						endX = i;
						endY = j;
					}
				}
			}
			boolean [][] v = new boolean [r][c];
			v[startX][startY] = true;
			boolean flag = false;
			LinkedList<Node> queue = new LinkedList<Node>();
			queue.offer(new Node(startX, startY, 0));
			while(!queue.isEmpty()) {
				Node curr = queue.poll();
				if(curr.x ==endX && curr.y == endY) {
					flag = true;
					System.out.println(curr.time >= 60 ? "#notworth" : curr.time);
					break;
				}
				for(int i = 0; i < 4; i++) {
					int nx = curr.x + movex[i];
					int ny = curr.y + movey[i];
					if( nx < 0 || ny < 0 || nx >= r || ny >= c || v[nx][ny] || grid[nx][ny] == 'X')
						continue;
					queue.offer(new Node(nx, ny, curr.time + 1));
					v[nx][ny] = true;
 				}
			}
			if(!flag)
				System.out.println("#notworth");
		}
		sc.close();
	}
	static class Node{
		int x;
		int y;
		int time;
		public Node(int x, int y, int time) {
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
}
