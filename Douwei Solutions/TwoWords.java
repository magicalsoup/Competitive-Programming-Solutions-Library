package Douwei;
import java.util.*;
public class TwoWords {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String s1 = sc.nextLine();
	boolean t = false;
	char arr[] = s.toCharArray();
	char arr2[] = s1.toCharArray();
	Arrays.sort(arr);
	Arrays.sort(arr2);
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s1.length();j++) {
				if(arr[i]==arr2[j]) {
					t =true;
				}
				else {
					t = false;
				}
		}
	}
	if(t)System.out.println("YES");
	else System.out.println("NO");
}
}
