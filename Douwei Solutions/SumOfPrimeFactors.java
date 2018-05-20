package Douwei;
import java.util.Scanner;
public class SumOfPrimeFactors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
for(;;) {
int number=sc.nextInt();
int count =0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
            	count+=i;
                number = number / i;
            }
        }
 System.out.println(count);
    }
}
}