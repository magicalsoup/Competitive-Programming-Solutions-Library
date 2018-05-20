package Douwei;
import java.util.Scanner;
public class MatrixMultiplication {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
	   	int a1[][] = new int[n][n];
	   	int a2[][] = new int[n][n];
	   	int result[][] = new int[n][n];
	   	for(int i=0;i<n;i++) {
	   		for(int j=0;j<n;j++) {
	   			a1[i][j] = sc.nextInt(); 
	   		}
	   	}
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            a2[i][j] = sc.nextInt();
	        }
	    }
	    for (int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            int sum = 0;
	            for(int k = 0; k < n; k++) {
	                sum += a1[i][k] * a2[k][j];
	            }
	            result[i][j] = sum;
	        }
	    }

	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	        		System.out.print(result[i][j]+((j==n-1)?"":" "));
	        }
	        System.out.println();
	        }
   }
}
