import java.util.*;
public class coci096p3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for(int x = scan.nextInt();x>0;x--) {
			int a = Integer.parseInt(scan.next(),16);
			if(a<0x20)
				System.out.print(".");
			else
				System.out.print("-");
		}
	}
}
