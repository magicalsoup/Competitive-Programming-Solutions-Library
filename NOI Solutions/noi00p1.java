
import java.util.Scanner;

public class noi00p1  {
  static Scanner scan = new Scanner(System.in);

  public static void main (String[] args) {
    int v = scan.nextInt();
    int v0 = scan.nextInt();
    int max = 0;
    int n = 1;
    while (v * n - v0 * n * n >= max) {
      if (max == v * n - v0 * n * n) {
        System.out.println(0);
        return;
      }
      max = v * n - v0 * n * n;
      n++;
    }
    System.out.println(n - 1);
  }

}
