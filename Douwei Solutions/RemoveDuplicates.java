package Douwei;
import java.util.Scanner;
public class RemoveDuplicates{ 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			String stringWithDuplicates = sc.nextLine();
			char[] characters = stringWithDuplicates.toCharArray();
			boolean[] found = new boolean[256];
			StringBuilder sb = new StringBuilder();
			for (char c : characters) {
				if (!found[c]) {
				    found[c] = true;
				    sb.append(c);
				}
			}
			System.out.println(sb.toString());
		    }
}