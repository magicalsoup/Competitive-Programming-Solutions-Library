import java.util.*;
public class cake{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    long[][]grid = new long[m+2][n+2];
    for(int i=0;i<k;i++){
        int x = sc.nextInt();
        int y=  sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        grid[y][x]++;
        grid[y1+1][x1+1]++;
        grid[y][x1+1]--;
        grid[y1+1][x]--;
    }
    for(int i=0;i<2;i++){
        for(int j=1;j<=m+1;j++){
            for(int t =1;t<=n;t++){
                grid[j][t] = grid[j][t]+grid[j][t-1]+grid[j-1][t]-grid[j-1][t-1];
            }
        }
    }
    int q=  sc.nextInt();
    for(int i=0;i<q;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println(grid[y1][x1]+grid[y-1][x-1]-grid[y1][x-1]-grid[y-1][x1]);
    }
     }
}
