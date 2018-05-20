import java.util.Scanner;
public class cchange{
	public static void main (String [] args){
		@SuppressWarnings("resource")
    	Scanner scan = new Scanner(System.in);
    		int dis, n, ans;
	dis = scan.nextInt();
	n = scan.nextInt();
		int club [] = new int [n];

	for (int i = 0 ; i < n ; i++)
	    club [i] = scan.nextInt ();
	ans = solve (dis, club, n);
	    System.out.println (ans);
    }
	public static int solve (int distance, int [] club, int n)
    {
	int [] f;
	int min, t;

	f = new int [distance + 1];

	f [0] = 0;

	for (int x = 1 ; x <= distance ; x++)
	{
	    min = 999999999;
	    for (int j = 0 ; j < n ; j++)
	    {
		t = x - club [j];
		if (t >= 0 && f [t] >= 0 && f [t] < min)
		    min = f [t];
	    }
	    if (min < 999999999)
		f [x] = min + 1;
	    else
		f [x] = -1;
	}
	return f [distance];
    }
}
