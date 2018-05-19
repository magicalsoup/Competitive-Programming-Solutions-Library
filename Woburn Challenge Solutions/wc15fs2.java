import java.util.*;
import java.io.*;
public class wc15fs2{
     public static void main(String []args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String [] line = br.readLine().split(" ");
     int n = Integer.parseInt(line[0]);
     int m = Integer.parseInt(line[1]);
     int k = Integer.parseInt(line[2]);
     int []c = new int[n];
     for(int i=0;i<c.length;i++)
     c[i] = Integer.parseInt(br.readLine());
     Arrays.sort(c);
     int []t =new int[m];
     for(int i=0;i<t.length;i++)
     t[i] =Integer.parseInt(br.readLine());
     Arrays.sort(t);
     int l =1;
     int r = n+1;
     while(l<r){
         int mid = (l+r)/2;
         int j=0;
         int count =0;
         for(int i=0;i<n;i++){
             while(count==mid||j<m&&(t[j]<c[i]-k||t[j]>c[i]))
             {
                 j++;
                 count =0;
             }
          if(j<m)
          count++;
         }
             if(j<m)
             r = mid;
             else
             l = mid+1;
     }
      if(l==n+1)
         System.out.println(-1);
         else
         System.out.println(l);
     }
}
