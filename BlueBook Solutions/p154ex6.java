import java.util.Scanner;
public class p154ex6{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);


	double p = scan.nextDouble();// percentage increase
	long a = scan.nextLong();//population
	int y = scan.nextInt();//year
	long b = scan.nextLong();// future population
    double t;// new pop
    t = a;
    
    long i;
	for(  i = y;i<1000000000;i++) {
		
	    t = t + (t*p / 100.00);	
	    //y = y + 1;
	    if (t >= b) {
	    	//y = y + 1;
	    	break;
		}
	}
	System.out.println(i+1);	
	
	}
	
	
	
	
}
