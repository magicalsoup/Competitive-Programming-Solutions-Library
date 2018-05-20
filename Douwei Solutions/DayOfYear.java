package Douwei;
import java.util.*;
public class DayOfYear {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int d = scan.nextInt();
int y = scan.nextInt();
if((y%4==0&&y%100!=0)||y%400==0||y==0) {
if(d >= 0 && d <= 31) {
System.out.println(d + " " + "JANUARY");
}
else if(d >=32 && d <= 60) {
System.out.println(d-31+ " " + "FEBRUARY");
}
else if(d >= 61 && d <= 91) {
System.out.println(d-60+ " " + "MARCH");
}
else if(d > 91&& d <= 121) {
System.out.println(d-91+ " " + "APRIL");
}
else if(d > 121&&d <= 152) {
System.out.println(d-121+ " " + "MAY");
}
else if(d > 152 && d <= 182) {
System.out.println(d-152+ " " + "JUNE");
}
else if(d > 182 && d <= 213) {
System.out.println(d-182+ " " + "JULY");
}
else if(d > 213 && d <= 244) {
System.out.println(d-213+ " " + "AUGUST");
}
else if(d>244&&d<=274) {
System.out.println(d-244+ " " + "SEPTEMBER");
}
else if(d>274&&d<=305) {
System.out.println(d-274+ " " + "OCTOBER");
}
else if(d>305&&d<=335) {
System.out.println(d-305+ " " + "NOVEMBER");
}
else if(d>335&&d<=366) {
System.out.println(d-335+ " " + "DECEMBER");
}
}
else {
if(d >= 0 && d <= 31) {
System.out.println(d + " " + "JANUARY");
}
else if(d >=32 && d <= 59) {
System.out.println(d-31+ " " + "FEBRUARY");
}
else if(d >= 60 && d <= 90) {
System.out.println(d-59+ " " + "MARCH");
}
else if(d > 90 && d <= 120) {
System.out.println(d-90+ " " + "APRIL");
}
else if(d > 120&&d <= 151) {
System.out.println(d-120+ " " + "MAY");
}
else if(d > 151 && d <= 181) {
System.out.println(d-151+ " " + "JUNE");
}
else if(d > 181 && d <= 212) {
System.out.println(d-181+ " " + "JULY");
}
else if(d > 212 && d <= 243) {
System.out.println(d-212+ " " + "AUGUST");
}
else if(d>243&&d<=273) {
System.out.println(d-243+ " " + "SEPTEMBER");
}
else if(d>273&&d<=304) {
System.out.println(d-273+ " " + "OCTOBER");
}
else if(d>304&&d<=334) {
System.out.println(d-304+ " " + "NOVEMBER");
}
else if(d>334&&d<=365) {
System.out.println(d-334+ " " + "DECEMBER");
}
}
}
}