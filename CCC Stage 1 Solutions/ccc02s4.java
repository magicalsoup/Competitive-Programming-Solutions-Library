import java.util.*;
public class ccc02s4{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
	String [] name;
	int [] time;
	int m, n;
	int totalTime = 0;
	m = sc.nextInt ();
	n = sc.nextInt ();
	name = new String [n];
	time = new int [n];
	for (int i = 0 ; i < n ; i++)
	{
		sc.nextLine();
	    name [i] = sc.nextLine ();
	    time [i] = sc.nextInt ();
	}
	int [] best = new int [n + 1];
	int [] group = new int [n + 1];
	for (int i = 0 ; i < n + 1 ; i++)
	{
	    best [i] = 1000000;
	    group [i] = -1;
	}
	best [0] = 0;
	group [0] = 0;
	for (int i = 0 ; i < n + 1 ; i++)
	{
	    int cur = 0;
	    for (int j = 1 ; j <= m && i + j - 1 < n ; j++)
	    {
		cur = Math.max (cur, time [i + j - 1]);
		if (best [i] + cur < best [i + j])
		{
		    best [i + j] = best [i] + cur;
		    group [i + j] = j;
		}
	    }
	}

	System.out.println ("Total Time: " + best [n]);
	int [] lines = new int [n + 1];
	int k = n;
	int x = 0;
	while (group [k] != 0)
	{
	    lines [x++] = group [k];
	    k = k - group [k];
	}
	int z = 0;
	for (int i = x - 1 ; i >= 0 ; i--)
	{
	    for (int j = 0 ; j < lines [i] ; j++)
		System.out.print (name [z++] + " ");
	    System.out.println ();
	}
    }
}