import java.util.Scanner;
public class ccc13s2{

     public static void main(String []args){
   Scanner scan = new Scanner(System.in);
   int maxsum = scan.nextInt();
   int b = scan.nextInt();
   int p1 =0;
   int p2= 0;
   int p3 =0;
   int i=0;
   for(;i<b;i++) {
	   int curr = scan.nextInt();
	   if(curr+p1+p2+p3>maxsum)break;
	   p3 = p2;
	   p2 = p1;
	   p1 = curr;
   }
   System.out.println(i);
     }
}