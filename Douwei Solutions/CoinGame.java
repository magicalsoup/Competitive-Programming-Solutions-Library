package Douwei;
import java.util.*;
public class CoinGame {
	static String[] name = new String[2];
	static boolean win;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		name[0] = sc.next();
		name[1] = sc.next();
		if (num % 3 == 0 )
			win = true;
		else 
			win = false;
		System.out.println(name[win? 1 : 0]);
		System.out.println(rec(num,false));
		sc.close();
	}
	static int rec (int n, boolean player) {
	    if ((n<=2) && player == win) return 1;
	    else if (n==4 && player == win) return 3;
	    else if (n <= 2 || n==4) return 0;
	    else if (n==3 && player == win) return 0;
	    else if (n==3) return 2;
	 
	    if (player==win && n%3==1) return rec(n-1, !player) + rec(n-4, !player);
	    else if (player == win) return rec(n-2, !player);
	    else return rec(n-1, !player) + rec(n-2, !player)+ rec(n-4, !player);
	}
}
