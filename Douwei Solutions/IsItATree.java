package Douwei;
import java.util.*;
public class IsItATree {
	static boolean visited[];
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int om = m;
		boolean[][] matrix = new boolean[n][n];
		int s = 0;
		while(m-->0){
			int a = sc.nextInt()-1;
			s = a;
			int b = sc.nextInt()-1;
			
			matrix[a][b] = true;
			matrix[b][a] = true;
		}
		sc.close();
		visited = new boolean[n];
		visited[s] = true;
		int connect = connected(matrix,s);
		System.out.println((n-1==om&&connect==n)?"YES":"NO");
	}
	public static int connected(boolean[][] matrix, int node){
		int connect = 1;
		for(int i = 0; i < matrix.length; i++ ){
			if(matrix[node][i] && !visited[i]){
				visited[i] = true;
				connect+=connected(matrix,i);
			}
		}
		return connect;
	}
}
