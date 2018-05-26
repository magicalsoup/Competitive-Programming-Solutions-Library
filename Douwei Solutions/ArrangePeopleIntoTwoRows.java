package Douwei;
import java.util.*;
public class ArrangePeopleIntoTwoRows {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//----Read Input----//
		int n = sc.nextInt();
		int arr[] = new int[n*2];
		for(int i=0;i<n*2;i++)
			arr[i] = sc.nextInt();
		//-----------------//
		// we don't care about the array, using Catalan numbers, we only need n. The formula is 1/(n+1)*c(n*2 / n)
		System.out.println(solve(n));
	}
	public static long solve(int n) {
		return choose(2*n,n)/(n+1);
	}
	public static long choose(int n,int k) {
		return fact(n)/(fact(k)*fact(n-k));
	}
	public static int fact(int n) {
		int sum = 1;
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		return sum;
	}
}
