package Douwei;
import java.util.*;
  
public class CityGraphTraversal {
    static boolean[] visit;
    static Map<Integer,LinkedList<Integer>> map;
      
      
    public static boolean dfs(int start, int end) {
         
        
        if( end == start) return true;
        LinkedList<Integer> temp = map.get(start);
        for( int a : temp ){
        if(!visit[a]) {  
            visit[a]=true;
            if( dfs(a, end) ) return true;
            }
        }
          
        return false;
    }
                                                                                      
      
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
  
    map = new HashMap<>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a,b;
    visit = new boolean[n];
    Arrays.fill( visit, false);
      
    for(int i = 0; i<n; i++) 
        map.put(i, new LinkedList<Integer>()); 
      
    for(int i = 0; i<m; i++) {
        a = sc.nextInt();
        b = sc.nextInt();
        map.get(a).add(b);
        map.get(b).add(a);
    }
      
    if(dfs(0,n-1))
    System.out.println("Yes");
    else
        System.out.println("No");
  
      
    }   
}