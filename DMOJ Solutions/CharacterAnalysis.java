import java.util.*;
public class CharacterAnalysis {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		int [] alpha = new int[127];
		for(int i = 0; i < a.length; i++)
			alpha[a[i] % 127]++;
		for(int i = 0; i < b.length; i++) 
			alpha[b[i] % 127]++;
		
		for(int i = 0; i < alpha.length; i++) 
			if(alpha[i] % 2 != 0) 
				System.out.println((char)(i));
		sc.close();
	}
}
