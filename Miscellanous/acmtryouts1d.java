import java.util.*;
public class acmtryouts1d {
	static char [][] grid;
	static int ret =4;
	static int sx,sy,ex,ey;
	static int[]dx = new int[] {-1,1,0,0};
	static int[]dy = new int[] {0,0,-1,1};
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int casenum = sc.nextInt();
	for(int lol=0;lol<casenum;lol++) {
		int r = sc.nextInt();
		int c = sc.nextInt();
		grid = new char[r][c];
		sc.nextLine();
		for(int i=0;i<r;i++) {
			String s = sc.nextLine();
			for(int j=0;j<c;j++) {
				grid[i][j] = s.charAt(j);
				if(grid[i][j]=='F') {
					sx =i;
					sy =j;
				}
				if(grid[i][j]=='H') {
					ex =i;
					ey =j;
				}
			}
		}
		ret =4;
		dfs(0);
		System.out.println(ret);
	}
}
public static void dfs(int num) {
	if(num>=ret)return;
	if(!canreach()) {
		ret = num;
		return;
	}
	for(int i=0;i<grid.length;i++) {
		for(int j=0;j<grid[i].length;j++) {
			if(grid[i][j]=='G') {
				grid[i][j] ='F';
				dfs(num+1);
				grid[i][j] = 'G';
			}
		}
	}
}
public static boolean valid(int x,int y) {
	return x>=0&&x<grid.length&&y>=0&&y<grid[x].length&&grid[x][y]!='T'&&grid[x][y]!='F';
}
public static boolean canreach() {
	boolean[][] visited = new boolean[grid.length][grid[0].length];
	visited[sx][sy] = true;
	LinkedList<State> q = new LinkedList<State>();
	q.add(new State(sx,sy));
	while(!q.isEmpty()) {
		State curr = q.removeFirst();
		for(int k=0;k<dx.length;k++) {
			int nx = curr.x+dx[k];
			int ny = curr.y+dy[k];
			if(valid(nx,ny)&&!visited[nx][ny]) {
				visited[nx][ny]	= true;
				q.add(new State(nx,ny));
			}
		}
	}
	return visited[ex][ey];
}
static class State {
	int x,y;
	public State(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
}
