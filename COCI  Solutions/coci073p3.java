import java.util.*;
public class coci073p3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l = s.length();
		int max =0;
		for(int x =1;x*x<=l;x++) {
			if(l%x==0)
				max =x;
		}
		char [][]c = new char[max][l/max];
		int count =0;
		for(int y=0;y<l/max;y++) {
			for(int x=0;x<max;x++) {
				c[x][y]= s.charAt(count);
				count++;
			}
		}
		for(int x=0;x<max;x++) {
			for(int y=0;y<l/max;y++) {
				System.out.print(c[x][y]);
			}
		}
	}
}
