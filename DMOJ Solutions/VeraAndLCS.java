import java.util.*;
import java.io.*;
public class VeraAndLCS {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(), k = readInt(); String s = readLine();
		if(k > n) { System.out.println("WRONGANSWER"); return;}
		if(k == n) {System.out.println(s); return;}
		int freq[] = new int[26], min = 0x3f3f3f3f; char c = 0;
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(freq[i] < min) {
				min = freq[i];
				c = alpha.charAt(i);
			}
		}
		if(k < min) {System.out.println("WRONGANSWER"); return;}
		int take = k - min, ri = 0;
		char r[] = new char[s.length()];
		for(int i = 0; i < n; i++) {
		    if(s.charAt(i) == c) {
		        r[ri++] = c;
		    }
		    else if(take != 0) {
		        r[ri++] = s.charAt(i);
		        take--;
		    }
		}
		for(int i = ri; i < n; i++) 
			r[i] = c;
		
		System.out.println(r);
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static String readLine() throws IOException{
		return br.readLine().trim();
	}
}
