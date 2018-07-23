import java.util.*;
public class DiagonalDifference {
	  
	static int diagonalDifference(int[][] arr) {
		int diagonalA = 0;
		int diagonalB = 0;
		for(int i=0, j = arr.length-1;i<arr.length&&j>=0;i++,j--) {
			diagonalA += arr[i][i];
			diagonalB +=arr[j][i];
		}
		return Math.abs(diagonalA-diagonalB);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] m = new int[a][a];
		for(int i=0;i<a;i++)
			for(int j=0;j<a;j++)
				m[i][j] = sc.nextInt();
		System.out.println(diagonalDifference(m));
		sc.close();
	}
}