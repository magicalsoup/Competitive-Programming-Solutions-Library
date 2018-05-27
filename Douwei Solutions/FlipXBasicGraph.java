package Douwei;
import java.util.*;
public class FlipXBasicGraph {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char mat[][] = new char[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				mat[i][j] = sc.next().charAt(0);
		solve(mat);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j!=m-1)
				System.out.print(mat[i][j]+" ");
				else
					System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
	    static public void solve(char[][] board) {
	        int m = board.length;
	        if(m==0) return;
	        int n = board[0].length;
	        
	        for(int c=0; c<n; c++) {
	            if(board[0][c]=='O') spread(board,0,c);
	            if(board[m-1][c]=='O') spread(board,m-1,c);
	        }
	        for(int r=1; r<m-1; r++) {
	            if(board[r][0]=='O') spread(board,r,0);
	            if(board[r][n-1]=='O') spread(board,r,n-1);
	        }
	        
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                if(board[i][j]=='O') board[i][j]='X';
	                if(board[i][j]=='A') board[i][j]='O';
	            }
	        }
	    }
	   static  public void spread(char[][] board, int x, int y){
	        int m = board.length;
	        int n = board[0].length;
	        board[x][y] = 'A';
	        Queue<int[]> q = new LinkedList<>();
	        q.add(new int[]{x,y});
	        while(!q.isEmpty()){
	            int[] point = q.poll();
	            int i = point[0];
	            int j = point[1];
	            if(i>0 && board[i-1][j]=='O') {board[i-1][j] = 'A';q.add(new int[]{i-1,j});}
	            if(i<m-1 && board[i+1][j]=='O') {board[i+1][j] = 'A';q.add(new int[]{i+1,j});}
	            if(j>0 && board[i][j-1]=='O') {board[i][j-1] = 'A';q.add(new int[]{i,j-1});}
	            if(j<n-1 && board[i][j+1]=='O') {board[i][j+1] = 'A';q.add(new int[]{i,j+1});}
	        }
	        
	    }
}
