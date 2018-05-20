package Douwei;
import java.util.*;
public class HowManyBitsAre1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	long value = sc.nextInt();
	long cnt =0;
	for(long i=0;i<64;i++) {
		if(Set(value,i))
			cnt++;
	}
	 System.out.println(cnt);
}
public static boolean Set(long n, long k)
{
if ((n & (1 << (k-1))) >= 1)
return true;
else
	return false;
}
}
