package Douwei;
import java.util.*;
public class StrictlyIncreasingSequence {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	boolean yes = false;
	double arr[] = new double[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextDouble();
	}
	for(int i=0;i<a-1;i++) {
		if(arr[i]<arr[i+1]) {
			yes = true;
		}
		else {
			yes = false;
			break;
		}
	}
	if(yes)
		System.out.println("YES");
	else
		System.out.println("NO");
}
}
