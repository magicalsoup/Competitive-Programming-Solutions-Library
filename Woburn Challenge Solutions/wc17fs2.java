import java.util.*;
public class wc17fs2 {
	public static class Edge implements Comparable<Edge>{
		int a,b,val;
		public Edge(int a,int b,int val) {
			this.a = a;
			this.b = b;
			this.val = val;
		}
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(o.val, this.val);
		}
	}
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
	int par[] = new int[n+1];
	for(int i=1;i<=n;i++)
		par[i] = i;
	for(int i=0;i<m;i++)
		pq.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	long tot =0,con = n;
	while(!pq.isEmpty()) {
		Edge e = pq.poll();
		if(e.val>0)
			tot+=e.val;
		if(find(par,e.a)==find(par,e.b))
			continue;
		else {
			if(e.val<0)
				tot+=e.val;
			con--;
			par[find(par,e.a)] = find(par,e.b);
		}
	}
	if(con==1)
		System.out.println(tot);
	else
		System.out.println("Impossible");
}
public static int find(int par[],int n) {
	if(par[n]==n)
		return n;
	return par[n] = find(par,par[n]);
}
}
