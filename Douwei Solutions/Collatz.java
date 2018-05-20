package Douwei;
 

import java.util.Scanner;

public class Collatz {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int i;

    for ( i = 0 ; i< 10000; i++) {
    	if ( a == 1) {
 	       System.out.println(i);
            break;
    	}
		if ( a% 2 == 0) {
		    a= a  / 2;
		}else {
			a =a * 3 + 1;
		}
	
       
       }
     }	
}
  


