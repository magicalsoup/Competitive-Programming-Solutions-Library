import java.util.*;
import java.io.*;
public class mockccc15s2{
     public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a[] = new int[100005];
            int ans = 1;
         for(int i=0;i<n;i++) {
        	 int x = scan.nextInt();
        	 if(++a[x]>ans)ans = a[x];
         }
         System.out.println(ans);
     }
    }