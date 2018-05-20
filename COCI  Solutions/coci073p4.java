import java.util.*;
public class coci073p4{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[]x = new long[100001];
        long[] y = new long[100001];
        int[] px = new int[n];
        int[]py = new int[n];
        for(int z =0;z<n;z++){
            x[(px[z] = scan.nextInt())]++;
             y[(py[z] = scan.nextInt())]++;
        }
        long sum =0;
        for(int z =0;z<n;z++)
        sum+=(x[px[z]]-1)*(y[py[z]]-1);
        System.out.println(sum);
     }
}
