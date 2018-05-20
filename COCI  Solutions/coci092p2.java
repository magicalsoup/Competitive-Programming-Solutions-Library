import java.util.*;
public class coci092p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String next = scan.nextLine();
		int [] d = new int[100];
		for(int x =0;x<next.length();x++) 
			d[(int)next.charAt(x)]++;
		if(d['C']==1) {
			System.out.print("XC");
		d['X']--;
		d['C']--;
		}
		if(d['L']==1) {
			if(d['X']==1||(d['X']==2&&d['I']==1&&d['V']==0)) {
				System.out.print('X');
				d['X']--;
			}
			System.out.print('L');
			d['L']--;
		}
		while(d['X']>1) {
			System.out.print('X');
			d['X']--;
		}
		if(d['X']==1&&d['V']==0&&d['I']==1) {
			System.out.print("IX");
			d['I']--;
			d['X']--;
		}
		if(d['X']==1) {
			System.out.print('X');
			d['X']--;
		}
		if(d['I']==1&&d['V']==1) {
			d['I']--;
			System.out.print('I');
		}
		if(d['V']==1) {
			System.out.print('V');
			d['V']--;
		}
		while(d['I']>0) {
			System.out.print('I');
			d['I']--;
		}
	}
}
