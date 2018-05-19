import java.util.Scanner;
public class wc151j2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
         Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
    if(a%b==0){
        System.out.println(b+" group(s) of "+a/b);
    }
    else{
        System.out.println(b-a%b+" group(s) of "+(a/b));
        System.out.println(a%b+" group(s) of "+((a/b)+1));
    }
     }
}
