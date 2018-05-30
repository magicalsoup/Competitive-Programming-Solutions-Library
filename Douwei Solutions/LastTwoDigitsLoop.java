package Douwei;
// this question was very unclear
import java.util.*;
public class LastTwoDigitsLoop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		while(n-->0) {
			int x = sc.nextInt();
			if(x%100==12)
				count++;
		}
	System.out.println(count);
	sc.close();
	}
}
