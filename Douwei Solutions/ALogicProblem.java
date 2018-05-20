package Douwei;
import java.util.Scanner;
public class ALogicProblem {
 
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        while(a + b != 0){
             
            if(b==a){
                System.out.println(b);
            }
            else{System.out.println(b+1);}
            a = 0;
            b = 0;
            a = sc.nextInt();
            b = sc.nextInt();
        }
         
    }
     
}