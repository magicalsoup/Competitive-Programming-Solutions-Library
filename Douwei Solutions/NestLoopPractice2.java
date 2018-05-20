package Douwei;
import java.util.*;
public class NestLoopPractice2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=a;i>0;i--) {
		for(int j=1;j<=a;j++) {
			for(int k=a;k>0;k--) {
				System.out.println(i+" "+j+" "+k);
			}
		}
	}
}
}
