import java.io.*;
import java.util.*;
public class ecoo1p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		for(int i=0;i<5;i++) {
			String key = genkey(readLine());
			out.println(key);
			out.println(decode(br.readLine(),key));
		}
		out.close();
	}
	public static String genkey(String s) {
		s = (s.replace(" ", "")+"abcdefghijklmnopqrstuvwxyz").toUpperCase();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			s = s.replace(String.valueOf(c), "");
			if(65<=c&&c<=90)
				s = s.substring(0, i)+c+s.substring(i);
		}
		return s;
	}
	public static String decode(String message,String key) {
		String s = "";
		for(int i=0;i<message.length();i+=2) {
			s+=key.charAt((key.indexOf(message.charAt(i+1))+1)%26);
			s+=key.charAt((key.indexOf(message.charAt(i))+25)%26);
		}
		s = s.replace("X", " ").trim().replace("KS", "X");
		return s;
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
