import java.util.*;
public class wc161s2{
    static class Edge{
        int a,b,w;
        Edge(int aa,int bb,int ww){
            a =aa;
            b = bb;
            w = ww;
        }
    }
    static boolean trim(int cur,int parent){
        List<Edge> temp = paths.get(cur);
        for(int i=0;i<temp.size();i++){
            if(temp.get(i).b!=parent){
                if(trim(temp.get(i).b,cur)){
                    temp.remove(i);
                    i--;
                }
            }
        }
        if(paths.get(cur).size()==1&&useful.get(cur)==null)return true;
        return false;
    }
    static int add(int cur,int parent){
        int total = 0;
    List<Edge> temp = paths.get(cur);
    for(int i=0;i<temp.size();i++){
        if(temp.get(i).b!=parent){
            total+=temp.get(i).w+add(temp.get(i).b,cur);
        }
    }
    return total;
    }
    static List<List<Edge>> paths;
    static Map<Integer, Boolean> useful;
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        useful = new HashMap<Integer, Boolean>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        paths = new ArrayList<List<Edge>>(n);
        for(int i=0;i<n;i++)
        paths.add(new ArrayList<Edge>());
        for(int i=0;i<n-1;i++){
            int a=  sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int m = sc.nextInt();
            paths.get(a).add(new Edge(a,b,m));
            paths.get(b).add(new Edge(b,a,m));
        }
        for(int i=0;i<k;i++)
        useful.put(sc.nextInt()-1,true);
        trim(0,-1);
        System.out.println(add(0,-1));
     }
}
