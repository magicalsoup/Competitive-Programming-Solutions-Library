package Douwei;
import java.util.*;
public class CharPracticeNestLoop {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String alpha2 = alpha.toLowerCase();
	int k =0;
	for(int i=1;i<26;i++) {
		k++;
		if(i%2!=0) {
			for(int j=0;j<a;j++) {
				System.out.print(alpha.charAt(i-1)+" ");
			}
			for(int j=0;j<a;j++) {
				if(j!=a-1)
				System.out.print(alpha2.charAt(k)+" ");
				else
				System.out.print(alpha2.charAt(k));
			}
			if(i!=26-1)
			System.out.println();
	}
	}
}
}
