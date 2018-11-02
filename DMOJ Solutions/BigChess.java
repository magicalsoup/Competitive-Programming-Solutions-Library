import java.util.*;
public class BigChess {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		for(int i = 0; i < h; i++) {
			boolean even = false;
			if(i % 2 == 0)
				even = true;
			for(int j = 0; j < w; j++) {
				if(even) {
					if(j%2 == 0) System.out.print(0);
					else System.out.print(1);
				}
				else {
					if(j%2 != 0) System.out.print(0);
					else System.out.print(1);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
