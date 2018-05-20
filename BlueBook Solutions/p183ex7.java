import java.util.Scanner;
public class p183ex7{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		for (int i = 1; i<= s ; i++){		
			if(isPrime(i)){
					System.out.println("1");	 
					//index = index+1;
			}else {
					System.out.println("0");
			}
		}//end of for
	}//end of main
	
	static boolean isPrime(int n){
		for (int i = 2;i<n;i++)	{
			if ((n % i== 0)&&(n!=2)) {
				return false;
			}
		} 	
		if ( n == 1) {
			return false;
		}
		return true;
	
	
	}
}//end of class
