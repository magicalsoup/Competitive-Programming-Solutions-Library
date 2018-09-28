package Douwei;
import java.util.*;
public class GenerateTheCalendar {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int months[] = {31, 28,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31};
		int year = sc.nextInt();
		int month = sc.nextInt();
		int first = 100;
		int g = 1;
		int h = 5;
		while(first < year || g < month) {
			if ( g != 2 && g != 13)
				h += months[g-1];
			else if(g != 2){
				first++;
				g = 0;
			}
			else if( first % 4 == 0 && first %100 !=0 || first % 400 == 0) // check for leap years
				h++;
			g++;
			h %= 7;
		}
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i = 0 - h; i < months[month - 1] - 1; i++){
			if( i < 0) { 
				System.out.print("   ");
				continue;
			}
			if( i < 9) {
				System.out.print(" ");
			}
			System.out.print( (i + 1) );
			if( (i + h + 1) % 7 ==0 ) // check if its a new week
				System.out.println();
			else
				System.out.print(" ");
		}
		System.out.print(months[month - 1]);
		if(month == 2){ // if its February 
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // if its a leap year
				System.out.print(" 29");
		}
		sc.close();
	}
}
