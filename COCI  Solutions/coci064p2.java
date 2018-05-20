import java.util.*;
public class coci064p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int zr = scan.nextInt();
		int zc = scan.nextInt();
		scan.nextLine();
		for(int x =0;x<r;x++) {
			String s  = scan.next();
			for(int y=0;y<zr;y++) {
				for(int z =0;z<c*zc;z++) {
					System.out.print(s.charAt(z/zc));
				}
				System.out.println();
			}
		}
	}
}
