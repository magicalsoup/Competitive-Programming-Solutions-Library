import java.util.Scanner;
public class ccc12j3{

     public static void main(String []args){
   Scanner scan = new Scanner(System.in);
   int a = scan.nextInt();
   for(int i=0;i<a;i++){
       for(int l=0;l<a;l++){
       System.out.print("*");
       }
       for(int j=0;j<a;j++){
           System.out.print("x");
       }
       for(int k=0;k<a;k++){
           System.out.print("*");
       }
   System.out.println();
   }
   for(int i=0;i<a;i++){
       for(int j=0;j<a;j++){
           System.out.print(" ");
       }
       for(int k=0;k<a*2;k++){
           System.out.print("x");
       }
       System.out.println();
   }
   for(int i=0;i<a;i++){
       for(int j=0;j<a;j++){
           System.out.print("*");
       }
       for(int k =0;k<a;k++){
           System.out.print(" ");
       }
       for(int l=0;l<a;l++){
           System.out.print("*");
       }
       System.out.println();
   }
    }
}