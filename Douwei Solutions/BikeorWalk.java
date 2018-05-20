package Douwei;
import java.util.*;
public class BikeorWalk {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int dis = sc.nextInt();
	int time1 =0;
	time1 = dis/3;
	time1 = time1+50;
	double time2 =0;
	time2 = dis/1.2;
	if(time1<time2) {
		System.out.println("bike");
	}
	else if(time2<time1) {
		System.out.println("walk");
	}
	else {
		System.out.println("both");
	}
}
}
