import java.util.*;
public class ccc96s3{
    public static void main (String [] args){
    	Scanner scan = new Scanner(System.in);
	String s;
	StringBuffer b;
	int number, i, k, n, x;

	number = scan.nextInt ();
	for (int j = 0 ; j < number ; j++)
	{

	    n = scan.nextInt ();
	    k = scan.nextInt ();
	    s = "";
	    for (i = 0 ; i < k ; i++)
		s = s + "1";
	    for (; i < n ; i++)
		s = s + "0";
	    x = s.lastIndexOf ("10");
	    System.out.println ("The bit patterns are ");
	    while (x >= 0)
	    {
		System.out.println (s);
		b = new StringBuffer (s.substring (x + 2));
		s = s.substring (0, x) + "01" + b.reverse ();
		x = s.lastIndexOf ("10");
	    }
	    System.out.println (s);
	    //System.out.println ("\n");
	}
	scan.close ();
    }
}