import java.util.Scanner;
public class ccc01j2 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	 long a = scan.nextLong();
	 long b = scan.nextLong();
	 
	 for(int x =0; x<1000;x++) {
		 if((a*x-1)%b ==0) {
		 	 System.out.println(x);
		 	 System.exit(0);
		 }
	 }
	 System.out.println("No such integer exists.");
	 }	 
}