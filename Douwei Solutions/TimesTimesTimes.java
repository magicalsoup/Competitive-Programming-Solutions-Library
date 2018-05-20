package Douwei;
import java.util.*;
public class TimesTimesTimes {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=0;i<a;i++) {
		int n = sc.nextInt();
		long sum =1;
		int m =0;;
		while(n > 0)
        {
            m = n % 10;
            sum = sum * m;
            n = n / 10;
        }
		System.out.println(sum);
		}
}
}
