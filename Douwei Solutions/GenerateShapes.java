package Douwei;
import java.util.*;
public class GenerateShapes{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.next();
    if(shape.equals("SQUARE")) {
        int s = sc.nextInt();
        for(int i = 0; i < s; i++) {
            for(int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.exit(0);
    }
    else if(shape.equals("RECTANGLE")) {
        int w = sc.nextInt();
        int l = sc.nextInt();
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.exit(0);
    }
    else if(shape.equals("TRIANGLE")) {
        int s = sc.nextInt();
        int k = 1;
        for(int i = 0; i <= k; i++) {
            if(k>s) {
                break;
            }
            for(int j = 0; j < (s-k)/2;j++) {
            System.out.print(" ");
            }
            for(int j = 0; j < k; j++) {
            System.out.print("*");
            }
            System.out.println();
            k = k + 2;
        }
        System.exit(0);
    }
    else if(shape.equals("KITE")) {
        int s = sc.nextInt();
        int k = 1;
        for(int i = 0; i <= k; i++) {
            if(k>s) {
                break;
            }
            for(int j = 0; j < (s-k)/2;j++) {
            System.out.print(" ");
            }
            for(int j = 0; j < k; j++) {
            System.out.print("*");
            }
            k = k + 2;
            System.out.println();
        }
        for(int i = 0; i < k; i++) {
            k = k - 2;
            if(k<=1) {
                break;
            }
        for(int j = (s-k+2)/2; j > 0;j--) {
        System.out.print(" ");
        }
        for(int j = 2; j < k; j++) {
        System.out.print("*");
        }
         
        System.out.println();
    }
        System.exit(0);
    }
    }
}

