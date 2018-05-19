import java.util.Scanner;
public class wc153j2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
         Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int ans =0;
   int curr=0;
     int prev =0;
     for(int i=0;i<n;i++){
          curr = scan.nextInt();
         ans+=curr+Math.max(prev,curr)+1;
         prev = curr;
     }
     System.out.println(ans+curr);
     }
}
