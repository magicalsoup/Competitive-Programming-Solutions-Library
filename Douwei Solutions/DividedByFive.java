package Douwei;
import java.util.*;
public class DividedByFive {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int ans = a%5;
	String finalans = "";
	switch(ans) {
	case 0:
		finalans = "ZERO";
		break;
	case 1:
		finalans = "ONE";
		break;
	case 2:
		finalans = "TWO";
		break;
	case 3:
		finalans = "THREE";
		break;
	case 4:
		finalans = "FOUR";
		break;
	}
	System.out.println(finalans);
}
}
