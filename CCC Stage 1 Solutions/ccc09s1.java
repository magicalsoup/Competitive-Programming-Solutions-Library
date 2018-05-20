import java.util.Scanner;
public class ccc09s1{
     public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int count =0;
    for(long i=1;i<=b;i++){
        if(Math.pow(i,6)>b){
            break;
        }
        if(Math.pow(i,6)<=b&&Math.pow(i,6)>=a){
            count++;
        }
    }
    System.out.println(count);
     }
}