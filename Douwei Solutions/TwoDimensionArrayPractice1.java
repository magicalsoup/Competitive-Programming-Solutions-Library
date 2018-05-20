package Douwei;
import java.util.*;
public class TwoDimensionArrayPractice1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	int c = sc.nextInt();
	double arr[][] = new double[r][c];
	double max =0;
	double min =Integer.MAX_VALUE;
	for(int i=0;i<r;i++ ) 
		for(int j=0;j<c;j++) {
	arr[i][j] = sc.nextDouble();
	if(arr[i][j]>max) {
		max = arr[i][j];
	}
	if(arr[i][j]<min) {
		min = arr[i][j];
	}
		}
	System.out.println(String.format("%.2f",max)+" "+String.format("%.2f", min));
}
}
