package Douwei;
import java.util.*;
 
public class FindTheSumAgain {
    public static boolean su(int[] A, int sum) {
        boolean[][] solution = new boolean[A.length + 1][sum + 1];
        for (int i = 1; i <= sum; i++) {
            solution[0][i] = false;
        }
        for (int i = 0; i <= A.length; i++) {
            solution[i][0] = true;
        }
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= sum; j++) {
                solution[i][j] = solution[i - 1][j];
                if (solution[i][j] == false && j >= A[i - 1])
                    solution[i][j] = solution[i][j] || solution[i - 1][j - A[i - 1]];
            }
        }
        return solution[A.length][sum];
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        int target = input.nextInt();
        int arr[] = new int[tc];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        if (su(arr, target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}/*
other ppl's method:
import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
 
        if (build(data, tar)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
    }
 
    public static boolean build(int[] input, int target) {
        boolean[][] dp = new boolean[input.length + 1][target + 1];
 
        for (int i = 0; i < input.length + 1; i++) {
            dp[i][0] = true;
        }
 
        for (int length = 1; length < dp.length; length++) {
            for (int sum = 1; sum < dp[length].length; sum++) {
                dp[length][sum] = dp[length - 1][sum];
 
                if (sum >= input[length - 1]) {
                    dp[length][sum] = dp[length][sum] || dp[length - 1][sum - input[length - 1]];
                }
 
            }
        }
 
        return dp[input.length][target];
    }
 
}
*/