package Douwei;
import java.util.*;
public class PatternAgain{
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int value =0;
    int count =1;
    while(count<=a) {
        for(int i = 0;i<count;i++) {
            if(i!=count-1)
            System.out.print(value+" ");
            else
                System.out.print(value);
            value++;
            if(value>9) {
                value = 0;
            }
        }
        count++;
        System.out.println();
    }
}
}