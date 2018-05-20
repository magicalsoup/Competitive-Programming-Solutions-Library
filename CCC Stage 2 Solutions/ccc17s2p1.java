import java.io.*;
import java.util.*;

public class ccc17s2p1{
  
  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  
  static ArrayList<Edge> al = new ArrayList<Edge>();
  static int K, a, b, V = 1, E;
  static int arr [] = new int [5005];
  
  public static void main(String[] args) throws IOException {
  br = new BufferedReader(new InputStreamReader(System.in));
  out = new PrintWriter(new OutputStreamWriter(System.out));
  K = readInt();
  for (int i=0; i<=5000; i++) 
  arr[i] = (i * (i + 1)) >> 1;
  solve();
  E = al.size();
  System.out.println(V + " " + E);
  for (int i=0; i<E; i++) {
    a = al.get(i).a;
    b = al.get(i).b;
    System.out.println(a + " " + b);
    }
  }
  
  public static void solve() {
    while(K != 0) {
      for (int j=5000; j>=0; j--) {
        if (K - arr[j] < 0) continue;
        K -= arr[j];
        for (int k=V; k<= j + V; k++)
          al.add(new Edge(k, k + 1));
        al.add(new Edge(j + V, V));
        V += j + 1;
        break;
      }
    }
  }

  public static class Edge {
    int a, b;
    Edge(int a, int b) {
      this.a = a;
      this.b = b;
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
