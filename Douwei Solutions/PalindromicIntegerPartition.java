package Douwei;
import java.util.*;
public class PalindromicIntegerPartition {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(palindrome(n));
	
}
public static int palindrome(int n) {
	int ans = 1;
	for(int i=1;i*2<=n;i++) {
		ans  = ans+palindrome(n-2*i);
	}
	return ans;
}
}
