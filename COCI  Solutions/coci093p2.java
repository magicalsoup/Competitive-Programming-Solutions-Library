import java.util.Scanner;
public class coci093p2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int k = scan.nextInt();
        double s =1.0;
        for(int i=0;i<k;i++){
             s = s*10.0;
        }
        double y=Math.round(a/s);
        System.out.println(String.format("%.0f",y*s));
         
     }
}
