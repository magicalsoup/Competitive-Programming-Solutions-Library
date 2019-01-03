import java.io.*;
import java.util.*;

public class Main {
    static int N = 0, far = 0; static long len  = 0;
    static ArrayList<E>adj[]; 
    static long dis[], ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());  
        N = Integer.parseInt(st.nextToken());
        dis = new long[N+1];
        adj = new ArrayList[N+1];
        for(int i=0; i<=N; i++)adj[i] = new ArrayList<E>();
        for(int i = 1; i<N; i++){
            String a = input.readLine(); String[]arr = a.split(" ");
            int u = Integer.parseInt(arr[0]); int v = Integer.parseInt(arr[1]); int w = Integer.parseInt(arr[2]);
            adj[u].add(new E(v,w)); adj[v].add(new E(u,w));
        }
        BFS(1); 
        int d1 = far; BFS(d1); int d2 = far;
        for(int i=1; i<=N; i++)
            if(i!=d2)ans = Math.max(ans, dis[i]);
        BFS(d2);
            for(int i = 1; i<=N; i++)
                if(i!=d1)ans = Math.max(ans, dis[i]);
            System.out.println(ans);
    }
    public static void BFS(int st){
        boolean vis[] = new boolean[N+1];
        len = 0;
        Queue<Integer>Q = new LinkedList<Integer>();
        Q.add(st); 
        dis[st] = 0; 
        vis[st] = true;
        while(!Q.isEmpty()){
            int cur = Q.poll();
            if(dis[cur]>len){len = dis[cur]; far = cur;}
            for(E e: adj[cur]){
                if(!vis[e.v]){Q.add(e.v); vis[e.v] = true; dis[e.v] = dis[cur]+e.w;}
            }
        }
    }
    static class E{
        int v,w;
        E(int v0,int w0){v = v0; w = w0;}
    }
}
