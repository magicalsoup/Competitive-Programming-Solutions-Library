import java.util.*;
public class ccc03s5{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int c= sc.nextInt();
	int r=  sc.nextInt();
	int d = sc.nextInt();
	Vector<ndd> n[] = new Vector[c];
	for(int i=0;i<c;i++) n[i] = new Vector<ndd>();
	int dest[]= new int[d];
	int cost[] = new int [c];
	boolean[] flag = new boolean[c];
	for(int i=0;i<r;i++) {
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		int z =sc.nextInt();
		n[x].add(new ndd(y,z));
		n[y].add(new ndd(x,z));
	}
	for(int i=0;i<d;i++) 
		dest[i] = sc.nextInt()-1;
	int next =0;
	for(int i=0;i<n[next].size();i++)
		cost[n[next].get(i).vertex]=n[next].get(i).weight;
	flag[next] = true;
	int check  =1;
	while(check<c) {
		check++;
		int max =0;
		for(int i=0;i<c;i++) {
			if(cost[i]>max&&flag[i]==false) {
				next =i;
				max = cost[i];
			}
		}
	flag[next] = true;
	for(int i=0;i<n[next].size();i++) {
		if(n[next].get(i).weight>cost[n[next].get(i).vertex]) {
			cost[n[next].get(i).vertex]=n[next].get(i).weight;
			
		}
	}
}
	int min = Integer.MAX_VALUE;
	for(int i=0;i<d;i++) {
		if(cost[dest[i]]<min)min =cost[dest[i]];
	}
	System.out.println(min);
}
}
class ndd{
	int vertex;
	int weight;
	ndd(int v,int w){
		vertex =v;
		weight = w;
}
}
