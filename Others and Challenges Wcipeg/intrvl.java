import java.util.*;
import java.io.*;
public class intrvl {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	public static void main(String[]args)throws IOException {
		int n = readInt();
		int q = readInt();
		int[] min = new int[n];
		int[] max = new int[n];
		for(int i=0;i<n;i++)
		{
			min[i] = readInt();
			max[i] = readInt();
		}
		Arrays.sort(min);
		Arrays.sort(max);
		for(int i=0;i<q;i++)
		{
			int key = readInt();
			int low = Arrays.binarySearch(min, key);
			if(low>=0)
			{
				while(low!=n&&min[low]==key)
				{
					low++;
				}
			}
			else
			{
				low+=1;
				low*=-1;
			}
			int high = Arrays.binarySearch(max, key);
			if(high>=0)
			{
				while(high!=0&&max[high-1]==key)
				{
					high--;
				}
			}
			else
			{
				high+=1;
				high*=-1;
			}
			out.println(low-high);
		}
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
