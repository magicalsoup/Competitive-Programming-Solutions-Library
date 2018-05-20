import java.util.*;

public class ccc10s2
{

    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);
	int k, i;
	char[] letter = new char [20];
	String[] code = new String [20];
	String binary;
	String answer;
	// input section
	k = scan.nextInt();
	for (i = 0 ; i < k ; i++)
	{
	    letter[i] = scan.next().charAt(0);
	    code [i] = scan.next();
	    scan.nextLine();
	}
	binary = scan.nextLine();

	//Translate
	answer = "";
	while (binary.length () > 0)
	{
	    // simple search as one code MUST be found
	    i = 0;
	    while (!binary.startsWith (code [i]))
		i++;

	    // add letter to answer and remove that code from binary
	    answer = answer + letter [i];
	    binary = binary.substring (code [i].length ());
	}

	System.out.println (answer);
    }
}