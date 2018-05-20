package Douwei;
import java.util.*;
public class ArrayPratice7 {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  String arr[]=new String[n];
	  for(int i=0;i<n;i++) {
	  arr[i]=scan.next();
	  }
	  int space =0;
	  for(int i=n-1;i>=0;i--) {
	  int counter = 0;
	  for(int j=0;j<arr[i].length();j++) {
	  if(arr[i].charAt(j)=='0')
	  counter++;
	  }
	  if(counter==1)
	  System.out.print(arr[i]+" ");
	  }
}
}
