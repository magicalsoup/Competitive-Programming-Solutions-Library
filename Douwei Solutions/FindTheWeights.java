package Douwei;
import java.util.*;
public class FindTheWeights{
    public static class pair{
        int value;
        int node;
        public pair(int x, int y){
            value=y;
            node=x;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int nodes =sc.nextInt();
        int edges=sc.nextInt();
        HashMap<Integer, ArrayList<pair>> num=new HashMap<Integer, ArrayList<pair>>();
        for(int count=0;count<=nodes;count++){
            num.put(count, new ArrayList<pair>());
        }
         
        for(int count=0;count<edges;count++){
            int next=sc.nextInt();
            int next2=sc.nextInt();
            int weight=sc.nextInt();
            num.get(next).add(new pair(next2, weight*-1));
            num.get(next2).add(new pair(next, weight));
        }
        int max=sc.nextInt();
        for(int count=0;count<max;count++){
            int node=sc.nextInt();
            int difference=0;
            String inning="in-degree list";
            String outing="out-degree list";
            ArrayList<Integer> in=new ArrayList<Integer>();
            ArrayList<Integer> out=new ArrayList<Integer>();
            for(int count2=0;count2<num.get(node).size();count2++){
                if(num.get(node).get(count2).value<0){
                    out.add(num.get(node).get(count2).node);
                }
                else{
                    in.add(num.get(node).get(count2).node);
                }
                difference+=num.get(node).get(count2).value;
            }
            System.out.println("difference " +difference);
             
            Integer[] ins=new Integer[in.size()];
            Integer[] outs=new Integer[out.size()];
            outs=out.toArray(outs);
            ins=in.toArray(ins);
            Arrays.sort(outs);
            Arrays.sort(ins);
            for(int count2=0;count2<in.size();count2++){
                inning+=" "+ins[count2];
            }
             
            for(int count2=0;count2<out.size();count2++){
                outing+=" "+outs[count2];
            }
            System.out.println(inning);
            System.out.println(outing);
        }
         
        sc.close();
    }
 
}