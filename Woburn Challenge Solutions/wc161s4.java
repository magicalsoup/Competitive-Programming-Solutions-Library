import java.util.*;
public class wc161s4{
    static int n,m;
    static double dp[][] = new double[2005][4005];
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc=  new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        long tot = (long)n*(n-1)/2;
        dp[0][0]= 1.0;
        for(int i=0;i<m;i++){
            for(int j=0;j<=Math.min(i*2,n);j++){
                int k = n-j;
                long c = (long)j*(j-1)/2;
                dp[i+1][j] +=dp[i][j]*c/tot;
                c = (long)j*k;
                dp[i+1][j+1]+=dp[i][j]*c/tot;
                c = (long)k*(k-1)/2;
                dp[i+1][j+2]+=dp[i][j]*c/tot;
            }
        }
        double ans =0;
        for(int i=0;i<=Math.min(m*2,n);i++){
            ans+=i*dp[m][i];
        }
        System.out.println(String.format("%.6f",ans));
     }
}
