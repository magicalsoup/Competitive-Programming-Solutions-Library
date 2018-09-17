import java.io.*;
import java.util.*;
public class RangeQueryOnStaticArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int t = readInt();
		int n = readInt();
		int arr[] = new int[t+1];
		for(int i = 1; i <= t; i++){
			arr[i] = readInt();
			arr[i] += arr[i-1];
		}
		for(int i = 0; i < n; i++){
			int a = readInt()+1;
			int b = readInt()+1;
			out.println(arr[b] - arr[a-1]);
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
