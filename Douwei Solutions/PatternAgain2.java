package Douwei;
import java.util.*;
public class PatternAgain2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int value =0;
	int count =1;
	int index = 0;
	boolean repeat = false;
	while(index<a) {
		for(int i = 0;i<count;i++) {
			if(i!=count-1)
			System.out.print(value+" ");
			else
				System.out.print(value);
			if(!repeat)
			value++;
			else 
				value--;
			if(value>9&&repeat ==false) {
				value =9;
				repeat = true;
			}
			if(value<0&&repeat==true) {
				value =0;
				repeat = false;
			}
		}
		count+=2;
		index++;
		System.out.println();
	}
}
}
