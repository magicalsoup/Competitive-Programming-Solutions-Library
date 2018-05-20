package Douwei;
import java.util.*;
public class SwitchCasePratice2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	double sum =0;
	for(int i=0;i<a;i++) {
	String s = sc.next();
	int amount = sc.nextInt();
	 s =s.toLowerCase();
	 switch(s) {
	 case "a":
		 sum = sum+(amount*1.99);
		 break;
	 case "b":
		 sum = sum+(amount*0.49);
		 break;
	 case "w":
		 sum = sum +(amount*2.99);
		 break;
	 case "p":
		 sum = sum+(amount*1.59);
		 break;
	 case "t":
		 sum = sum+(amount*0.89);
		 break;
	 case "l":
		 sum = sum+(amount*1.29);
		 break;
	 case "o":
		 sum = sum+(amount*0.69);
	 }
	}
	System.out.println(sum);
}
}
