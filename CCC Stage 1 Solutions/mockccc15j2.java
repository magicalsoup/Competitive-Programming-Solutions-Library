import java.util.Scanner;

public class mockccc15j2{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	double subsum = a*(((100.0-c)/100.0));
	//double t = b-0.5;
	for(int i=0;i<=100;i++) {
		if(Math.round(i*(c/100.0)+subsum)>=b) {
			System.out.println(i);
			System.exit(0);
	}
	}
		System.out.println("DROP THE COURSE");
	}
	}
