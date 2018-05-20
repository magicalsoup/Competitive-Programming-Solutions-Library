package Douwei;
import java.util.*;
public class MPIMaelstrom {
    public static int node;
    public static int graph[][];
     
    public static void main(String[] args){
    	@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        graph = new int[node][node];
        for(int i = 1; i < node; i++){
            for(int j = 0; j < i; j++){
                String temp = sc.next();
                if(temp.equals("x")){
                    graph[i][j] = 999999;
                    graph[j][i] = 999999;
                     
                }else{
                    graph[i][j] = Integer.parseInt(temp);
                    graph[j][i] = Integer.parseInt(temp);
                     
                }
            }
        }
        dijkstra();
 
    }
    public static void dijkstra(){
        int du[] = new int[node];
        Arrays.fill(du, 999999);
        du[0] = 0;
        boolean[] v = new boolean[node];
        int count = 0;
        while(count < node){
            int min = 999999999;
            int ind = 0;
            for(int i = 0; i < node; i++){ // find minimum in v[i] (undone array)
                if(!v[i] && du[i] < min){
                    min = du[i];
                    ind = i;
                     
                }
            }
            for(int i = 0; i < node; i++){
                if(!v[i] && du [ind] + graph[ind][i] < du[i]){
                    du[i] = du[ind] + graph[ind][i];
                }
            }
            v[ind] = true;
            count++;
             
        }
        int max = -1;
        for(int i = 0; i < du.length; i++){
            if( du[i] > max) max = du[i];
        }
        System.out.println(max);
    }
}