package Douwei;
import java.util.Scanner;
public class HowHighABallBounceBack
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int t = sc.nextInt();
    	double a = n;
    	double sum = n;
    	double sum2 = 0;
for(int i=0;i<t;i++) {
	a = a/2;
	if(i==t-1) {
		sum2 = sum;
	}
	sum = sum+a*2;
}
System.out.println(String.format("%.2f", sum2)+" "+String.format("%.2f", a));
    }
}