import java.util.Scanner;

public class ccc04j1 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		 double t = n;
		 double h = Math.sqrt(t);

			int a = (int) h;
			
			 System.out.println("The largest square has side length "+a+".");		
	}
}