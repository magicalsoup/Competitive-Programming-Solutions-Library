package Douwei;
import java.util.*;
public class DigitalRoots {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		int num = sc.nextInt();
		int ans =0;
		if(num==0)
			break;
		int sum =0;
		while(num!=0) {
			sum = sum+num%10;
			num/=10;
		}
		ans = sum;
		int lol =0;
		while(sum>9) {
			while(sum!=0) {
				lol = lol+sum%10;
				sum/=10;
			}
			ans = lol;
		}
		System.out.println(ans);
	}
}
}
