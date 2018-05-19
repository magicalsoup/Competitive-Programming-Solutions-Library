import java.util.*;
import java.io.*;
public class ioi0301{ 
static int [] dist;
static int[] children;
static int INF = 1<<20;
static LinkedList<Integer>[]edges;
static StreamTokenizer br;
@SuppressWarnings("unchecked")
public static void main(String[]args)throws IOException{
	br = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	int qq = 1;
	while(qq-->0) {
		int n = readInt();
		dist = new int[n];
		children = new int[n];
		edges = new LinkedList[n];
		for(int i=0;i<n;i++) {
			edges[i] = new LinkedList<Integer>();
		}
		for(int i =1;i<n;i++) {
			int a= readInt();
			int b = readInt();
			a--;
			b--;
			edges[a].add(b);
			edges[b].add(a);
		}
		Arrays.fill(dist, INF);
		dist[0] = 0;
		dfs(0,0);
		int best = n;
		LinkedList<Integer> ret = new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			int max = 1;
			int numleft = n-1;
			for(int out:edges[i]) {
				if(dist[out]>dist[i]) {
				max = Math.max(max, children[out]+1);
				numleft -= children[out]+1;
				}
			}
			max = Math.max(max, numleft);
			if(max<best) {
				ret.clear();
				best = max;
			}
			if(max==best) 
				ret.addLast(i+1);
		}
			Collections.sort(ret);
			System.out.println(ret.getFirst()+" "+best);
	}
}
public static int dfs(int curr,int depth) {
	int ret =0;
	for(int out:edges[curr]) {
		if(dist[out]==INF) {
			dist[out] = 1+depth;
			ret+=dfs(out,depth+1);
	}
}
children[curr] = ret;
return ret+1;
}
public static int readInt() throws IOException{
	br.nextToken();
	return(int)br.nval;
}
}
