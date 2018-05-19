import java.util.*;
public class wc154s3 {
    public static void main(String[]args){
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int [][] a = new int[2][n];
        for(int i=0;i<2;i++)
        for(int j=0;j<n;j++)
        a[i][j] = scan.nextInt();
        if(r>=0)
        {
            int total =0;
            for(int i=0;i<2;i++)
                for(int j=0;j<n;j++)
                total += Math.max(r,a[i][j]);
                System.out.println(total);
        }
        else
        {
            int[] neither = new int[n];
            neither[0] = a[0][0]+a[1][0];
            int [] top = new int[n];
            top[0] = r+ a[1][0];
            int [] bottom = new int[n];
                bottom[0] = a[0][0]+r;
                int [] both = new int[n];
                both[0]= r+r;
                int[] all = new int[n];
                all[0] =r;
                for(int i=1;i<n;i++)
                {
                    neither[i] = a[0][i]+a[1][i]+max(neither[i-1],top[i-1],bottom[i-1],both[i-1],all[i-1]);
                    top[i] = a[1][i] + max(r+neither[i-1],top[i-1],r+bottom[i-1],both[i-1],r+all[i-1]);
                    bottom[i] = a[0][i] + max(r+neither[i-1],r+top[i-1],bottom[i-1],both[i-1],r+all[i-1]);
                    both[i] = max(r+r+neither[i-1],r+top[i-1],r+bottom[i-1],both[i-1],r+r+all[i-1]);
                    all[i] = max(r+neither[i-1],r+top[i-1],r+bottom[i-1],r+both[i-1],all[i-1]);
                    }
                    System.out.println(max(neither[n-1],top[n-1],bottom[n-1],both[n-1],all[n-1]));
        }
        
    }
    static int max(int...vals)
    {
        int m = vals[0];
        for(int i=1;i<vals.length;i++)
        if(vals[i]>m)
        m = vals[i];
        return m;
    }
}
