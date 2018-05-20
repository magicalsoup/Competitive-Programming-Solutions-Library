import java.util.Arrays;
import java.util.Scanner;
public class ccc07j4{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		s = s.replaceAll(" ","");
		t = t.replaceAll(" ","");
		String arr[] = s.split("");
		String arr2[] = t.split("");
		Arrays.sort(arr);
		Arrays.sort(arr2);
		boolean anagram =false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(arr2[i])) {
				 anagram = true;
			}
			else {
				anagram = false;
				break;
			}
		}
	if(anagram == true) {
		System.out.println("Is an anagram.");
	}
	if(anagram == false) {
		System.out.println("Is not an anagram.");
	}
	}
}
