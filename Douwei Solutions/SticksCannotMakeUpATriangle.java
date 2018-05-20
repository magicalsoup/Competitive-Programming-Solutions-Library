package Douwei;
import java.util.*;
public class SticksCannotMakeUpATriangle {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count =0;
	int f = 0, f1 =1, f2 =1;
	while(count<n-2) {
		f = f1+f2;
		f1 = f2;
		f2 = f;
		count++;
	}
	System.out.println(f);
}
}
