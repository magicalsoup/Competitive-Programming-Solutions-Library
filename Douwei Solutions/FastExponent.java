package Douwei;
import java.util.*;
public class FastExponent {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=0;i<a;i++) {
		long t = sc.nextLong();
		if(isPowerOfTwo(t))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
static boolean isPowerOfTwo(long n)
{
    if (n == 0)
        return false;
     
    while (n != 1)
    {
        if (n % 2 != 0)
            return false;
        n = n / 2;
    }
    return true;
}
}
