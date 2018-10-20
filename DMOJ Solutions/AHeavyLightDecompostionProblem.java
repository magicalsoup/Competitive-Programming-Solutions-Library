import java.io.*;
import java.util.*;

public class AHeavyLightDecompostionProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), q = Integer.parseInt(tok[1]);
        String [] tok2 = br.readLine().split(" ");
        int [] val = new int[n+1];
        for(int i = 1; i < n+1; i++){
            val[i]=Integer.parseInt(tok2[i-1]);
        }
        @SuppressWarnings("unchecked")
		ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i] = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            String [] tok3 = br.readLine().split(" ");
            int a = Integer.parseInt(tok3[0]), b = Integer.parseInt(tok3[1]);
            x[a].add(b);
            x[b].add(a);
        }
        boolean [] vis;
        int [] prev;
        ArrayList<Integer>nodes=new ArrayList<>();
        Map<Integer,Integer>freq = new HashMap<>();
        for(int i = 0; i < q; i++){
            String [] tok3 = br.readLine().split(" ");
            int start = Integer.parseInt(tok3[1]), end = Integer.parseInt(tok3[2]);
            vis=new boolean[n+1];
            prev=new int[n+1];
            nodes.clear();
            freq.clear();
            dfs(start,x,vis,end,prev,0);
            int ind = end;
            while(ind!=0){
                nodes.add(val[ind]);
                ind = prev[ind];
            }
            if(tok3[0].equals("1")){
                double total = 0;
                for(int a : nodes) total += a;
                total/=nodes.size();
                System.out.println(Math.round(total));
            } else if (tok3[0].equals("2")){
                Collections.sort(nodes);
                if(nodes.size()==1){
                    System.out.println(nodes.get(0));
                } else if (nodes.size()%2!=0){
                    System.out.println(nodes.get(nodes.size()/2));
                } else  {
                    double total = 0;
                    total += nodes.get(nodes.size()/2);
                    total+=nodes.get(nodes.size()/2-1);
                    total/=2;
                    System.out.println(Math.round(total));
                }
            } else if (tok3[0].equals("3")){
                for(int a : nodes){
                    if(freq.get(a)!=null){
                        freq.put(a,freq.get(a)+1);
                    } else {
                        freq.put(a,1);
                    }
                }
                int max = 0;
                for(int a : freq.values()){
                    if(a>max) max=a;
                }
                int min =Integer.MAX_VALUE;
                for(int a : freq.keySet()){
                    if(freq.get(a)==max && a<min){
                        min=a;
                    }
                }
                System.out.println(min);
            }
        }
    }
    public static void dfs(int start, ArrayList<Integer>[]x, boolean[]vis, int end,int[]prev,int pre){
        prev[start]=pre;
        vis[start]=true;
        if(start==end) return;
        for(int i = 0; i < x[start].size(); i++){
            if(!vis[x[start].get(i)]){
                dfs(x[start].get(i),x,vis,end,prev,start);
            }
        }
    }
}
