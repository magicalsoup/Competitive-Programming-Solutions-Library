package Douwei;
import java.io.*;
import java.util.*;
public class SubsetSumsDP{
    static long[][] cache = new long[8000][40];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        init();
        int n = Integer.parseInt(br.readLine());
        int m = n * (n+1) / 2;
        if(m % 2 != 0) out.println("0");
        else out.println(numberOfWays(m / 2, n) / 2);
        br.close();
        out.close();
    }
    public static void init() {
        for(int i = 0; i < cache.length; ++i)
            Arrays.fill(cache[i], -1);
    }
    public static long numberOfWays(int n, int k) {
        if(n < 0 || k < 0) return 0;
        if(cache[n][k] != -1) return cache[n][k];
        if(n == 0 && k == 0) return cache[n][k] = 1;
        return cache[n][k] = numberOfWays(n, k - 1) + numberOfWays(n - k, k - 1);
    }
}