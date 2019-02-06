import java.util.*;
public class RollingEncryption {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); sc.nextLine();
		int alpha[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String str = sc.nextLine();
		for(int i = 0; i < k; i++) System.out.print(str.charAt(i));
		
		
		for(int cur = k; cur < str.length(); cur++) {
			int freq[] = new int[26], max = 0; int t = 0;
			for(int i = cur - k; i < cur; i++) {
				freq[str.charAt(i) - 'a']++; 
			}
			for(int i = 0; i < freq.length; i++) {
				if(freq[i] > max) {
					max = freq[i]; 
					t = i;
				}
			}
			t = alpha[t % 26];
			int i = (str.charAt(cur) - 'a' + t) % 26;
			System.out.print(alphabet.charAt(i));

		}
		sc.close();
	}
}
