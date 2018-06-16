import java.util.*;
import java.io.*;
public class ccc11s2p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
	int n = readInt();
	int m = readInt();
	ArrayList<ArrayList<Integer>>a = new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
	//----Initialize the arrays----//
	for(int i=0;i<n;i++)
		a.add(new ArrayList<Integer>());
	for(int i=0;i<m;i++)
		b.add(new ArrayList<Integer>());
	//-----------------------------//
	int q = readInt();
	while(q-->0) {
		int x = readInt()-1;
		int y = readInt()-1;
		a.get(x).add(y);
		b.get(y).add(x);
	}
	for(int x=0;x<n;x++) {
		boolean found[] = new boolean[n];
		for(Integer next:a.get(x)) {
			for(Integer con:b.get(next)) {
				if(!found[con]&&con!=x)
					found[con] = true;
				else if(found[con]) {
					out.println("NO");
					out.close();
					return;
				}
			}
		}
	}
		out.println("YES");
		out.close();
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
