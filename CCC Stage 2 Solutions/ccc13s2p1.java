import java.util.*;
import java.io.*;
public class ccc13s2p1{

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;

  public static void main (String[] args) throws IOException {
    Set<Long> num = new TreeSet<Long>();
    long input = readLong();
    for (long x = 2; x * x <= input; x++) {
      long y = input;
      ArrayList<Long> value = new ArrayList<Long>();
      long curr = (long)Math.pow(x, (long)(Math.log(input) / Math.log(x)));
      while (curr != 0) {
        value.add(y / curr);
        y %= curr;
        curr /= x;
      }
      ArrayList<Long> copy = new ArrayList<Long>(value);
      Collections.reverse(value);
      if (value.equals(copy))
        num.add(x);
    }
    for (int x = (int)Math.sqrt(input); x >= 1; x--) {
      long value = (input - x);
      if (value / x > Math.cbrt(input) && input % (value / x) != 0)
        if (value % x == 0)
          num.add(value / x);
    }
    for (long x : num)
      System.out.println(x);
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
