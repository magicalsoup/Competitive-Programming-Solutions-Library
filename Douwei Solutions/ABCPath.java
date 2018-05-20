package Douwei;
import java.util.*;
public class ABCPath{
    public static char[][] grid;
    public static int H;
    public static int W;
     
    public static int dfs(int x, int y, char curchar){
        if(x<0||y<0||x>=W||y>=H){
            return 0;
        }
        if(curchar!=grid[x][y]){
            return 0;
        }
        curchar+=1;
        int a = Math.max(dfs(x, y+1, curchar), dfs(x, y-1, curchar));
        int b = Math.max(dfs(x+1, y+1, curchar), dfs(x+1, y-1, curchar));
        int c = Math.max(dfs(x-1, y+1, curchar), dfs(x-1, y-1, curchar));
        int d = Math.max(dfs(x+1, y, curchar), dfs(x-1, y, curchar));
         
        return(1+Math.max(Math.max(a, b), Math.max(c, d)));
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casenum=0;
        while(true){
            casenum=casenum+1;
            H = sc.nextInt();
            W = sc.nextInt();
             
            Queue<Integer> xq = new LinkedList<Integer>();
            Queue<Integer> yq = new LinkedList<Integer>();
             
            //ESCAPE
            if(H==0||W==0){
                break;
            }
             
            //INPUT and Gridding
            sc.nextLine();
            grid = new char[W][H];
            for(int i=0; i<H; i++){
                String temp = sc.nextLine();
                for(int j=0; j<W; j++){
                    if(temp.charAt(j)=='A'){
                        xq.add(j);
                        yq.add(i);
                    }
                    grid[j][i]=temp.charAt(j);
                }
            }
            int curmax=-1;
            while(!xq.isEmpty()){
                int curx = xq.poll();
                int cury = yq.poll();
                 
                curmax=Math.max(curmax, dfs(curx, cury, 'A'));
            }
             
            System.out.println("Case_"+casenum+":_"+curmax);
        }
    }
}