package Douwei;



import java.util.Scanner;

public class leapyear {
    
    public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    		int m = scan.nextInt();
        boolean isLeapYear = (( m % 4 == 0) && (m % 100 != 0) || (m % 400 == 0)||(m == 0));

        if (isLeapYear)
        	
        {
            System.out.println("YES");
        } else
            System.out.println("NO");
}
}

						

						
			
	