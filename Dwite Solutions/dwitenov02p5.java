import java.util.*;
public  class dwitenov02p5{
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for(int j=0;j<5;j++) {
		String line = scan.nextLine();
		int[] freq = new int[26];
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (isLetter(c))
				freq[(c - 'A') % 32]++;
		}
		boolean initial = true;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				if (initial) initial = false;
				else System.out.print(":");
				System.out.printf("%c-%d", (char)('A' + i), freq[i]);
			}
		}
		System.out.println();
	}
	}
	
	private static boolean isLetter(char c) {
		return c >= 'A' && c <= 'Z'
		    || c >= 'a' && c <= 'z';
	}
	
}
