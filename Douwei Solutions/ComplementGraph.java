package Douwei;
import java.util.*;
public class ComplementGraph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int e = sc.nextInt();
        Map<Integer, LinkedList> grid = new HashMap<Integer, LinkedList>();
        for(int x = 0; x < n; x ++){
            grid.put(x, new LinkedList<Integer>());
        }
        for(int x = 0; x < e; x ++){
            int y = sc.nextInt();
            int z = sc.nextInt();
            grid.get(y).add(z);
            grid.get(z).add(y);
        }
        for(int x = 1; x <= n-1; x ++){
            System.out.print(x+":");
            for(int y = 1; y <= n-1; y ++){
                if(y != x && !grid.get(x).contains(y)){
                    System.out.print(y + " ");
                }
            }
            System.out.println("");
        }
    }
}
