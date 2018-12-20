import java.io.*;
import java.util.*;
public class MarkGambling{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(); double a[] = new double[n], sum = 0, cnt = 0;
    	for(int i = 0; i < n; i++){ a[i]=  readDouble(); sum += a[i];}
    	sum /= n; for(int i = 0; i < n; i++) if(a[i] > sum) cnt++;
    	if(cnt / n * 100.0 > 50) pw.println("Winnie should take the risk");
    	else pw.println("That's too risky"); pw.close();
    	
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
