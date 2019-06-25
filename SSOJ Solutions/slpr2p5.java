import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class slpr2p5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
        int N = readInt(), M = readInt(), K = readInt();
        long dif[] = new long[N+1];
        for(int i=0; i<M; i++) {
            int a = readInt(), b = readInt();
            long c = readLong();
            update(dif, a-1, b-1, c);
        }
        long ans[] = convertBack(dif);
        int cnt=0;
        for(int i=0; i<dif.length; i++)
            if(ans[i] == K) cnt++;

        System.out.println(cnt);
    }
    static void update(long dif[], int l, int r, long x){
        dif[l] += x;
        dif[r+1] -=x;
    }
    static long[] convertBack(long dif[]){
        long ans[] = new long[dif.length];
        ans[0] = dif[0];
        for(int i=1; i<ans.length; i++)
            ans[i] = dif[i] + ans[i-1];
        return ans;
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
