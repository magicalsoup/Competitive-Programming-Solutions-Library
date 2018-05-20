import java.util.*;
import java.io.*;
public class ccc14s2{
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	ArrayList<String> a = new ArrayList<String>(Arrays.asList(br.readLine().split(" ")));
	ArrayList<String> b = new ArrayList<String>(Arrays.asList(br.readLine().split(" ")));
	for(int i=0;i<a.size();i++) {
		int p =0;
		for(p = 0;p<b.size();p++) 
			if(a.get(p).equals(b.get(i))) 
			break;
		if(!a.get(i).equals(b.get(p))||p==i) {
			System.out.println("bad");
			return;
		}
	}
	System.out.println("good");
}
}
