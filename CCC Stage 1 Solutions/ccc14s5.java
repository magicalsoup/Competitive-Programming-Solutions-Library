//too slow, but may work after a few tries, it about 0.006 too slow
import java.util.*;
import java.io.*;
public class ccc14s5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
public static void main(String[]args)throws IOException{
	int n = readInt();
	int []x = new int[n+1];
	int []y= new int [n+1];
	for(int i=1;i<=n;i++)
	{
		x[i] = readInt();
		y[i] = readInt();
	}
	Jump [] jumps = new Jump[n*(n+1)/2];
	int k = 0;
	for(int i=0;i<n;i++)
		for(int j=i+1;j<=n;j++)
			jumps[k++] = new Jump(i,j,(x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
	int [] most = new int[n+1];
	int [] last = new int[n+1];
	int [] lastdist = new int[n+1];
	Arrays.sort(jumps);
	for(int i=0;i<jumps.length;i++)
	{
		int a = jumps[i].a;
		int b = jumps[i].b;
		if(jumps[i].d>lastdist[a])
		{
			lastdist[a] = jumps[i].d;
			last[a] = most[a];
		}
		if(jumps[i].d>lastdist[b])
		{
			lastdist[b] = jumps[i].d;
			last[b] = most[b];
		}
		if(a==0)
		{
			if(last[b]+1>most[0])
				most[0] = last[b]+1;
		}
		else
		{
			if(last[b]+1>most[a])
				most[a] = last[b]+1;
			if(last[a]+1>most[b])
				most[b] = last[a]+1;
		}
	}
		out.println(most[0]);
		out.close();
		return;
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
class Jump implements Comparable<Jump>
{
	int a,b;
	int d;
	Jump(int A,int B,int dist)
	{
		a = A;
		b = B;
		d = dist;
	}
	public int compareTo(Jump j)
	{
		if(d<j.d)
			return -1;
		else if(d==j.d)
			return 0;
		else
			return 1;
	}
}
