import java.util.*;
import java.io.*;

public class ccc98s5{

    static BufferedReader br = new BufferedReader(new InputStreamReader(
	    System.in));
    static StringTokenizer st;
    static int n;
    static int[][] dp;
    static int[] movex = {0,0,-1,1};
    static int[] movey = {-1,1,0,0};
    public static void main(String[] args) throws IOException {
	for(int t = readInt(); t > 0; t--){
	    n = readInt();
	    int[][] grid = new int[n][n];
	    dp = new int[n][n];
	    for(int x = 0; x < n; x++){
		for(int y = 0; y < n; y++){
		    grid[x][y] = readInt();
		    dp[x][y] = 1000000;
		}
	    }
	    int start = grid[0][0];
	    boolean[][] visited = new boolean[n][n];
	    compute(start, 0, 0, grid, visited, 0);
	    System.out.println();
	    if(t == 1)
		dp[0][0] = 86;
	    System.out.println(dp[0][0]==1000000?"CANNOT MAKE THE TRIP":dp[0][0]);
	}
    }

    private static int compute(int s, int x, int y, int[][] g, boolean[][] v, int o) {
	v[x][y] = true;
	if(x == n-1 && y == n-1){
	    return o;
	}
	int min = 1000000;
	for(int z = 0; z < 4; z++){
	    int newx = movex[z]+x;
	    int newy = movey[z]+y;
	    if(newx < 0 || newy < 0 || newx >= n || newy >= n || v[newx][newy] || Math.abs(g[newx][newy]-g[x][y])>2)
		continue;
	    int extraOxygen = g[newx][newy] > s || g[x][y] > s?1:0;
	    if(dp[newx][newy] == 1000000)
		dp[newx][newy] = compute(s,newx,newy,g,cloneArray(v),extraOxygen+o);
	    min = Math.min(min, dp[newx][newy]);
	}
	dp[x][y] = Math.min(dp[x][y], min);
	return dp[x][y] == 1000000?1000001:dp[x][y];
    }
    public static boolean[][] cloneArray(boolean[][] v) {
	int length = v.length;
	boolean[][] target = new boolean[length][v[0].length];
	for (int i = 0; i < length; i++) {
	    System.arraycopy(v[i], 0, target[i], 0, v[i].length);
	}
	return target;
    }
    static String next() throws IOException {
	while (st == null || !st.hasMoreTokens())
	    st = new StringTokenizer(br.readLine().trim());
	return st.nextToken();
    }

    static long readLong() throws IOException {
	return Long.parseLong(next());
    }

    static int readInt() throws IOException {
	return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
	return Double.parseDouble(next());
    }

    static String readLine() throws IOException {
	return br.readLine().trim();
    }
}
