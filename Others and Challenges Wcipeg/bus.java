import java.util.*;
import java.io.*;
public class bus {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
public static void main(String[]args) throws IOException{
	long n,b,c,t=0;
	long [] diff = new long[1000001];
	 n =readLong();
	 b = readLong();
	 c = readLong();
	Arrays.fill(diff, 0);
	for(int i=0,src,tar;i<n;i++) {
		src = readInt();
		tar = readInt();
		diff[src]++;
		diff[tar]--;
	}
	for(int i=1;i<b;i++) {
		diff[i] +=diff[i-1];
		if(diff[i]>c) {
			t+=(diff[i]-c)*5+c;
		}
		else if(diff[i]<c) {
			t+=diff[i];
		}
		else {
			t+=c;
		}
	}
	out.println(t);
	br.close();
	out.close();
}
static String next() throws IOException{
    while(st==null||!st.hasMoreTokens())
    st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
}
static long readLong() throws IOException{
    return Long.parseLong(next());
}
static int readInt() throws IOException{
    return  Integer.parseInt(next());
}
 static double readDouble() throws IOException{
    return  Double.parseDouble(next());
}
static char readCharacter() throws IOException{
    return next().charAt(0);
}
static String readLine() throws IOException{
    return br.readLine().trim();
}
}
