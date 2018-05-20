package Douwei;
import java.util.*;
 
public class RatMaze {
 
    static boolean[][] modified;
    static int[][] graph;
    static int size;
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
         
        graph = new int[size][size];
        modified = new boolean[size][size];
         
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                graph[i][j] = sc.nextInt();
            }
        }
         
         
        if(dfs(0,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
         
    }
     
    static boolean dfs(int row, int col){
         
        if(row == size - 1 && col == size - 1){
            return true;
        }
         
        if( (row > size - 1 || row < 0 || col > size - 1 || col < 0) || graph[row][col] == 1 || modified[row][col] == true){
            return false;
        }
         
        modified[row][col] = true;
         
        boolean left = dfs(row, col-1);
         
        boolean right = dfs(row, col+1);
 
        boolean up = dfs(row-1, col);
         
        boolean down = dfs(row+1, col);
         
        modified[row][col] = false;
         
        if(left || right || up || down){
            return true;
        }
         
        return false;
    }
}