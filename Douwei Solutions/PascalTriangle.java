package Douwei;
import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String args[])
	{
	    int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
            number = 1;
			for(j=0;j<=i;j++)
			{
				if(j!=i)
				 System.out.print(number+" ");
				else
					System.out.print(number);
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}