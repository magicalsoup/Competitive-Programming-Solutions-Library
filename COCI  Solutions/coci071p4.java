import java.util.*;
public class coci071p4{
    static char[]c1 = {'(','{','['};
    static char[]c2 = {')','}',']'};
    static char[]c;
    static final int MOD = 100000;
    static long [][] dp;
    static boolean flag = false;
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n][n];
        for(int x=0;x<n;x++)
        for(int y=0;y<n;y++)
        dp[x][y] = -1;
        c = sc.next().toCharArray();
        long res = compute(0,n-1);
        if(flag)
        System.out.printf("%05d",res);
        else
        System.out.println(compute(0,n-1));
     }
     public static long compute(int i,int j){
         if(i>j)
         return 1;
         if(dp[i][j]!=-1)
         return dp[i][j];
         long total =0;
         for(int x=i+1;x<=j;x+=2)
            for(int z=0;z<3;z++)
                if((c[i]==c1[z]||c[i]=='?')&&(c[x]==c2[z]||c[x]=='?')){
                    total+=(compute(i+1,x-1))*(compute(x+1,j));
                    if(total>100000)
                    flag = true;
                    total%=MOD;
                }
                dp[i][j] = total%MOD;
                return total%MOD;
     }
}
