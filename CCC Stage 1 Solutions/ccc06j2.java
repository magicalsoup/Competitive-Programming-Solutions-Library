import java.util.Scanner;
public class ccc06j2{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int count =0;
		for(int i=a;i>0;i--) {
			for(int j=b;j>0;j--) {
				if (i+j==10) {
					count++;}
				}
		}
		if(count==0) {
			System.out.println("There are 0 ways to get the sum 10.");
		}
		else if(count==1) {
			System.out.println("There is 1 way to get the sum 10.");
		}
		else if(count>1) {
		System.out.println("There are "+count+" ways to get the sum 10.");
		}
}
}
