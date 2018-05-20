package Douwei;
import java.util.*;
public class getluckymoney {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	for(;;) {
	int a = scan.nextInt();
	if(a == 0) {
		System.exit(0);
	}
	int count = 0;
	int b = 1;
	int days = 0;
	int i = 1;
	while(days < a) {
		b = i;
		for(int j = 1; j <= i; j++) {
			count = count + b;
			days++;
			if(days >= a) {
				break;
			}
		}	
		i++;
		}	
	System.out.println(count);
	}
	}
}
