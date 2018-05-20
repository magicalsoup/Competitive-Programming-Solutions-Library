import java.util.*;
public class graph3p3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
			int numofvert = sc.nextInt();
	boolean[]visited = new boolean[numofvert];
	int[][]vertices = new int[numofvert][2];
	visited[0] = true;
	for(int x =1;x<vertices.length;x++) {
		vertices[x][0] = Integer.MAX_VALUE;
		vertices[x][1] = Integer.MAX_VALUE;
	}
	ArrayList<ArrayList<int[]>>adjlist = new ArrayList<ArrayList<int[]>>();
	for(int x=0;x<numofvert;x++) {
		adjlist.add(new ArrayList<int[]>());
	}
	int numofedges = sc.nextInt();
	for(int x=0;x<numofedges;x++) {
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int c = sc.nextInt();
		int d = sc.nextInt();
		adjlist.get(a).add(new int[] {b,c,d});
		adjlist.get(b).add(new int[] {a,c,d});
	}
	int curr =0;
	int index = -1;
	while(index!=0) {
		int mincost = Integer.MAX_VALUE;
		int mindanger = Integer.MAX_VALUE;
		index =0;
		for(int x=0;x<adjlist.get(curr).size();x++) {
			int[] connection = adjlist.get(curr).get(x);
			if(!visited[connection[0]]) {
				if(connection[2]<vertices[connection[0]][1]) {
					vertices[connection[0]][1] = connection[2];
					vertices[connection[0]][0] = connection[1];
				}
				else if(connection[2]==vertices[connection[0]][1]&&connection[1]<vertices[connection[0]][0]) {
					vertices[connection[0]][0] = connection[1];
				}
			}
			for(int y=0;y<vertices.length;y++) {
				if(!visited[y]&&(vertices[y][1]<mindanger||(vertices[y][1]==mindanger&&vertices[y][0]<mincost))) {
					index =y;
					mindanger = vertices[y][1];
					mincost = vertices[y][0];
				}
			}
		}
		curr = index;
		visited[curr] = true;
	}
	int cost =0;
	int danger =0;
	for(int[]x:vertices) {
		cost+=x[0];
		danger+=x[1];
	}
	System.out.println(danger+" "+cost);
}
}
