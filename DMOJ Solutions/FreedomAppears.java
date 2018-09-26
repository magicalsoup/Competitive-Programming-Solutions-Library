import java.io.*;
import java.util.*;

public class FreedomAppears {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  
  static long X, Y, Z, N, x, y, z, dist1, dist2, dist3, gcd = 0;
  static TreeSet<Coor> s = new TreeSet<Coor>();
  
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
	out = new PrintWriter(new OutputStreamWriter(System.out));
        X = readLong(); Y = readLong(); Z = readLong();
        N = readLong();
        for (int i=0; i<N; i++) {
           x = readLong();
           y = readLong();
           z = readLong();
            dist1 = x - X;
            dist2 = y - Y;
            dist3 = z - Z;
            gcd = Math.abs(GCD(dist1, GCD(dist2, dist3)));
            if (gcd <= 0) continue;
            s.add(new Coor(dist1 / gcd, dist2 / gcd, dist3 / gcd));
        }
        System.out.println(s.size());
       
    }
    
    public static class Coor implements Comparable <Coor> {
        long x, y, z;
        Coor (long a, long b, long c) {
                this.x = a;
                this.y = b;
                this.z = c;
       }
        @Override
        public int compareTo (Coor e) {
            if (this.x != e.x) return Long.compare(this.x, e.x);
            if (this.y != e.y) return Long.compare(this.y, e.y);
            else return Long.compare(this.z, e.z);
        }
        
    }
    
    public static long GCD (long a, long b) {
        return b == 0 ? a : GCD(b, a % b);
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
