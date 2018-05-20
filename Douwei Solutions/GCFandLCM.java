package Douwei;
import java.util.*;
public class GCFandLCM {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int k=0;k<num;k++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long maxnum =0;
			long lcm =0;
			maxnum = gcd(a,b);
			lcm = LCM(a,b);
			System.out.println(maxnum+" "+lcm);
		}
		}
		public static long gcd(long a,long b)
		{
		if(b==0){ 
		return a;
		}
		return (gcd(b,a%b));
		}
		public static long LCM(long a, long b) {
			return (a * b) / gcd(a, b); 
			}
		}
