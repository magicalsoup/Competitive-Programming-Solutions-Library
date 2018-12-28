import java.util.*;
public class SAOJ3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int freq[] = new int[26];
		while(sc.hasNextLine()) {
			String s = sc.nextLine().toLowerCase();
			for(int i = 0; i < s.length(); i++) { if(Character.isAlphabetic(s.charAt(i))) freq[s.charAt(i) - 'a']++;}
		}
		for(int i : freq) System.out.print(i + " "); sc.close();
	}
}
