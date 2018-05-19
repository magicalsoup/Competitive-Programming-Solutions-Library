import java.util.Scanner;
public class wc151s1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
         Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int position =0;
   int ans =0;
   for(int i=0;i<n;i++){
       int m =scan.nextInt();
       int t = scan.nextInt();
       position +=t;
       if(position>m){
           ans+=position-m;
           position = m;
       }
   }
   System.out.println(ans);
     }
}
