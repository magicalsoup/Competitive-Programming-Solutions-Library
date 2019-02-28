import java.util.*;
public class ccc19s3 {
	static int a[][] = new int[4][4];
	static boolean v[][] = new boolean[4][4];
	static int row[] = new int[4], col[] = new int[4];
	static int cnt = 0;
	static ArrayList<p> order = new ArrayList<p>();
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		initOrder();
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				String x = sc.next();	
				if(x.equals("X")) {
					v[i][j] = true; row[i]++; col[j]++; cnt++;
				}
				else a[i][j] = Integer.parseInt(x);
			}
		}
		
	    while(cnt > 0){
	    	next:{
		        for(int i=1; i<=3; i++)
		            if(row[i] == 1){ fillR(i); break next;}
		        for(int i=1; i<=3; i++)
		            if(col[i] == 1) { fillC(i); break next;}
		        for(p e: order)
		            if(v[e.first][e.second]) { fillCell(e.first, e.second); break next; }
		        for(int i=1; i<=3; i++)
		            for(int j=1; j<=3; j++)
		                if(v[i][j]) { fillCell(i, j); break next; }
	    	}
	    }
	    
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		sc.close();
	}
	static void initOrder() {
		order.add(new p(2 ,2)); // middle
		
		order.add(new p(2, 1)); // middle left
		
		order.add(new p(2, 3)); // middle right
		
		order.add(new p(1, 2)); // top middle
		
		order.add(new p(3, 2)); // bottom middle
	}
	static void fillCell(int r, int c){
	    row[r]--; col[c]--; cnt--; v[r][c]=false; a[r][c]=0;
	}
	
	static void fillR(int r){
	    if(v[r][1]) { a[r][1] = 2*a[r][2] - a[r][3]; col[1]--; v[r][1] = false; }
	    if(v[r][3]) { a[r][3] = 2*a[r][2] - a[r][1]; col[3]--; v[r][3] = false; }
	    if(v[r][2]) { a[r][2] = (a[r][1] + a[r][3])/2; col[2]--; v[r][2] = false; }
	    row[r]--; cnt--;
	}
	static void fillC(int c){
	    if(v[1][c]) { a[1][c] = 2*a[2][c] - a[3][c]; row[1]--; v[1][c]=false; }
	    if(v[3][c]) { a[3][c] = 2*a[2][c] - a[1][c]; row[3]--; v[3][c]=false; }
	    if(v[2][c]) { a[2][c] = (a[1][c] + a[3][c])/2; row[2]--; v[2][c]=false; }
	    col[c]--; cnt--;
	}
	static class p{
		int first, second;
		public p(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
}
