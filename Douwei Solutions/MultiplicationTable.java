package Douwei;
import java.util.*;
public class MultiplicationTable {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			if(j!=i) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			else {
				System.out.print(i+"*"+j+"="+i*j);
			}
		}
		System.out.println();
	}
}
}
