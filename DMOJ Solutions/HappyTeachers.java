import java.io.*;
import java.util.*;
public class HappyTeachers{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), e[] = new int[n + 1], p[] = new int[n + 1], h[] = new int[n + 1];
    	for(int i = 1; i <= n; i++) { h[i] = readInt(); e[i] = readInt(); p[i] = readInt();}
    	int s = readInt(); int dp[][] = new int[n + 1][s + 1]; int dur[][] = new int[n + 1][s + 1];
        for(int i = 1; i <= n; i++){
            for(int v = 0, w = p[i], cnt = 1; h[i] > 0 && w <= s; h[i] -= e[i], w += p[i], cnt++){
                v += h[i];
                for(int j = 0; j <= s; j++){
                    if(dp[i-1][j] > dp[i][j]) {
                    	dp[i][j] = dp[i-1][j];
                    	dur[i][j] = dur[i-1][j];
                    }
                    if(j >= w){
                        int val = dp[i - 1][j - w] + v, len = dur[i - 1][j - w] + cnt;
                        if(val > dp[i][j]) {dp[i][j] = val; dur[i][j] = len;}
                        else if(val == dp[i][j] && len < dur[i][j]) {dp[i][j] = val; dur[i][j] = len;}
                    }
                }
            }
        }
        pw.printf("%d\n%d\n", dp[n][s], dur[n][s]); pw.close();
    }
	static String next () throws IOException {
  	  while (st == null || !st.hasMoreTokens())
  		  st = new StringTokenizer(br.readLine().trim());
  	  return st.nextToken();
    }
    
    static long readLong () throws IOException {
  	  return Long.parseLong(next());
    }

    static int readInt () throws IOException {
  	  return Integer.parseInt(next());
    }

    static double readDouble () throws IOException {
  	  return Double.parseDouble(next());
    }
    
    static String readLine () throws IOException {
  	  return br.readLine().trim();
    } 
}
