import java.util.*;
public class ccc16s3{
	static boolean[] pho, visted;
	static int count,longest;
	static int[][]g;
	static int[] a,b,deg;
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int m = sc.nextInt();
	int x =-1;
	pho = new boolean[n];
	for(int i=0;i<m;i++)
	{
		int j = sc.nextInt();
		pho[j] = true;
		x =j;
	}
	g = new int[n][];
	deg = new int[n];
	 a = new int[n-1];
	 b= new int[n-1];
	 for(int i=0;i<n-1;i++)
	 {
		 a[i] = sc.nextInt();
		 b[i] = sc.nextInt();
		 deg[a[i]]++;
		 deg[b[i]]++;
	 }
	 for(int i=0;i<n;i++)
		 g[i] = new int[deg[i]];
		 for(int i=0;i<n-1;i++)
	 {
			 deg[a[i]]--;
			 deg[b[i]]--;
		 g[a[i]][deg[a[i]]]=b[i];
		 g[b[i]][deg[b[i]]] =a[i];
	 }
		 visted = new boolean[n];
		 int[]node = new int[n];
		 int[] order = new int[n];
		 
		 int[]st = new int[n];
		 int size = 1;
		 st[0]= x;
		 int pos;
		 for(int i=0;i<n;i++)
		 {
			 size--;
			 pos = st[size];
			 node[i] = pos;
			 visted[pos] = true;
			 order[pos] = i;
			 for(int k=0;k<g[pos].length;k++)
			 {
				 int j = g[pos][k];
				 if(!visted[j])
				 {
					 st[size]=j;
					 size++;
				 }
			 }
		 }
		 a = new int[n-1];
		 b = new int[n-1];
		 count =0;
		 visted = new boolean[n];
		 for(int i=n-1;i>=0;i--)
		 {
			 pos = node[i];
			 for(int k=0;k<g[pos].length;k++)
			 {
				 int j = g[pos][k];
				 if(order[j]>order[pos]&&pho[j])
				 {
					 a[count] = pos;
					 b[count] =j;
					 deg[pos]++;
					 deg[j]++;
					 count++;
					 pho[pos]= true;
				 }
			 }
		 }
		 for(int i=0;i<n;i++)
			 g[i] = new int[deg[i]];
		 for(int i=0;i<count;i++)
		 {
			 deg[a[i]]--;
			 deg[b[i]]--;
			 g[a[i]][deg[a[i]]] = b[i];
			 g[b[i]][deg[b[i]]] = a[i];
		 }
		 visted = new boolean[n];
		 st = new int[n];
		 size = 1;
		 st[0] = x;
		 for(int i=0;i<=count;i++)
		 {
			 size--;
			 pos = st[size];
			 node[i] = pos;
			 visted[pos] = true;
			 order[pos] = i;
			 for(int k=0;k<g[pos].length;k++)
			 {
				 int j = g[pos][k];
				 if(!visted[j])
				 {
					 st[size] =j;
					 size++;
				 }
			 }
		 }
		 longest = 0;
		 int[] dist = new int[n];
		 for(int i=count;i>=0;i--)
		 {
			 pos = node[i];
			 int max1 = 0;
			 int max2 =0;
			 for(int k=0;k<g[pos].length;k++)
			 {
				 int j = g[pos][k];
				 if(order[j]>order[pos])
				 {
					 int d = dist[j];
					 if(d>max1)
					 {
						 max2 = max1;
						 max1 = d;
					 }
					 else if(d>max2)
						 max2 = d;
				 }
			 }
			 if(max1+max2>longest)
				 longest = max1+max2;
			 dist[pos] = max1+1;
		 }
		 System.out.println(2*count-longest);
	}
}
