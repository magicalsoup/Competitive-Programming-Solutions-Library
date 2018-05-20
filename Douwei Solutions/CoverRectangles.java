package Douwei;
import java.util.*;
public class CoverRectangles{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f3 = 0;
        int f1 = 1;
        int f2 = 1;
        int count =0;
        while(count<=a-2){
            f3 =f1+f2;
            f1 = f2;
            f2 = f3;
            count++;
        }
        System.out.println(f3);
     }
}