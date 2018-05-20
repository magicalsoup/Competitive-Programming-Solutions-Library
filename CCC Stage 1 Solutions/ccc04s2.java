import java.util.*;
public class ccc04s2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
	//String file;
	int n, k;
	int[] y = new int [100];
	int[] r = new int [100];
	int[] w = new int [100];
	n = scan.nextInt ();
	k = scan.nextInt ();

	for (int i = 0 ; i < n ; i++)
	{
	    y [i] = 0;
	    w [i] = 1;
	}

	for (int i = 0 ; i < k ; i++)
	{
	    for (int j = 0 ; j < n ; j++)
		y [j] = y [j] + scan.nextInt ();
	    for (int j = 0 ; j < n ; j++)
	    {
		int t = 1;
		for (int p = 0 ; p < n ; p++)
		    if (p != j && y [p] > y [j])
			t++;
		if (t > w [j])
		    w [j] = t;
		r [j] = t;
	    }
	}
	for (int j = 0 ; j < n ; j++)
	    if (r [j] == 1)
		System.out.println ("Yodeller " + (j + 1) + " is the TopYodeller: score " + y [j] + ", worst rank " + w [j]);
    }
}