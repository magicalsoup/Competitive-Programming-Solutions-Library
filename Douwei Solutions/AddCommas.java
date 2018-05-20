package Douwei;
import java.util.Scanner;
public class AddCommas {
 
    static String divide(String a, int b, int c){
        if(3 >= a.length() - c * 4) return a;
        a = a.substring(0, b) + "," + a.substring(b);
        return divide(a, b - 3, c + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(divide(a, a.length() - 3, 0));
      }
}