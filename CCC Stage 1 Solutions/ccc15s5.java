import java.util.*;
public class ccc15s5{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        a[i] = scan.nextInt();
        int m = scan.nextInt();
        if(m==0){
            int[][]dp = new int[n][2];
            dp[0][1] = a[0];
            for(int i=1;i<n;i++)
            {
                dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
                dp[i][1] = a[i]+dp[i-1][0];
            }
            System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
        }
        else{
            int[] b = new int[m];
            for(int i=0;i<m;i++)
            b[i] = scan.nextInt();
            Arrays.sort(b);
            int[][][][]dp = new int[n][2][m+1][m+1];
            for(int i=0;i<n;i++)
                for(int l = 0;l<=m;l++)
                for(int s= 0;s<=m;s++)
                {
                    dp[i][0][l][s] = -1;
                    dp[i][1][l][s]=-1;
                }
                dp[0][1][0][0] = a[0];
                dp[0][1][0][1] = a[0];
                dp[0][0][0][0] = 0;
                dp[0][0][1][0] = 0;
                for(int i=0;i<n-1;i++)  
                {
                    for(int l=0;l<=m;l++)
                    for(int s=0;s<=m;s++)
                    {
                        if(dp[i][0][l][s]>=0)
                        dp[i+1][1][l][s] = Math.max(dp[i+1][1][l][s],dp[i][0][l][s]+a[i+1]);
                        dp[i+1][0][l][s]=Math.max(dp[i+1][0][l][s],dp[i][0][l][s]);
                        dp[i+1][0][l][s]=Math.max(dp[i+1][0][l][s],dp[i][1][l][s]);
                    
                        if(l+s<m)
                        {
                            if(dp[i][1][l][s]>=0)
                            dp[i+1][1][l][s+1] = Math.max(dp[i+1][1][l][s+1],dp[i][1][l][s]+a[i+1]);
                            dp[i+1][0][l+1][s] = Math.max(dp[i+1][0][l+1][s],dp[i][0][l][s]);
                        }
                    }
                }
            int maxs,curs;
            maxs =0;
            for(int l=0;l<=m;l++)
            for(int s =0;s<=m;s++)
            {
                curs = dp[n-1][0][l][s];
                if(curs>=0)
                {
                    for(int i = m-l;i<m;i++)
                    curs+=b[i];
                    for(int i=0;m-l-1-i>=s+i;i++)
                    curs+=b[m-l-1-i];
                    maxs = Math.max(maxs,curs);
                }
                curs = dp[n-1][1][l][s];
                if(curs>=0)
                {
                    for(int i=m-l;i<m;i++)
                    curs+=b[i];
                    for(int i=0;m-l-1-i>s+i;i++)
                    curs+=b[m-l-1-i];
                    maxs = Math.max(maxs,curs);
                }
            }
            System.out.println(maxs);
        }
     }
}