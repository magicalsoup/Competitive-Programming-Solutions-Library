import java.util.*;
public class graph3p2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        int c[] = new int[m];
        for(int i=0;i<m;i++)
        {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
        }
        int len[] = new int[n];
        boolean update[] = new boolean[n];
        update[0] = true;
        for(int i=1;i<n;i++)
            len[i] = Integer.MAX_VALUE;
            boolean done =false;
            while(!done)
            {
                done =true;
                for(int i=0;i<m;i++)
                if(update[a[i]])
                if(len[a[i]]+c[i]<len[b[i]])
                {
                    len[b[i]] = len[a[i]]+c[i];
                    update[b[i]] =true;
                    done = false;
                }
            }
            System.out.println(len[n-1]);
        }
     }

