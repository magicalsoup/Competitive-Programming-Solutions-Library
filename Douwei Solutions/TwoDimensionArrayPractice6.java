package Douwei;
import java.util.*;
public class TwoDimensionArrayPractice6 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[][] = new int[a][a];
	for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	int grid[][] = new int[a][a];
	for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
			if(i==0||j==0||j==a-1||i==a-1||(i==a/2&&j==a/2)) {
				grid[i][j] = arr[i][j];
			}
		}
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
		if(grid[i][j]!=0) {
			if(j!=a-1)
			System.out.print(grid[i][j]+" ");
		else
			System.out.print(grid[i][j]);
		}
		if(grid[i][j]==0)
			System.out.print("  ");
		}
		System.out.println();
		}
}
}
