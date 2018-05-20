package Douwei;
import java.util.*;
public class GCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int f = a % b;
            while (f != 0) {
                a = b;
                b = f;
                f = a % b;
            }
            System.out.println(b);
        }
    }
 
}