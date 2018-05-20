import java.io.*;
import java.util.*;
public class ccc12s2p1{

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static Set<Integer> num = new HashSet<Integer>();
  static boolean[][] v;

  public static void main (String[] args) throws IOException {
    int operations = readInt();
    int numOfDigits = readInt();
    v = new boolean[operations + 1][5000000 + 1];
    int[] digits = new int[numOfDigits];
    for (int x = 0; x < numOfDigits; x++) {
      digits[x] = readInt();

    }
    for (int x = 0; x < numOfDigits; x++) {
      compute(digits, operations, digits[x]);
    }

    for (int x = readInt(); x > 0; x--) {
      if (num.contains(readInt()))
        System.out.println("Y");
      else
        System.out.println("N");
    }

  }

  private static void compute (int[] digits, int operations, int curr) {
    if (curr > 5000000 || v[operations][curr])
      return;
    v[operations][curr] = true;
    if (operations == 1) {
      for (int x = 0; x < digits.length; x++) {
        num.add(curr * digits[x]);
        num.add(curr + digits[x]);
      }
    } else {
      for (int x = 0; x < digits.length; x++) {
        compute(digits, operations - 1, curr * digits[x]);
        compute(digits, operations - 1, curr + digits[x]);
      }
    }
  }

  static String next () throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong () throws IOException {
    return Long.parseLong(next());
  }

  static int readInt () throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble () throws IOException {
    return Double.parseDouble(next());
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }
}
