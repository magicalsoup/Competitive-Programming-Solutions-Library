package Douwei;
import java.util.*;
 
public class BFS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
         
        Map<Integer, LinkedList> map = new HashMap<>();
         
        for(int x = 0; x < n + 1; x ++){
            map.put(x, new LinkedList<Integer>());
        }
        for(int x = 0; x < e; x ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        boolean[] visited = new boolean[n+1];
        Arrays.fill(visited, false);
         
        int current = sc.nextInt();
        int end = sc.nextInt();
        int length = 1;
        boolean found = false;
         
        Queue<Integer> order = new LinkedList<Integer>();
        order.add(current);
        order.add(-1);
         
        while(!found){
            if(order.peek()==-1){
                order.remove();
                if(order.peek() == null){
                    length = 1;
                    break;
                }
                current = order.peek();
                length ++;
                order.add(-1);
             
            }
            for(int x = 0; x < map.get(current).size(); x ++){
                if(!visited[(Integer)map.get(current).get(x)]){
                    if((Integer)map.get(current).get(x) == end){
                        found = true;
                    }
                    order.add((Integer)map.get(current).get(x));
                    visited[(Integer)map.get(current).get(x)] = true;
                }
            }
            order.remove();
            if(order.peek() == null){
                length = 0;
                break;
            }
            current = order.peek();
        }
        System.out.println(length);
    }
}