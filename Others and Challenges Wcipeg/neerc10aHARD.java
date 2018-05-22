import java.util.*;
import java.io.*;
public class neerc10a {
public static void main(String[]args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
	while(br.ready()) {
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) 
			list.add(st.nextToken());
		all.add(list);
	}
	int maxsize = 0;
	for(ArrayList<String> list:all) {
		maxsize = Math.max(maxsize, list.size());
	}
	int []start = new int[maxsize];
	int []end = new int [maxsize];
	for(int i=0;i<all.size();i++)
		end[0] = Math.max(end[0], all.get(i).get(0).length());
	for(int i=1;i<maxsize;i++) {
		start[i] = end[i-1] +1;
		for(ArrayList<String>now :all) {
			if(i>=now.size())
				continue;
			end[i] = Math.max(end[i], start[i]+now.get(i).length());
		}
	}
	for(int i=0;i<all.size();i++) {
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<maxsize;j++) {
			if(j>=all.get(i).size())
				continue;
			while(sb.length()<start[j])
				sb.append(' ');
			sb.append(all.get(i).get(j));
			}
		System.out.println(sb.toString().trim());
		}
	}
}
