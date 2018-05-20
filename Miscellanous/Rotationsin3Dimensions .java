import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Rotationsin3Dimensions {
  
  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  
  static int T;
  static double dist, dist1, invx, invy, invz;  
  
  public static void Calc(double x, double y, double z, double rx, double ry, double rz, double theta) {
    dist = Math.pow(rx, 2) + Math.pow(ry, 2) + Math.pow(rz, 2);
    dist1 = (1 - Math.cos(theta)) * (x * rx + y * ry + z * rz);
    invx = (dist1 * rx + Math.cos(theta) * x * dist + (y * -rz + z * ry) * Math.sin(theta) * Math.sqrt(dist)) / dist;
    invy = (dist1 * ry + Math.cos(theta) * y * dist + (x * rz - z * rx) * Math.sin(theta) * Math.sqrt(dist)) / dist;
    invz = (dist1 * rz + Math.cos(theta) * z * dist + (x * -ry + y * rx) * Math.sin(theta) * Math.sqrt(dist)) / dist;
  }
  
  public static void main(String[] args) throws IOException {
      br = new BufferedReader(new InputStreamReader(System.in));
	  out = new PrintWriter(new OutputStreamWriter(System.out));
	  T = readInt();
	  DecimalFormat df = new DecimalFormat("#0.000000");    
	  for (int i=0; i<T; i++) {
	    Calc(readDouble(), readDouble(), readDouble(), readDouble(), readDouble(), readDouble(), readDouble());
	   System.out.println(df.format(invx) + " " + df.format(invy) + " " + df.format(invz));
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

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
