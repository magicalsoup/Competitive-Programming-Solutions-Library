package Douwei;
import java.util.*;
public class NumberSpiralAgain {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        num=num*2-1;
        num*=num;
        System.out.print(num);
    }
}
 