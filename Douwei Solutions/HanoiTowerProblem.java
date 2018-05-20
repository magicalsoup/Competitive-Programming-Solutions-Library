package Douwei;
import java.util.*;
public class HanoiTowerProblem {

   public static void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println(start + " to " + end);
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(start + " to " + end);
           solve(n - 1, auxiliary, start, end);
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int discs = sc.nextInt();
       solve(discs, "A", "B", "C");
   }
}