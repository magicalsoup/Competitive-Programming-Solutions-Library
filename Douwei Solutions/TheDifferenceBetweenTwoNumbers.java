package Douwei;
import java.util.*;
import java.io.*;
public class TheDifferenceBetweenTwoNumbers{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
public static void main(String[]args)throws IOException {
	int a = readInt();
	int n = readInt();
	int arr[] = new int[a];
	int arr2[] = new int[2010000];
	Arrays.fill(arr2, -1);
	for(int i=0;i<a;i++) {
		arr[i] = readInt();
		arr2[arr[i]] = arr[i];
	}
	for(int i=0;i<n;i++) {
		int v = readInt();
		if(in(arr2,arr,v))
			out.println("YES");
		else
			out.println("NO");
	}
	br.close();
	out.close();
}
public static boolean in(int arr2[],int arr[],int n) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]-n>=0) {
		if(arr2[arr[i]-n]>=0) {
			return true;
		}
	}
	}
	return false;
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