package Douwei;
import java.util.*;
public class SubsetOrNot {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Set<Integer> set = new HashSet<Integer>();
	int a = sc.nextInt();
	while(a-->0) {
		set.add(sc.nextInt());
	}
	int b = sc.nextInt();
	boolean bool =false;
	while(b-->0) {
		if(set.contains(sc.nextInt()))
		bool = true;
		else {
			bool =false;
			break;
		}
	}
	System.out.println(bool?"YES":"NO");
}
}
