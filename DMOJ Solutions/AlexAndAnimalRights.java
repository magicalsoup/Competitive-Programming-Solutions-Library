import java.util.*;
public class AlexAndAnimalRights {
	static char[][] grid;
	static int [] moveX = {-1, 1, 0 , 0}, moveY = {0, 0, -1, 1};
	static int r, c;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); c = sc.nextInt(); grid = new char[r][c];
		for(int i = 0; i < r; i++) grid[i] = sc.next().toCharArray();
		int ans = 0;
		for(int i = 0; i < r; i++){ 
			for(int j = 0; j < c; j++){
				if(dfs(i,j) && grid[i][j] == 'X') ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	static boolean dfs(int i, int j){
		boolean flag = false;
		if(grid[i][j] == 'M') flag = true;
		grid[i][j]  = 'X';
		for(int x = 0; x < 4; x++){
			int movex = moveX[x] + i, movey = moveY[x] + j;
			if(movex < 0 || movey < 0 || movex >= r || movey >= c || grid[movex][movey] == 'X' || grid[movex][movey] == '#') continue;
			if(dfs(movex, movey)) flag = !dfs(movex, movey);
		}
		return flag;
	}
}
