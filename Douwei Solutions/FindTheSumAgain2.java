package Douwei;
import java.util.*;
public class FindTheSumAgain2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	long fact =1;
	long sum =0;
	for(int j=1; j<=a; j++) {
	for(int i=1;i<=j;i++){    
	      fact=fact*i;    
	  }    
	sum = sum+fact;
	fact =1;
	}
	System.out.println(sum);
}
}
