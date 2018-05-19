import java.util.*;
public class segtree {
	static int a[];
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	a = new int[n];
	for(int i=0;i<n;i++)
		a[i] = sc.nextInt();
	RangeMin tree = new RangeMin(0,n-1);
	for(int r=0;r<m;r++)
	{
		char c = sc.next().charAt(0);
		if(c=='M')
		{
			int i = sc.nextInt();
			int x = sc.nextInt();
			tree.update(i, x);
		}
		else
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(tree.query(i, j));
		}
	}
	sc.close();
	}
}
class RangeMin
{
	boolean leaf;
	int l,r,m;
	int min;
	RangeMin left,right;
	RangeMin(int from,int to)
	{
		l = from;
		r= to;
		if(from==to)
		{
			leaf = true;
			min = segtree.a[from];
			return;
		}
		leaf = false;
		m = (l+r)/2;
		left = new RangeMin(l,m);
		right = new RangeMin(m+1,r);
		min = Math.min(left.min, right.min);
	}
	void update(int i,int x)
	{
		if(leaf)
		{
			min =x;
			return;
		}
		if(i<=m)
			left.update(i, x);
		else
			right.update(i, x);
		min = Math.min(left.min, right.min);
	}
	int query(int i,int j)
	{
		if(i==l&&j==r)
			return min;
		else if(j<=m)
			return left.query(i, j);
		else if(i>m)
			return right.query(i, j);
		else
			return Math.min(left.query(i, m),right.query(m+1, j));
	}
}
