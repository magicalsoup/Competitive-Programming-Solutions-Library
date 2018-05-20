import java.util.*;
public class DynamicProgramming1
{
	  static int MAX = 1000;
	    static int f[];
	     
	    // Returns n'th fibonacci number using 
	    // table f[]
	    public static int fib2(int n)
	    {
	        // Base cases
	        if (n == 0)
	            return 0;
	             
	        if (n == 1 || n == 2)
	            return (f[n] = 1);
	      
	        // If fib(n) is already computed
	        if (f[n] != 0)
	            return f[n];
	      
	        int k = (n & 1) == 1? (n + 1) / 2
	                            : n / 2;
	      
	        // Applyting above formula [Note value
	        // n&1 is 1 if n is odd, else 0.
	        f[n] = (n & 1) == 1? (fib(k) * fib(k) + 
	                        fib(k - 1) * fib(k - 1))
	                       : (2 * fib(k - 1) + fib(k)) 
	                       * fib(k);
	    return f[n];
	    }
	      
	       
   static int fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      
    public static void main (String args[])
    {
    	@SuppressWarnings("resource")
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
