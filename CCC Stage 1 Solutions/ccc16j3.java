import java.util.*;
public class ccc16j3{
	public static boolean p(String str) {
		String reverse = "";
		int length = str.length();
		for(int i = length-1;i>=0;i--)
			reverse = reverse+str.charAt(i);
		if(str.equals(reverse))
			return true;
		else
			return false;
	}
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int arr[] = new int[str.length()];
	for(int i=0;i<str.length();i++) {
		for(int j= i+1;j<str.length();j++) {
			if(p(str.substring(i, j+1))) {
				arr[i] = j-i+1;
			}
		}
	}
	Arrays.sort(arr);
	System.out.println(arr[arr.length-1]);
}
}
