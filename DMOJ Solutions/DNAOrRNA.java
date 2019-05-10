import java.util.*;
public class DNAOrRNA {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next(); sc.close();
		for(int i=0; i<n; i++) {
			if(!valid(str.charAt(i))) {
				System.out.println("neither");
				return;
			}
		}
		int t=0, u=0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'T') t++;
			if(str.charAt(i) == 'U') u++;
		}
		if(t > 0 && u == 0) System.out.println("DNA");
		else if(u > 0 && t == 0) System.out.println("RNA");
		else if(t == 0 && u == 0) System.out.println("both");
		else if(u > 0 && t > 0) System.out.println("neither");
	}
	static boolean valid(char c) {
		return c == 'A' || c == 'C' || c == 'G' || c == 'T' || c == 'U';
	}
}
