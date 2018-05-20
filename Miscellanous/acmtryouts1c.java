import java.util.*;
public class acmtryouts1c{
    public static void main(String []args){
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for(int z = 1; z<=t;z++)
            {
                int h =scan.nextInt()+1;
                int w =scan.nextInt();
                int n  = scan.nextInt();
                scan.nextLine();
                char[][] grid = new char[h][w];
                for(int j=0;j<w;j++)
                grid[0][j] = 'E';
                for(int i=1;i<h;i++)
                {
                    String row = scan.nextLine();
                    for(int j=0;j<w;j++)
                    grid[i][j] = row.charAt(j);
                }
                int r =0;
                int c =0;
                int treasure = 0;
                for(int y = 1;y<=n;y++)
                {
                    while(r<h-1&&grid[r+1][c]=='E')
                    r++;
                    switch(scan.nextLine().charAt(0)){
                        case 'L':
                            if(c>0&&grid[r][c-1]!='S')c--;
                            break;
                        case 'R':
                            if(c<w-1&&grid[r][c+1]!='S')c++;
                            break;
                            default:
                            if(r<h-1&&grid[r+1][c]!='S')r++;
                    }
                    if(grid[r][c]=='T')treasure++;
                    grid[r][c]='E';
                }
                System.out.println(treasure);
            }
     }
}
