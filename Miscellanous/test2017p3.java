
import java.util.Scanner;

public class test2017p3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n <= 31) {
			System.out.print("01/");
			if(n < 10) {
			System.out.print("0" + n);
			}
			else {
				System.out.print(n);
			}
		}//end of if
		else if(n <= 59) {
			System.out.print("02/");
			if(n < 41) {
			System.out.print("0" + (n - 31));
			}
			else {
			System.out.print(n - 31);
			}
		}//end of if
		else if(n <= 90) {
			System.out.print("03/");
			if(n < 70) {
				System.out.print("0" + (n - 59));
			}
			else {
				System.out.print(n - 59);
			}
		}//end of if
		else if(n <= 120) {
			System.out.print("04/");
			if(n < 100) {
				System.out.print("0" + (n - 90));
			}
			else {
				System.out.print(n - 90);
			}
		}//end of if
		else if(n <= 151) {
			System.out.print("05/");
			if(n < 130) {
				System.out.print("0" + (n - 120));
			}
			else {
				System.out.print(n - 120);
			}
		}//end of if
		else if(n <= 181){
			System.out.print("06/");
			if(n < 161) {
				System.out.print("0" + (n - 151));
			}
			else {
				System.out.print(n - 151);
			}
		}//end of if
		else if(n <= 212) {
			System.out.print("07/");
			if(n < 191) {
				System.out.print("0" + (n - 181));
			}
			else {
				System.out.print(n - 181);
			}
		}//end of if
		else if(n <= 243) {
			System.out.print("08/");
			if(n < 222) {
				System.out.print("0" + (n - 212));
			}
			else {
				System.out.print(n - 212);
			}
		}//end of if
		else if(n <= 273) {
			System.out.print("09/");
			if(n < 253) {
				System.out.print("0" + (n - 243));
			}
			else {
				System.out.print(n - 243);
			}
		}//end of if
		else if(n <= 304) {
			System.out.print("10/");
			if(n < 283) {
				System.out.print("0" + (n - 273));
			}
			else {
				System.out.print(n - 273);
			}
		}//end of if
		else if(n <= 334) {
			System.out.print("11/");
			if(n < 314) {
				System.out.print("0" + (n - 304));
			}
			else {
				System.out.print(n - 304);
			}
		}//end of if
		else if(n <= 365) {
			System.out.print("12/");
			if(n < 344) {
				System.out.print("0" + (n - 334));
			}
			else {
				System.out.print(n - 334);
			}
		}//end of if	
	}
}
