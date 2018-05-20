package Douwei;
import java.util.*;
public class AlphabeticAverage {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	while(true){
		String s = "";
	 s = sc.next();
	double average =0;
	for(int i=0;i<s.length();i++) {
	 char c =  s.charAt(i);
	 average = average+((int)c-64);
		//System.out.println(average);
	}
	 double average1 = (average/(s.length()));
	 double ans = Math.round(average1);
	System.out.println((char)(ans+64));
	}
}
}
