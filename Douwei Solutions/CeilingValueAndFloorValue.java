package Douwei;
import java.util.*;
public class CeilingValueAndFloorValue {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double ceil = Math.ceil(a);
	double floor = Math.floor(a);
	int ans1 = (int)ceil;
	int ans2 = (int)floor;
	System.out.println("FLOOR "+ans2);
	System.out.println("CEIL "+ans1);
}
}
