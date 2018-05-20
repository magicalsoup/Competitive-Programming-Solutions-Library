import java.util.*;
public class ccc07s2{

    public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
	int l, w, h, n, j, m;
	Box[] b;
	Box hold;
	n = scan.nextInt ();
	b = new Box [n];
	for (int i = 0 ; i < n ; i++)
	{
	    l = scan.nextInt ();
	    w = scan.nextInt ();
	    h = scan.nextInt ();
	    b [i] = new Box (l, w, h);
	}
	for (int i = 1 ; i < n ; i++)
	{
	    j = i - 1;
	    hold = b [i];
	    while (j >= 0 && b [j].volume > hold.volume)
	    {
		b [j + 1] = b [j];
		j--;
	    }
	    b [j + 1] = hold;
	}
	m = scan.nextInt ();
	for (int i = 0 ; i < m ; i++)
	{
	    l = scan.nextInt ();
	    w = scan.nextInt ();
	    h = scan.nextInt ();
	    hold = new Box (l, w, h);
	    j = 0;
	    while (j < n && (hold.l > b [j].l ||
			hold.w > b [j].w ||
			hold.h > b [j].h))
		j++;
	    if (j < n)
		System.out.println (b [j].volume);
	    else
		System.out.println ("Item does not fit.");
	}
    }
}

class Box
{
    public int l, w, h;
    public long volume;

    public Box (int a, int b, int c)
    {
	int t;
	l = a;
	w = b;
	h = c;
	if (l > w)
	{
	    t = l;
	    l = w;
	    w = t;
	}
	if (w > h)
	{
	    t = w;
	    w = h;
	    h = t;
	}
	if (l > w)
	{
	    t = l;
	    l = w;
	    w = t;
	}
	volume = l * w * h;
    }
}