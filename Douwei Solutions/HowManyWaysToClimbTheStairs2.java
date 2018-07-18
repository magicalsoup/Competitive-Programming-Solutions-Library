package Douwei;
import java.util.*;
public class HowManyWaysToClimbTheStairs2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		str = str.replace("[", "").replace("]", "").replace(",","");
		String s[] = str.split(" ");
		int nums[] = new int[s.length];
		
		for(int i=0;i<s.length;i++) 
			nums[i] = Integer.parseInt(s[i]);

		System.out.println(solve(num,nums));
		sc.close();
	}
	public static int solve(int n) {
		int dp[] = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=n;i++) {
			dp[i] =  dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	public static long solve(int n,int x[]) {
		long dp[] = new long[n+1];
		dp[0] = 1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<x.length;j++) {
				if(i-x[j]>=0)
					dp[i] = dp[i]+dp[i-x[j]];
			}
		}
		return dp[n];
	}
}
/*
			The Problem
			There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, 
			write a function that returns the number of unique ways you can climb the staircase. 
			The order of the steps matters.

			For example, if N is 4, then there are 5 unique ways:

			1, 1, 1, 1
			2, 1, 1
			1, 2, 1
			1, 1, 2
			2, 2
			What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of 
			positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. 
			Generalize your function to take in X.
 */
