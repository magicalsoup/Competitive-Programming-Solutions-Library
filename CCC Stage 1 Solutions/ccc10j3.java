import java.util.Scanner;

public class ccc10j3{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int a = 0;
	int b = 0;
	
	for(;;) {
		int c = scan.nextInt();
		if(c == 7) {
			break;
		}
		String e = scan.nextLine();
		String arr[] = e.split(" ");		
		String x = "";
		String y = "";
		if(arr.length<= 2) {
			x = arr[1];
		}
		else {
			x = arr[1];
			y = arr[2];
		}

		if(c == 1) {
			if(x.equals("A")) {
				int y2 = Integer.parseInt(y);
				a = y2;
			}
			else if(x.equals("B")) {
				int y2 = Integer.parseInt(y);
				b = y2;
			}
		}
		else if(c == 2) {
			if(x.equals("A")) {
				System.out.println(a);
			}
			else if(x.equals("B")) {
				System.out.println(b);
			}
		}
		
		else if(c == 3) {
			if(x.equals("A")&&y.equals("B")) {
				a = a + b;
			}
			else if(x.equals("B")&&y.equals("A")) {
				b = a + b;
			}
			else if(x.equals("A")&&y.equals("A")) {
				a = a + a;
			}
			else {
				b = b + b;
			}	
		}
		else if(c == 4) {
			if(x.equals("A")&&y.equals("B")) {
				a = a * b;
			}
			else if(x.equals("B")&&y.equals("A")) {
				b = a * b;
			}
			else if(x.equals("A")&&y.equals("A")) {
				a = a * a;
			}
			else {
				b = b * b;
			}
		}
		else if(c == 5) {
			if(x.equals("A")&&y.equals("B")) {
				a = a - b;
			}
			else if(x.equals("B")&&y.equals("A")) {
				b = b - a;
			}
			else if(x.equals("A")&&y.equals("A")) {
				a = a - a;
			}
			else {
				b = b - b;
			}
		}
		else if(c == 6) {
			if(x.equals("A")&&y.equals("B")) {
				a = a / b;
			}
			else if(x.equals("B")&&y.equals("A")) {
				b = b / a;
			}
			else if(x.equals("A")&&y.equals("A")) {
				a = a / a;
			}
			else {
				b = b / b;
			}
		}
		
	}
	
	}
}

