import java.util.*;
public class wc172j2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int count =0;
        for(;;){
         d  -= a;
        e -= b;
        f -= c;
        if(d < 0 || e < 0 || f < 0){
            break;
        }
        count++;
        
        }
        System.out.println(count);
     }
}
