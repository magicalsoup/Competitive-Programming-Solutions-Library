package Douwei;
import java.util.*;
public class 	 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		if(Ascending(a))
			System.out.println("Ascending");
		else if(Descending(a))
			System.out.println("Descending");
		else
			System.out.println("Mixed");
	}
	public static boolean Ascending(int a[]) {
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1])
				continue;
			else
				return false;
		}
		return true;
	}
	public static boolean Descending(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1])
				continue;
			else
				return false;
		}
		return true;
	}
}
