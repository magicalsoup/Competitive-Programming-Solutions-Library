import java.util.*;
public class ccc05s1{
    public static void main (String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n;
    	String s;
	n = scan.nextInt ();
	scan.nextLine();
	for (int i = 1; i <= n ; i++)
	    System.out.println (convert (scan.nextLine ()));
    }
    public static String convert (String s)
    {
	String out;
	int i;
	i = 0;
	out = "";
	while (out.length () < 12)
	{
	    if (s.charAt (i) == '1')
		out = out + "1";
	    else if (s.charAt (i) == '2' || s.charAt (i) == 'A' || s.charAt (i) == 'B' || s.charAt (i) == 'C')
		out = out + "2";
	    else if (s.charAt (i) == '3' || s.charAt (i) == 'D' || s.charAt (i) == 'E' || s.charAt (i) == 'F')
		out = out + "3";
	    else if (s.charAt (i) == '4' || s.charAt (i) == 'G' || s.charAt (i) == 'H' || s.charAt (i) == 'I')
		out = out + "4";
	    else if (s.charAt (i) == '5' || s.charAt (i) == 'J' || s.charAt (i) == 'K' || s.charAt (i) == 'L')
		out = out + "5";
	    else if (s.charAt (i) == '6' || s.charAt (i) == 'M' || s.charAt (i) == 'N' || s.charAt (i) == 'O')
		out = out + "6";
	    else if (s.charAt (i) == '7' || s.charAt (i) == 'P' || s.charAt (i) == 'Q' || s.charAt (i) == 'R' || s.charAt (i) == 'S')
		out = out + "7";
	    else if (s.charAt (i) == '8' || s.charAt (i) == 'T' || s.charAt (i) == 'U' || s.charAt (i) == 'V')
		out = out + "8";
	    else if (s.charAt (i) == '9' || s.charAt (i) == 'W' || s.charAt (i) == 'X' || s.charAt (i) == 'Y' || s.charAt (i) == 'Z')
		out = out + "9";
	    else if (s.charAt (i) == '0')
		out = out + "0";
	    i++;
	    if (out.length () == 3 || out.length () == 7)
		out = out + "-";
	}
	return out;
    }
}