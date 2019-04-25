import java.util.*;
import java.io.*;
public class Misdirection {
	static boolean vis[][];
	static char g[][];

	public static void main(String[]args)throws IOException {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		g = new char[n][n]; vis = new boolean[n][n];
		int sx = -1, sy = -1; 
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < n; j++) {
				
				g[i][j] = s.charAt(j);
				
				if(g[i][j] == '*') {
					sy = i; sx = j;
				}
			}
		}
		
		int a = sc.nextInt(), b = sc.nextInt();
		int x = b, y = a;
		boolean possible = true;
		
		while(true) {
			
			if(g[y][x] == '*') {
				break;
			}
			
			if(vis[y][x]) {
				possible = false;
				break;
			}
			vis[y][x] = true;
			
			
			if(g[y][x] == 'v') {
				y = y + 1;
				if(y >= n) y = 0;
			}
			
			if(g[y][x] == '^') {
				y = y - 1;
				if(y < 0) y = n - 1;
			}
			
			if(g[y][x] == '>') {
				x = x + 1;
				if(x >= n) x = 0;
			}
			
			if(g[y][x] == '<') {
				x = x - 1;
				if(x < 0) x = n - 1;
			}	
		}
			
			
		if(possible)
			System.out.println(sx + " " + sy);
		else
			System.out.println("-1 -1");
	
		sc.close();
	}
}
