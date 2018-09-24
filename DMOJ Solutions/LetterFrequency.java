import java.util.*;
public class LetterFrequency {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int alpha[][] = new int[str.length() + 1][27];
		for(int i = 0; i < str.length(); i++) 
			if(str.charAt(i) != ' ')
				alpha[i+1][str.charAt(i)- 'a' + 1]++;
		for(int i = 1; i <= str.length(); i++) {
			for(int j = 1; j <= 26; j++) { 
				alpha[i][j] += alpha[i-1][j];
			}
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			char c = sc.next().charAt(0);
			System.out.println(alpha[b][c - 'a' + 1] - alpha[a-1][c - 'a' + 1]);
		}
		sc.close();
	}
}
