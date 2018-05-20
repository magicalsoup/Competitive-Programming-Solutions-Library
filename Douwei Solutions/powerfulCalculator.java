package Douwei;
import java.math.BigInteger;
import java.util.*;
public class powerfulCalculator {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	BigInteger bi = sc.nextBigInteger();
	BigInteger bi1 = sc.nextBigInteger();
	BigInteger ans;
	BigInteger ans2;
	BigInteger ans3;
	ans = bi.add(bi1);
	System.out.println(ans);
	ans2 = bi.subtract(bi1);
	System.out.println(ans2);
	ans3 = bi.multiply(bi1);
	System.out.println(ans3);
	
}
}
