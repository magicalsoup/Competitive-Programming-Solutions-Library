package Douwei;
import java.util.*;
public class SimpleArrayPratice4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String[] arr = new String[a];
	int count =0;
	int count1=0;
	for(int i=0;i<a;i++) {
		char c;
		arr[i] = sc.next();
		 c = arr[i].charAt(0);
		 if(c=='-') {
			 count++;
		 }
		 else {
			 count1++;
		 }
	}
	int space =0;
	int space1 =0;
	for(int i=0;i<a;i++) {
		if(count>count1) {
			if(arr[i].charAt(0)=='-') {
				space++;
				if(space!=count)
				System.out.print(arr[i]+" ");
				else
					System.out.print(arr[i]);
			}
		}
		else if(count1>count) {
			if(arr[i].charAt(0)!='-') {
				space1++;
				if(space1!=count1)
				System.out.print(arr[i]+" ");
				else
					System.out.print(arr[i]);
			}
		}
		else {
			System.out.print(arr[i]+" ");
		}
	}
}
}
