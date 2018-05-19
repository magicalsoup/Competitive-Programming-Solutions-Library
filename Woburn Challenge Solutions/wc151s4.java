import java.util.Scanner;
public class wc151s4{
    public static void main(String[]args){
    	@SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int maxn = 205;
    int N,K;
    int P[] = new int[maxn];
     int C[] = new int[maxn];
      int F[] = new int[maxn];
       int DP[][] = new int[maxn][maxn];
       int DP2[][] = new int[maxn][maxn];
       N = scan.nextInt();
       K = scan.nextInt();
       for(int i=2;i<=N;i++) {P[i] = scan.nextInt();C[i] = scan.nextInt(); F[i] = scan.nextInt();}
       for(int i =N;i>=1;i--){
           int n= C[i];
           for(int j=0;j<=K;j++){
               for(int k=0;k<=K-j;k++)
               DP2[n][j + k] = Math.max(DP2[n][j + k],
             DP[n][k] + Math.min(F[i], P[i] + DP[i][j]));
             for (int k = 1; k <= K - j + 1; k++)
                DP2[n][j + k] = Math.max(DP2[n][j + k],
                 DP[n][k - 1] + P[i] + DP[i][j]);
                    }
         for (int j = 0; j <= K; j++) {
                 DP[n][j] = Math.max(DP[n][j], DP2[n][j]);
           }
       }
    int ans =0;
    for(int i=0;i<=N;i++) ans = Math.max(ans,DP[1][i]);
    System.out.println(ans);
    //System.exit(0);
    }
}
