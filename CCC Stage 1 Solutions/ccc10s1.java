import java.util.*;
public class ccc10s1
{
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);
	int n, r, s, d, total;
	String name;
	int best1, best2;
	String bestName1, bestName2;

	n = scan.nextInt();
	if (n > 0)
	{
	    name = scan.next();
	    r = scan.nextInt ();
	    s = scan.nextInt ();
	    d =    scan.nextInt ();
	    total = 2 * r + 3 * s + d;
	    best1 = total;
	    bestName1 = name;
	    bestName2 = "";
	    best2 = 0;
	    for (int i = 1 ; i < n ; i++)
	    {
		name = scan.next();
		r = scan.nextInt ();
		s = scan.nextInt ();
		d = scan.nextInt ();
		total = 2 * r + 3 * s + d;
		if ((total > best1) || (total == best1 && name.compareTo (bestName1) < 0))
		{
		    best2 = best1;
		    bestName2 = bestName1;
		    best1 = total;
		    bestName1 = name;
		}
		else if ((total > best2) || (total == best2 && name.compareTo (bestName2) < 0))
		{
		    best2 = total;
		    bestName2 = name;
		}
	    }
	    if (n == 1)
		System.out.println (bestName1);
	    else
	    {
		System.out.println (bestName1);
		System.out.println (bestName2);
	    }
	}
    }
}