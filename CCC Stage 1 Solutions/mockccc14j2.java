import java.util.Scanner;


public class mockccc14j2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int numFoldedPieces = Integer.parseInt(in.nextLine());
		
		String out = "";
	
		String[] pieces = new String[numFoldedPieces];
		
		//Puts the String into the array, backwards. The -1 is there, because the array starts at 0, not 1.
		for (int i = 0;i < numFoldedPieces;++i)
			pieces[numFoldedPieces - i - 1] = in.nextLine();
		
		//Prints the characters in each String from ==> direction, then <== in the next String, then ==> again, until it goes through the Array.
		for (int i = 0;i < numFoldedPieces;++i)
		{
			String input = pieces[i];
			
			while (!input.equals(""))
			{
				//Gets either the first or last character in the String.
				char charAt = input.charAt((i%2) * (input.length()-1));
				
				if (charAt != ' ')
					System.out.print(charAt);
				
				if (i%2==0)
					input = input.substring(1, input.length());
				else
					input = input.substring(0, input.length()-1);
			}
		}
	}
}