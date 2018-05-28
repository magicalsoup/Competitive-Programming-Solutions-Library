package Douwei;
import java.util.*;
public class Hopscotch{
    static Set<String> bob = new HashSet<String>();
    static int[][] grid;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        grid = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                grid[i][j] = sc.nextInt();
            }
        }
         
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                //i,j is the starting coordinate
                hop(i,j,"");
            }
        }
        System.out.println(bob.size());
        sc.close();
    }
     
    public static void hop(int x,int y,String str){
        if(x<0||y<0||x>4||y>4||str.length()>6) return;
        if(str.length()==6){
            bob.add(str);
            return;
        }
        int w = grid[x][y];
        str = str + w;
        hop(x+1,y,str);
        hop(x-1,y,str);
        hop(x,y+1,str);
        hop(x,y-1,str);
    }
}
