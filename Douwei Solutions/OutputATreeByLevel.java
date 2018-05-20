package Douwei;
import java.util.*;
public class OutputATreeByLevel {
    public static class pair{
        int val;
        int son;
        public pair(int val, int son) {
            this.val=val;
            this.son=son;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        sc.nextInt();
        int lines=sc.nextInt();
        sc.nextLine();
        HashMap<Integer,ArrayList<pair>> tree=new HashMap<>();
        for(int count=0;count<lines;count++) {
            String next=sc.nextLine();
            String[] stuff=next.split(" ");
            String[] stuff2=stuff[0].split("#");
            int from=Integer.parseInt(stuff2[0]);
            int val=Integer.parseInt(stuff2[1]);
             
            ArrayList<pair> forkids = new ArrayList<>();
             
            for(int count2=1;count2<stuff.length;count2++) {
                stuff2=stuff[count2].split("#");
                int to=Integer.parseInt(stuff2[0]);
                val=Integer.parseInt(stuff2[1]);
                forkids.add( new pair(val, to));

            }
            tree.put(from, forkids);
             
        }
         
        String rval  = sc.nextLine();
        pair r = new pair(Integer.parseInt(rval.split("#")[1]),Integer.parseInt(rval.split("#")[0]));
        Queue<pair> queue=new LinkedList<>();
        queue.offer(r);
        while(!queue.isEmpty()) {
            pair next=queue.poll();
            System.out.print(next.val + " ");
            ArrayList<pair> kid = tree.get(next.son);
            if(kid==null) continue;
                 
            for(pair p : kid) {
                        queue.offer( p );
            }
        }
         
    }
 
}