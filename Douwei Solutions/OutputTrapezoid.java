package Douwei;
import java.util.Scanner;
public class OutputTrapezoid {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
       int k = sc.nextInt();
       int d = k;
       int ok =k;
        for(int i = 0; i <ok; i++){
             for(int l = k; l >1; l--){
                System.out.print(" ");
            }           
            for(int j = 0; j < d; j++){
                System.out.print("*");
            }
             System.out.println();
             	d= d+2;
             	k--;
        }
    }   
}