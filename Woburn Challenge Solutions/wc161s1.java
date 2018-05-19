import java.io.*;
public class wc161s1{
     public static void main(String []args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String token[] = in.readLine().split(" ");
        int n =Integer.parseInt(token[0]);
        int d = Integer.parseInt(token[1]);
        int r =0;
        String iii = in.readLine();
        int[]aa = new int[n+2];
        aa[0] = -1;
        for(int a = 1;a<=n;a++)
        {
            if(iii.charAt(a-1)=='.'&&aa[a-1]<=0)
            {
                r++;
            }
            if(iii.charAt(a-1)=='.')
            {
                aa[a] = r;
            }
            else
            {
                aa[a] = -r-1;
            }
        }
        int dp[] = new int[r+1];
        int dis[] = new int[r+1];
        int disdis[] =  new int[r+1];
        for(int a=1;a<=n;a++)
        {
            if(aa[a]>0)
            {
                if(dis[aa[a]]==0)
                {
                    if(a-d<=0)
                    {
                        dis[aa[a]] = 1;
                    }
                    else
                    {
                        if(aa[a-d]<=0)
                        {
                            dis[aa[a]] = -aa[a-d];
                        }
                        else{
                            dis[aa[a]] = aa[a-d];
                        }
                    }
                }
            }
        }
        for(int a=1;a<=n;a++)
        {
            if(aa[a]>0)
            {
                if(disdis[aa[a]]==0)
                {
                    disdis[aa[a]] = dis[dis[aa[a]]];
                }
            }
        }
        for(int a =1;a<=r;a++)
        {
            dp[a] = dp[disdis[a]-1]+1;
        }
        System.out.println(dp[r]);
     }
}
