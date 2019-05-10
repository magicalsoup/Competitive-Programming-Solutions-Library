import java.util.*;
public class Shoes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a[] = sc.nextLine().split(" ");
		int first=0, second=0;
		int num[] = {1,2,3,4};
		for(int i=0; i<a.length; i++) {
			if(a[i].equals("L")) first = i+1;
			if(a[i].equals("R")) second = i+1;
			
		}
		
		System.out.println(first + " " + second);
		num[first-1]=0; num[second-1]=0;
		for(int i=0; i<num.length; i++)
			if(num[i] != 0) System.out.print((i+1) + " ");
		sc.close();
	}
}
