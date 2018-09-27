package Implementations;
import java.util.*;
public class RepeatedString {
	
    static long repeatedString(String s, long n) {
    	long ans = 0;
    	long factor = n / s.length();
    	long rem = n % s.length();
    	for(int i = 0; i < s.length(); i++) 
    		ans += s.charAt(i) == 'a' ? 1 : 0;
  
    	ans = factor * ans;
    	for(int i = 0; i < rem; i++)
    		ans += s.charAt(i) == 'a' ? 1 : 0;
    	return ans;
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	long n = sc.nextLong();
    	System.out.println(repeatedString(s,n));
    	sc.close();
    }
}
