import java.util.*;
public class ccc99s5
{
    static public String[] word = new String [3];
    public static void main (String[] args)
    {
    	Scanner sc = new Scanner(System.in);
	char[] perm = new char [10];
	int n;

	n = sc.nextInt ();
	for (int i = 1 ; i <= n ; i++)
	{
	    word [0] = sc.next();
	    word [1] = sc.next();
	    word [2] = sc.next();
	    for (int j = 0 ; j < 10 ; j++)
		perm [j] = ' ';
	    doPosition (perm, 1, 0);
	}
    }


    // this works on a single position at a time, starting at the right
    // The carry is of course the carry from the previous position.
    public static int doPosition (char[] perm, int position, int carry)
    {
	char[] thisPerm = new char [10];
	int[] hashTable = new int [1000];
	int sum;
	int hash;
	int a, b, c;
	for (int i = 0 ; i < 10 ; i++)
	    thisPerm [i] = perm [i];
	for (int i = 0 ; i < 1000 ; i++)
	    hashTable [i] = 0;
	for (int i = 0 ; i < 10 ; i++)
	    for (int j = 0 ; j < 10 ; j++)
		for (int k = 0 ; k < 10 ; k++)
		{
		    // {a, b, c} forms each permutation for the set of letters
		    a = letterToInt (perm, 0, position, i);
		    b = letterToInt (perm, 1, position, j);
		    c = letterToInt (perm, 2, position, k);
		    hash = a * 100 + b * 10 + c;

		    // if there is a valid perm, (all letters give numbers 
		    //                            and it hasn't been tried before)
		    // see if they add up!
		    if (a >= 0 && b >= 0 && c >= 0 && hashTable [hash] == 0)
		    {
			sum = carry + a + b - c;
			if (sum % 10 == 0)  // ie: it WORKS for this position
			{
			    if (position == word [2].length ()) // we're at the end
			    {
				// the solution is found IF:
				//   the sum == 0 AND c (the number for the left most
				//                       letter in the third word)
				//                       is not zero.
				if (sum == 0 && c > 0)
				{
				    // print solution
				    for (int w = 0 ; w < 3 ; w++)
				    {
					for (int d = word [w].length () ; d > 0 ; d--)
					    System.out.print (letterToInt (perm, w, d, 0));
					System.out.println ();
				    }
				    System.out.println ();
				    // stop the method, successfully
				    return 1;
				}
			    }
			    // not at end, move to next position
			    // and BTW, if it works, stop
			    else if (doPosition (perm, position + 1, sum / 10) == 1)
				return 1;
			}
			// okay it didn't work, remember this and don't try it again.
			hashTable [hash] = 1;
		    }
		    // this perm didn't work, reset to the initial perm and try another
		    for (int p = 0 ; p < 10 ; p++)
			perm [p] = thisPerm [p];
		}
	// this perm did not work.
	return 0;
    }


    // This essentially translates a letter: eg: R into a number, eg: 8
    //
    // "w" and "position" define a letter, starting from the end of the word
    // eg if words = SEND MORE MONEY and it was w=1 and position=2 the letter would be R
    // "number" is the number (or index) of the letter.
    //
    // so a number of things can happen:
    // 1. w and digit define no letter, (out of range): return 0
    // 2. if the letter is already in the perm, return it's number (or index)
    // 3. if the letter is NOT in the perm, and number (or index) is empty,
    //                    put the letter in the perm and return the number
    // 4. if the letter is NOT in the perm, and number (or index) is taken,
    //                    return -1

    public static int letterToInt (char[] perm, int w, int position, int number)
    {
	char letter;
	int j = word [w].length () - position;
	if (j < 0)
	    return 0;
	letter = word [w].charAt (j);
	for (int i = 0 ; i < 10 ; i++)
	    if (perm [i] == letter)
		return i;
	if (perm [number] == ' ')
	{
	    perm [number] = letter;
	    return number;
	}
	return -1;
    }
}
