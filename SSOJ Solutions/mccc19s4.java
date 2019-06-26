import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class mccc19s4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int p[];
    static StringTokenizer st;
    public static void main(String[]args) throws IOException {
        int N = readInt(), M = readInt();
        Edge edges[] = new Edge[M];
        p = new int[N+1];
        for(int i=0; i<=N; i++)
            p[i] = i;
        for(int i=0; i<M; i++)
            edges[i] = new Edge(readInt(), readInt(), readLong());
        Arrays.sort(edges);
        long mst=0;
        int cnt=0;
        for(int i=0; i<M; i++) {
            if(cnt == N-1) break;
            int u = edges[i].u;
            int v = edges[i].v;
            long w = edges[i].w;
            int fu = find(u), fv = find(v);
            if(fu != fv) {
                p[fu] = fv;
                cnt++;
                mst += w;
            }
        }
        System.out.println(mst);
    }
    static int find(int d) {
        if(d != p[d])
            p[d] = find(p[d]);
        return p[d];
    }
    static class Edge implements Comparable<Edge>{
        int u, v; long w;
        public Edge(int u, int v, long w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
        @Override
        public int compareTo(Edge other){
            return Long.compare(w, other.w);
        }
    }
    static String next() throws IOException {
        while(st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
}
