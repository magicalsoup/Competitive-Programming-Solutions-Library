import java.util.Scanner;

public class primes1{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int index = 0;
			for (int i = 2; i<1000 && s >index ; i++)
			{
				if (isPrime(i))
				{
					System.out.println(i);	 
					index = index+1;
			
				}
			}
		}
	
	
	static boolean isPrime(int n) 
		{
		for (int i = 2;i<n;i++)
		{
			if (n % i==0)
			
			
		 return false;
				
	} 	return true;
	
	
	}
}
