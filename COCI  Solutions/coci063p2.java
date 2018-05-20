import java.util.*;
public class coci063p2{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int n=4;
	int scatter =0;
	String s;
	int x,y,let;
	for(int i=0;i<n;i++) {
		s = scan.next();
		for(int j=0;j<n;j++) {
			if(s.charAt(j)!='.') {
				let = (int) s.charAt(j)-65;
				x = let%4;
				y = let/4;
				scatter+=Math.abs(x-j)+Math.abs(y-i);
			}
		}
	}
	System.out.println(scatter);
}
}
