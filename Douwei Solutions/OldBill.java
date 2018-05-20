package Douwei;
import java.util.Scanner;
public class OldBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String x = sc.next();
      String y = sc.next();
      String z = sc.next();
      int max =0;
      String a1 = "";
      String a2 = "";
      String arr[] = {"9","8","7","6","5","4","3","2","1","0"};
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    	  String res = arr[i]+x+y+z+arr[j];
    	  int t = Integer.parseInt(res);
    	  if(t%n==0) {
    		  if(t>max) {
    			  max = t;
    		   a1 = arr[i];
    		   a2 = arr[j];
    		  }
    	  }
      }
      }
      System.out.print(a1+" ");
      System.out.print(a2+" ");
      System.out.print(max/n);
    }
     
}