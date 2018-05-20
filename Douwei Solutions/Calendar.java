package Douwei;
import java.util.Scanner;
public class Calendar {
	static int year;
public static void main(String[]agrs) {
	Scanner scan = new Scanner(System.in);
	year = scan.nextInt();
	int month = scan.nextInt();
	int sum =0;
	for(int i=0;i<=3000;i++) {
		if(leap(i))
			sum +=366;
		else
			sum+=365;
	}
	for(int i=1;i<=month;i++) {
		sum+=days(i);
	}
	int a = sum%7;
	int b = days(month);
	System.out.println("Su Mo Tu We Th Fr Sa");
	for(int c=(4*(a-1))+2;c>2;c--) {
		System.out.print(" ");
	}
	for(int c=1;c<=b;c++,a++) {
		if(a==7) {
			System.out.println();
			a = 0;
		}
		if(c<=9) {
			System.out.print(c+"  ");
		}
		else {
			System.out.print(c+" ");
		}
		System.out.print("");
	}
	}
public static boolean leap(int year) {
	if((( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)||(year == 0)))
		return true;
	else
	return false;
}
public static int days(int n) {
	if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
		return 31;
	if(n==4||n==6||n==9||n==11) {
		return 30;
	}
	if(leap(year)&&n==2)
		return 29;
	else
		return 28;
}
}
