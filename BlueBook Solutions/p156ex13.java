import java.util.Scanner;

public class p156ex13{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int count =0;
		int index = 0;
		
			for (int i = 2; i<100000 && s >index ; i++) {
			if(isPrime(i)){
				System.out.print(i+" ");
				index = index+1;
				count = count+1;
				if(count>9) {
					System.out.println("");
					count =0;
				}
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
