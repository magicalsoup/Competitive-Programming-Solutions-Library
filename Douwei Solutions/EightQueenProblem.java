package Douwei;
import java.util.Scanner;
public class EightQueenProblem {
	static int n;;
  private static int[] b = new int[n];
  private static int s = 0;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  b = new int[n];
    int y = 0;
    b[0] = -1;
    while (y >= 0) {
      do {
        b[y]++;
      } while ((b[y] < n) && unsafe(y));
      if (b[y] < n) {
        if (y < n-1) {
          b[++y] = -1;
        } else {
          s++;
        }
      } else {
        y--;
      }
    }
    System.out.println(s);
    sc.close();
  }
  static boolean unsafe(int y) {
    int x = b[y];
    for (int i = 1; i <= y; i++) {
      int t = b[y - i];
      if (t == x ||
          t == x - i ||
          t == x + i) {
        return true;
      }
    }
    return false;
  }
}
