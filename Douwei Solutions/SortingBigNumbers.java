package Douwei;
import java.math.*;
import java.util.*;
public class SortingBigNumbers{
public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
   for(int k = 0; k < 10; k++) {
    int a = scan.nextInt();
    BigInteger arr[] = new BigInteger[a];
    for(int i = 0; i < a; i++) {
        arr[i]= scan.nextBigInteger();
    }
    Arrays.sort(arr);
    BigInteger one,two,three;
    one = new BigInteger("1");
    two = new BigInteger("2");
    three = new BigInteger("3");
    for(int i = 0; i < a; i++) {
        if(arr[i].compareTo(one) == 0||arr[i].compareTo(two)==0||arr[i].compareTo(three)==0) {
            System.out.println(arr[i]+" ");
        }
        else {
        System.out.println(arr[i]);
        }
        }
   }
}
}