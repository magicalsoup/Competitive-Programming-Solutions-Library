import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class bruteforce {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
        int N = readInt(), K = readInt();
        int cnt=0;
        for(int i=0; i<N; i++) {
            String s = next();
            for(int j=0; j<s.length(); j++)
                if(s.charAt(j) == 'X') cnt++;
        }
        System.out.println(cnt);
    }
    static String next() throws IOException {
        while(st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}
