

import java.util.Scanner;

public class p154ex8 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
int a =scan.nextInt();
int i;
for (i=1;i<10000;i++) {
	if(i> a ) {
		System.exit(0);
	}
	
	if(a % i == 0) {
		System.out.println(i);
	}
}
	}
	}
