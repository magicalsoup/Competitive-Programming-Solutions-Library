import java.io.*;
import java.util.*;

public class mockccc15s4{

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int MAXN = 100005;
    static int d [] = new int [MAXN];
    static int w [] = new int [MAXN];
    static long l [] = new long [MAXN];
    static long r [] = new long [MAXN];
    static long lr [] = new long [MAXN];
    static int n;
    static long c1, c2;
    
        public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
	out = new PrintWriter(new OutputStreamWriter(System.out));
       
        n = readInt();
        for (int i=0; i<n; i++){
            d[i] = readInt();
            w[i] = readInt();
        }
        for (int i=0; i<n; i++){
            if(i==0){
                l[i] = d[i];
                r[i] = d[i];
                lr[i] = Math.max(0, d[i]-w[i+1]);
            }
            else {
                l[i] = Math.max(0, d[i]-w[i-1]) + Math.min(l[i-1], r[i-1]);
                r[i] = d[i] + lr[i-1];
                 c1 = Math.max(0, d[i]-w[i+1]) + lr[i-1];
                 c2 = Math.min(l[i-1], r[i-1]) + Math.max(0, d[i]-w[i+1]-w[i-1]);
                 lr[i] = Math.min(c1, c2);
            }
        }
        out.println(Math.min(l[n-1], r[n-1]));
        out.close();
    }
    
                static String next () throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine().trim());
			return st.nextToken();
		}

		static int readInt () throws IOException {
			return Integer.parseInt(next());
		}
	}