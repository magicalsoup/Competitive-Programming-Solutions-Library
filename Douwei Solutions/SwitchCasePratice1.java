package Douwei;
import java.util.*;
public class SwitchCasePratice1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int remainder  = a%11;
	switch(remainder) {
	case 0:
		System.out.println("The remainder is zero");
		break;
	case 1:
		System.out.println("The remainder is one");
		break;
	case 2:
		System.out.println("The remainder is two");
		break;
	
	case 3:
		System.out.println("The remainder is three");
		break;
	
	case 4:
		System.out.println("The remainder is four");
		break;
	
	case 5:
		System.out.println("The remainder is five");
		break;
	
	case 6:
		System.out.println("The remainder is six");
		break;
	
	case 7:
		System.out.println("The remainder is seven");
		break;
	
	case 8:
		System.out.println("The remainder is eight");
		break;
	
	case 9:
		System.out.println("The remainder is nine");
		break;
	
	case 10:
		System.out.println("The remainder is ten");
		break;
	
	}
}
}
