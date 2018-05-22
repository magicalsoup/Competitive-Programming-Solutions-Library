import java.util.*;
import java.io.*;
public class neerc10a {
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String[]>list = new ArrayList<String[]>();
	int m = 0;
	while(true) {
		String s = br.readLine();
		if(s==null)
			break;
		String[]ss = s.trim().split("\\s+");
		m = Math.max(m,ss.length);
		list.add(ss);
	}
	int [] words = new int[m];
	for(String[]ss:list)
		for(int i=0;i<ss.length;i++)
			words[i] = Math.max(words[i], ss[i].length());
	for(String []ss:list) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ss.length;i++) {
			sb.append(ss[i]);
			for(int j=ss[i].length();j<=words[i];j++)
				sb.append(' ');
			}
		System.out.println(sb.toString().trim());
		}
	}
}
