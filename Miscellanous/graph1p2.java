import java.util.*;
import java.io.*;
public class graph1p2 {
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Queue<Integer>q = new LinkedList<Integer>();
	int n = Integer.parseInt(br.readLine());
	int[][]grid = new int[n][n];
	String[] line;
	int[]depth=  new int[n];
	for(int i=0;i<n;i++) {
		line=  br.readLine().split(" ");
		for(int j=0;j<n;j++) {
			grid[i][j] 	= Integer.parseInt(line[j]);
		}
	}
	q.offer(0);
	while(!q.isEmpty()) {
		int current = q.remove();
		for(int i=0;i<n;i++) {
			if(grid[current][i]==1&&depth[i] ==0) {
				q.add(i);
				depth[i] = depth[current]+1;
			}
		}
	}
	System.out.println(depth[n-1]);
}
}
