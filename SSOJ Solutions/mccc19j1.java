import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class mccc19j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int Q = readInt();
        while(Q-- >0){
            int f1 = readInt(), f2 = readInt();
            if(f2 > f1)
                System.out.println("towards");
            else if(f2 < f1)
                System.out.println("away");
            else
                System.out.println("none");
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
}
