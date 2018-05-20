package Douwei;
import java.util.Arrays;
import java.util.Scanner;
public class CharacterMatching {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String s1 = sc.nextLine();
	int t = 0;
	char arr[] = s.toCharArray();
	char arr2[] = s1.toCharArray();
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s1.length();j++) {
				if(arr[i]==arr2[j]&&i==j) {
					t++;
				}
		}
	}
	System.out.println(t);
}
}
