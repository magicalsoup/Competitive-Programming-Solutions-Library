package Douwei;
import java.util.*;
public class NumberOfFactors{
    static long  gcd(Long a, Long b)
    {
        if (a == 0) 
            return b;
         
        return gcd(b%a,a);
    }
    static long commDiv(Long a,Long b)
    {
        long n = gcd(a, b);
        int result = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
            	//System.out.println(i);
                if (n/i == i)
                    result += 1;
               else
                    result += 2;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        System.out.println(commDiv(a, b));
    }
}