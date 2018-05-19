

import java.util.Scanner;

public class dwiteoct07p1{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int  arr[] = new int[1000];
		
	
		int primeflag = 1;
		
		String temps;
		
		for(int i = 0; i<1000; i++)	{
			temps = scan.nextLine();
			arr[i] = Integer.parseInt(temps);
		if(arr[i]<= 0) {
			System.out.println("not");
			System.exit(0);
		}
			primeflag = 1;
			for(int j=2;j<arr[i];j++) {
				   
					if((arr[i]%j == 0) && (arr[i] != 2)){
					primeflag = 0;
				}
			}
			
			if (arr[i] == 1) {
				primeflag = 0;
			}
	        if (primeflag == 1) {
	        	System.out.println("prime");
	        	System.exit(0);
	        }else {
	        	System.out.println("not");
	        	System.exit(0);
	        }
		}
		}
		
	}
