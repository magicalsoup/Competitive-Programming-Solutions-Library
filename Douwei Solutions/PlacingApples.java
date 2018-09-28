package Douwei;
import java.util.*;
public class PlacingApples {
	static int ways = 0;
	public static void main(String[]args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    for (int i = 0; i < a; i++) {
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        ways=0;
	        place(b,c,0);
	        System.out.println(ways);
	    }
	}
	public static void place(int apple, int basket, int min) {
	    if (basket == 1) {
	        if (apple >= min) {
	            ways++;
	        }
	        return;
	    }
	    for(int i=min;i<=apple-(basket-1)*min;i++){
	        place(apple-i,basket-1,i);
	    }
	}
}
