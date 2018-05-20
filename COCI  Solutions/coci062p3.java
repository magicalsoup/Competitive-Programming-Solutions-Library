import java.io.*;
import java.util.*;
public class coci062p3{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
	int n1 = readInt();
	int n2 = readInt();
	char [] s1 = next().toCharArray();
	char [] s2 = next().toCharArray();
	char [] str= new char[n1+n2];
	int s =readInt();
	for(int x =0;x<n1;x++) {
		int i = n1-x-1;
		i+=Math.min(Math.max(s-x,0),n2);
		str[i] = s1[x];
	}
	for(int x=0;x<n2;x++) {
		int i = n1+x;
		i-=Math.min(Math.max(s-x,0),n1);
		str[i] = s2[x];
	}
	for(char c:str ) 
		System.out.print(c);
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
