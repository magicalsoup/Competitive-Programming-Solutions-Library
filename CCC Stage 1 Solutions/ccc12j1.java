import java.util.Scanner;

public class ccc12j1 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

int a =scan.nextInt();
int b =scan.nextInt();
if (b <=a) {
	System.out.println("Congratulations, you are within the speed limit!");
}

if (b-a >0&& b-a<=20) {
	System.out.print("You are speeding and your fine is $100.");
}

if(b-a>20&&b-a<=30) {
	System.out.println("You are speeding and your fine is $270.");
}

if(b-a>30) {
	System.out.println("You are speeding and your fine is $500.");
}

}
}
