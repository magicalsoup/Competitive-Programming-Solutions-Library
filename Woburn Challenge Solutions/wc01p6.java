import java.util.*;
public class wc01p6{
    // Function to count the numbers divisible by
    // M in a given range
    static long countDivisibles(long A, long B, long M)
    {
        // Add 1 explicitly as A is divisible by M
        if (A % M == 0)
            return (B / M) - (A / M) + 1;
 
        // A is not divisible by M
        return (B / M) - (A / M);
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
    // driver program
    public static void main(String[] args)
    {
    	@SuppressWarnings("resource")
    	Scanner sc = new Scanner(System.in);
        // A and B define the range, M is the dividend
    	int a=  sc.nextInt();
    for(int i=0;i<a;i++) {
        long B = sc.nextLong(), M = sc.nextLong(), x = sc.nextLong();
        // Printing the result
        long ans = countDivisibles(1,B,M);
        long ans2 = countDivisibles(1,B,x);
        long count =countDivisibles(1,B,LCM(M,x));
        System.out.println(ans+ans2-count);
    }
    }
}
