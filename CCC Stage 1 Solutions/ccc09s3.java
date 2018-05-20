
import java.util.*;

public class ccc09s3
{

    public static void main (String[] args)
    {
Scanner sc = new Scanner(System.in);
	int[] [] g;	
	g = new int [50] [50];
	for (int i = 0 ; i < 50 ; i++)
	    for (int j = 0 ; j < 50 ; j++)
		g [i] [j] = 0;
	g [1] [6] = 1;
	g [6] [1] = 1;
	g [2] [6] = 1;
	g [6] [2] = 1;
	g [3] [6] = 1;
	g [6] [3] = 1;
	g [4] [6] = 1;
	g [6] [4] = 1;
	g [5] [6] = 1;
	g [6] [5] = 1;
	g [7] [6] = 1;
	g [6] [7] = 1;
	g [3] [4] = 1;
	g [4] [3] = 1;
	g [4] [5] = 1;
	g [5] [4] = 1;
	g [3] [5] = 1;
	g [5] [3] = 1;
	g [3] [15] = 1;
	g [15] [3] = 1;
	g [13] [15] = 1;
	g [15] [13] = 1;
	g [14] [13] = 1;
	g [13] [14] = 1;
	g [12] [13] = 1;
	g [13] [12] = 1;
	g [7] [8] = 1;
	g [8] [7] = 1;
	g [8] [9] = 1;
	g [9] [8] = 1;
	g [9] [10] = 1;
	g [10] [9] = 1;
	g [9] [12] = 1;
	g [12] [9] = 1;
	g [10] [11] = 1;
	g [11] [10] = 1;
	g [11] [12] = 1;
	g [12] [11] = 1;
	g [16] [17] = 1;
	g [17] [16] = 1;
	g [16] [18] = 1;
	g [18] [16] = 1;
	g [18] [17] = 1;
	g [17] [18] = 1;
	char command;
	int x, y;
	command = sc.next().charAt(0);
	while (command != 'q')
	{
	    if (command == 'i')
	    {
		x = sc.nextInt ();
		y = sc.nextInt();
		g [x] [y] = 1;
		g [y] [x] = 1;
	    }
	    else if (command == 'd')
	    {
		x = sc.nextInt ();
		y = sc.nextInt();
		g [x] [y] = 0;
		g [y] [x] = 0;
	    }
	    else if (command == 'n')
	    {
		x = sc.nextInt ();
		int count = 0;
		for (int i = 0 ; i < 50 ; i++)
		    if (g [x] [i] == 1)
			count++;
		System.out.println (count);
	    }
	    else if (command == 'f')
	    {
		x = sc.nextInt ();
		int count = 0;
		count = friendofFriends (g, x);
		System.out.println (count);
	    }
	    else if (command == 's')
	    {
		x = sc.nextInt ();
		y = sc.nextInt ();
		int count = 0;
		count = shortestPath (g, x, y);
		if (count == 999)
		    System.out.println ("Not connected");
		else
		    System.out.println (count);
	    }
	    command = sc.next().charAt(0);
	}
    }

    public static int friendofFriends (int[] [] g, int x)
    {
	int[] [] q = new int [50] [50];
	int count = 0;
	for (int i = 0 ; i < 50 ; i++)
	    for (int j = 0 ; j < 50 ; j++)
		q [i] [j] = g [i] [j];

	for (int i = 0 ; i < 50 ; i++)
	    if (q [x] [i] == 1)
		for (int j = 0 ; j < 50 ; j++)
		    if (q [i] [j] == 1 && j != x && q [x] [j] == 0)
			q [x] [j] = 2;

	for (int i = 0 ; i < 50 ; i++)
	    if (q [x] [i] == 2)
		count++;
	return count;
    }


    public static int shortestPath (int[] [] g, int x, int y)
    {
	int[] [] q = new int [50] [50];
	int count = 0;
	for (int i = 0 ; i < 50 ; i++)
	    for (int j = 0 ; j < 50 ; j++)
		if (g [i] [j] == 1)
		    q [i] [j] = g [i] [j];
		else
		    q [i] [j] = 999;

	for (int i = 0 ; i < 50 ; i++)
	    for (int j = 0 ; j < 50 ; j++)
		if (q [i] [j] > 0)
		    for (int k = 0 ; k < 50 ; k++)
			if ((q [j] [k] > 0) && (q [i] [j] + q [j] [k] < q [i] [k]))
			{
			    q [i] [k] = q [i] [j] + q [j] [k];
			    q [k] [i] = q [i] [j] + q [j] [k];
			}

	return q [x] [y];
    }
}