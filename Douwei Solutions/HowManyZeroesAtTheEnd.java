package Douwei;
import java.util.*;
public class HowManyZeroesAtTheEnd {
	static Scanner sc = new Scanner(System.in);
public static void main(String[]args) {
	//----Read Input----//
	int n = sc.nextInt();
	//------------------//
	int count =0; // initialize count
	if(n==0) { // if n is 0, then there is no zero bit
	System.out.println(0);
	System.exit(0); // exit out of program
	}
	while(true) {
		if(n%2!=0) // when n is not even, the bit will be one, break out of the while loop
			break;
		if(n%2==0) // if n is even, then the bit will be a zero
			count++;
		n/=2; // divide by 2 to discard the right most bit;
		
			}// end of while loop
	System.out.println(count); // print out the result - count
		}// end of main
	} //end of class
