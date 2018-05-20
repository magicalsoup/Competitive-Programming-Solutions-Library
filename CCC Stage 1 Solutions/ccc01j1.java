import java.util.Scanner;
public class ccc01j1{
	public static void main(String[]args) {
   Scanner scan = new Scanner(System.in);
   int height = scan.nextInt();
    int i=0, j=0 ;
    for ( i=1;i<=height;i=i+2 ) {
      for ( j=0;j<i;j++ ) {
    	  System.out.print("*");
      }
      for ( j=2*i;j<2*height;j++ ) {
    	  System.out.print(" ");
      }
      for ( j=0;j<i;j++ ) {
    	  System.out.print("*");
      }
      System.out.println();
    }
    for ( i=height-2;i>0;i=i-2 ){
      for ( j=0;j<i;j++ ) {
    	  System.out.print("*");
      }
      for ( j=2*i;j<2*height;j++ ){
    	  System.out.print(" ");
      }
      for ( j=0;j<i;j++ ) {
    	  System.out.print("*");
      }
      System.out.println();
    }
    System.exit(0);
  }
}