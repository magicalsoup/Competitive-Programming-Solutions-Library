import java.util.*;
import java.io.*;
public class esdeath{ // Esdeath and Tatsumi <3
	@SuppressWarnings("unchecked")
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int cities = Integer.parseInt(in.split(" ")[0]);
		int soldiers = Integer.parseInt(in.split(" ")[1]);
		Stack<Integer>[]adj = new Stack[cities];
		for(int i=0;i<cities;i++) {
			adj[i] = new Stack<Integer>();
		}
		for(int i=0;i<(cities-1);i++) {
			in = br.readLine();
			String inn[]=  in.split(" ");
			adj[Integer.parseInt(inn[0])-1].push(Integer.parseInt(inn[1])-1);
			adj[Integer.parseInt(inn[1])-1].push(Integer.parseInt(inn[0])-1);
	}
		int[]parent = new int[cities];
		boolean[] covered = new boolean[cities];
		ArrayDeque<Integer>	queue = new ArrayDeque<Integer>();
		int count =0;
		queue.add(0);
		ArrayDeque<Integer>farcities = new ArrayDeque<Integer>();
		boolean useful = true;
		while(useful) {
			int size = queue.size();
			useful = false;
			for(int i=0;i<size;i++) {
				int city = queue.poll();
				if(!covered[city]) {
					useful = true;
					Stack<Integer> temp = (Stack<Integer>)adj[city].clone();
					for(int j=0;j<adj[city].size();j++) {
						int t = temp.pop();
						if(!covered[t]) {
							parent[t]= city;
							queue.add(t);
						}
					}
					covered[city] = true;
					farcities.push(city);
				}
			}
			if(useful)
			count++;
		}
		if(soldiers==cities)
			System.out.println(0);
		else {
			int lastvalid = -1;
			int max = count;
			int min =1;
			int distance = (max-min)/2+min;
			ArrayDeque<Integer>orginal = farcities.clone();
			int lowestvalid = Integer.MAX_VALUE;
			int prevdis = -1;
			boolean done = false;
			 while(!done) {
				 int visited = 0;
				 int soldiersplaced = 0;
				 covered = new boolean[cities];
				 farcities = orginal.clone();
				 while(visited<cities) {
					 int leaf = farcities.pop();
					 while(covered[leaf])
						 leaf = farcities.pop();
					 int start = leaf;
					 for(int i=0;i<distance;i++) {
						 start = parent[start];
					 }
					 queue = new ArrayDeque<Integer>();
					 queue.add(start);
					 soldiersplaced++;
					 HashSet<Integer> justvisited = new HashSet<Integer>();
					 for(int i=0;i<distance+1;i++) {
						 int size = queue.size();
						 for(int j=0;j<size;j++) {
							 int city = queue.poll();
							 if(!justvisited.contains(city)) {
								 queue.addAll(adj[city]);
								 if(!covered[city]) {
									 visited++;
									 covered[city] = true;
								 }
								 justvisited.add(city);
							 }
						 }
					 }
				 }
				 if(soldiersplaced>soldiers)	{
					 if(lastvalid!=-1)
						 done = true;
					 min = distance;
					 if(prevdis==distance) {
						 lastvalid = lowestvalid;
						 done = true;
					 }
					 prevdis = distance;
					 distance = (max-min)/2+min;
				 }
				 else if(soldiersplaced<soldiers) {
					 lowestvalid = Math.min(lowestvalid, distance);
					 if(distance==1) {
						 lastvalid= distance;
						 done = true;
					 }
					 max = distance;
					 prevdis = distance;
					 distance = (max-min)/2+min;
				 }
				 else {
					 lastvalid =distance;
					 prevdis = distance;
					 distance--;
					 max = distance;
				 }
			 }
			 System.out.println(lastvalid);
		}
	}
}
