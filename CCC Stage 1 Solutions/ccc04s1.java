import java.util.*;
public class ccc04s1{ 
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	int n;
	String[] word = new String [3];
	n = scan.nextInt ();
	scan.nextLine();
	for (int i = 0 ; i < n ; i++)
	{
	    for (int j = 0 ; j < 3 ; j++)
		word [j] = scan.nextLine ();
	    if (word [0].startsWith (word [1]) ||
		    word [0].startsWith (word [2]) ||
		    word [1].startsWith (word [2]) ||
		    word [1].startsWith (word [0]) ||
		    word [2].startsWith (word [0]) ||
		    word [2].startsWith (word [1]) ||
		    word [0].endsWith (word [1]) ||
		    word [0].endsWith (word [2]) ||
		    word [1].endsWith (word [2]) ||
		    word [1].endsWith (word [0]) ||
		    word [2].endsWith (word [0]) ||
		    word [2].endsWith (word [1]))
		System.out.println ("No");
	    else
		System.out.println ("Yes");

	}
    }
}
