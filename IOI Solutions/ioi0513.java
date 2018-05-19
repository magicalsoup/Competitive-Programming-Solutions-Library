import java.util.*;
public class ioi0513 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	node root = new node(1,n,0);
	String c = sc.next();
	while(!c.equals("E"))
	{
			if(c.equals("Q"))
				System.out.println(root.query(sc.nextInt()));
			else
				root.update(sc.nextInt(), sc.nextInt(), sc.nextInt());
			c = sc.next();
	}
	sc.close();
}
}
class node
{
	int from,to;
	int S,H;
	boolean leaf;
	node left,right;
	int x;
	node(int l,int r,int d)
	{
		from = l;
		to = r;
		leaf = true;
		x = d;
		S = (r-l+1)*d;
		H = S;
	}
	void update(int l,int r,int d) {
		if(l==from&&r==to)
		{
			S = (r-l+1)*d;
			H=S;
			leaf = true;
			x = d;
			return;
		}
		if(leaf)
		{
			leaf = false;
			left = new node(from,(from+to)/2,x);
			right = new node((from+to)/2+1,to,x);
		}
		if(left.to>=r)
			left.update(l, r, d);
		else if(right.from<=l)
			right.update(l, r, d);
		else
		{
			left.update(l, left.to, d);
			right.update(right.from, r, d);
		}
		S = left.S+right.S;
		H = Math.max(left.H, left.S+right.H);
	}
	int query(int h)
	{
		if(h>=H)
			return to;
		if(leaf)
		{
			if(x==0)
				return to;
			return h/x+from-1;
		}
		if(h<left.H)
			return left.query(h);
		return right.query(h-left.S);
	}
}
