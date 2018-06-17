package Douwei;
import java.util.*;
public class FatMouseAndCheese {
	static int b[][] = new int[100][100];
	static int a[][] = new int[100][100];
	static boolean status[][] = new boolean[100][100];
	static int n,k;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		n = sc.nextInt();
		k = sc.nextInt();
		if(n==-1&&k==-1)
			break;
	      for( int i = 0; i < n; i++ )
	          for( int j = 0; j < n; j++ ) {
	             a[i][j] = sc.nextInt();
	              b[i][j] = a[i][j];
	              status[i][j] = false; 
	          }
	      DP(0,0);
	      System.out.println(a[0][0]);
	      sc.close();
		}
	}
	static void DP(int x,int y) {
	    int max = 0; 
	    for( int i = x - k; i <= x + k; i++ ) {
	        if(i < 0 || i >= n ||i == x || b[i][y] <= b[x][y] )
	            continue;
	        if( !status[i][y] ) 
	            DP( i, y );
	        if( a[i][y] > max )  
	            max = a[i][y]; 
	    }
	    for( int j = y - k; j <= y + k; j++ ) {
	        if(     j < 0 || j >= n ||j == y || b[x][j] <= b[x][y] )
	            continue;
	        if( !status[x][j] ) 
	            DP( x, j );
	        if( a[x][j] > max )  
	            max = a[x][j];
	    }
	    a[x][y] += max;
	    status[x][y] = true; 
	}
}
