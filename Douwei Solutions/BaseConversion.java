package Douwei;
import java.util.Scanner;
public class BaseConversion {
    public static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);    
        String n = sc.next();
        int k = sc.nextInt();
        System.out.println(Integer.toString(Integer.parseInt(n, k), 10));
    } 
}