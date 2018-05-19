import java.util.Arrays;
import java.util.Scanner;
public class wc172j3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int [] people = new int[n];
	for(int i=0;i<n;i++) {
		people[i] = scan.nextInt();
	}
	Arrays.sort(people);
	int nope =0;
	int yep =0;
	for(int i =0;i<n;i++) {
		if(people[i]>=m) {
			yep++;
		}
		else {
			nope++;
		}
	}
	if(nope<=yep) {
		System.out.println(nope+yep);
	}
	else {
		System.out.println(yep*2);
	}
	}
}
