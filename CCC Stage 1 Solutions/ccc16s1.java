import java.util.*;
import java.io.*;
public class ccc16s1{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int[] letters = new int[26];
		for(int i=0;i<in.length();i++) {
			letters[in.charAt(i)-'a']++;
		}
		String s= br.readLine();
		boolean b = true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				continue;
			}
			if(letters[s.charAt(i)-'a']==0) {
				b = false;
				break;
			}
			else {
				letters[s.charAt(i)-'a']--;
			}
		}
		System.out.println(b? "A":"N");
	}
}