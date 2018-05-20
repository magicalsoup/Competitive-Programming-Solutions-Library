import java.util.*;
import java.io.*;
public class coci092p3{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter ps = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
     public static void main(String []args)throws IOException{
      int  n = readInt();
    int k = readInt();
    int[] nums = new int[n+1];
    for(int x=1;x<=n;x++)
    nums[x] = readInt()%360;
    boolean [][] dp = new boolean[2][360];
    dp[0][0] = true;
    for(int x = 1;x<=n;x++){
        for(int y = 359;y>=0;y--){
            if(dp[(x-1)%2][y]){
                dp[x%2][y] =true;
                for(int z = 1;z<=360;z++){
                    dp[x%2][(y+nums[x]*z)%360]= true;
                }
            }
        }
    }
    for(int x =0;x<k;x++){
        int num = readInt()%360;
        System.out.println(dp[n%2][num]? "YES":"NO");
    }
     }
     static String next() throws IOException{
         while(st==null||!st.hasMoreTokens())
         st = new StringTokenizer(br.readLine().trim());
         return st.nextToken();
     }
     static long readLong() throws IOException{
         return Long.parseLong(next());
     }
     static int readInt() throws IOException{
         return Integer.parseInt(next());
     }
     static double readDouble() throws IOException{
         return Double.parseDouble(next());
     }
     static String readLine() throws IOException{
         return br.readLine().trim();
     }
}
