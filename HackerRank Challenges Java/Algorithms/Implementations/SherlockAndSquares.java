import java.util.*;
public class SherlockAndSquares {
    static int squares(int a, int b) {
    	return (int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
    }

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(squares(a,b));
		}
		sc.close();
	}
}
