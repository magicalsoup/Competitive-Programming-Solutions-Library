package Douwei;
import java.util.Scanner;
public class QuotientAndRemainder {
 
    static void divide(int a, int b, int d){
        if(b > a){
            System.out.println(a + " " + d);
            return;
        }
        divide(a - b, b, d + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        divide(a, b, 0);
      }
}