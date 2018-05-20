import java.util.*;
import java.io.*;
public class ccc10s2p1{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int dogs = Integer.parseInt(br.readLine());
	int []wait = new int [dogs+1];
	int []bark = new int[dogs+1];
	int [] dist = new int[dogs+1];
	Arrays.fill(dist, -1);
	dist[1] = 1;
	ArrayList[]adj = new ArrayList[dogs+1];
	for(int i=1;i<=dogs;i++) {
		adj[i] = new ArrayList();
		wait[i] = Integer.parseInt(br.readLine());
	}
	int path = Integer.parseInt(br.readLine());
	for(int i=1;i<=path;i++) {
		String[]tokens = br.readLine().split(" ");
		int start = Integer.parseInt(tokens[0]);
		int end = Integer.parseInt(tokens[1]);
		adj[start].add(end);
	}
	int time = Integer.parseInt(br.readLine());
	for(int i=0;i<=time;i++) {
		for(int c=1;c<=dogs;c++) {
			dist[c]--;
		}
		for(int c =1;c<=dogs;c++) {
			if(dist[c]==0) {
				bark[c]++;
				for(int k=0;k<adj[c].size();k++) {
					if(dist[(int)adj[c].get(k)]<0) {
						dist[(int)adj[c].get(k)]= wait[(int)adj[c].get(k)];
					}
				}
			}
		}
	}
	for(int i=1;i<=dogs;i++) {
		System.out.println(bark[i]);
	}
}
}
