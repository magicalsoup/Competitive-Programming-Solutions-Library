package Douwei;
import java.util.*;
public class FindTheMedianAgain {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();
	int a = sc.nextInt();
	int temp =0;
	while(temp<a) {
		list.add(sc.nextInt());
	temp++;
	}
	int b = sc.nextInt();
	temp =0;
	while(temp<b) {
		list.add(sc.nextInt());
	temp++;
	}
	int t = a+b;
	if(t%2==0) {
		System.out.println((list.get(t/2-1)+list.get(t/2))/2.0);
	}
	else {
		System.out.println(list.get(t/2));
	}
}
}
