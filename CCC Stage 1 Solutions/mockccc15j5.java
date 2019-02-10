import java.util.*;
import java.io.*;
public class mockccc15j5{

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  static StringTokenizer st;

  public static void main (String[] args) throws IOException {
	  int n = readInt(); long px[] = new long[n], py[] = new long[n], seed = (long)1e9, ans = 0;
	  for(int i = 0; i < n; i++) {int x = readInt(), y = readInt(); px[i] = x * seed + y; py[i] = y * seed + x;}
	  Arrays.sort(px); Arrays.sort(py);
	  int m = readInt(), x0 = readInt(), y0 = readInt();
	  for(int i = 1; i < m; i++) {
		  int x1 = readInt(), y1 = readInt();
		  if(y0 == y1) {
			  int lft = Arrays.binarySearch(py, y0 * seed + Math.min(x0, x1));
			  int rit = Arrays.binarySearch(py, y0 * seed + Math.max(x0, x1));
			  if(lft < 0) lft = -lft - 1;
			  if(rit < 0) rit = -rit - 2;
			  ans += rit - lft + 1;
		  }
		  else {
			  int lft = Arrays.binarySearch(px, x0 * seed + Math.min(y0, y1));
			  int rit = Arrays.binarySearch(px, x0 * seed + Math.max(y0, y1));
			  if(lft < 0) lft = -lft - 1;
			  if(rit < 0) rit = -rit - 2;
			  ans += rit - lft + 1;
		  }
		  x0 = x1; y0 = y1;
	  }
	  pw.println(ans); pw.close();
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

  static char readCharacter () throws IOException {
    return next().charAt(0);
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }
}
