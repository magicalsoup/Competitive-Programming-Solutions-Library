package Douwei;
import java.util.*;
public class ExtendedGCD {
   static int[] gcd(int p, int q) {
      if (q == 0)
         return new int[] { p, 1, 0 };
 
      int[] vals = gcd(q, p % q);
      int d = vals[0];
      int a = vals[2];
      int b = vals[1] - (p / q) * vals[2];
      return new int[] { d, a, b };
   }
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int p = sc.nextInt();
      int q = sc.nextInt();
      int vals[] = gcd(p, q);
      System.out.println(vals[1] + " " + vals[2]);
   }
}