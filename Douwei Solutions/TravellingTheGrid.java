package Douwei;
import java.util.Scanner;
public class TravellingTheGrid {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print((n)*(m-1));
    }
}