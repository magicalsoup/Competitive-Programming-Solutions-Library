import java.util.*;
public class wc01p3{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int entries,num;
     entries = scan.nextInt();
     for(int i=0;i<entries;i++){
         num  =scan.nextInt();
         String mxl = Integer.toBinaryString(num);
         String reverse = new StringBuffer(mxl).reverse().toString();
         int ans = Integer.parseInt(reverse,2);
         System.out.println(ans);
     }
         
     }
}
