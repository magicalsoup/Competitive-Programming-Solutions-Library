package Douwei;
	import java.util.*;
	public class TwoDimensionArrayPractice2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int row  = sc.nextInt();
		int column = sc.nextInt();
		double arr[][] = new double[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		int command = sc.nextInt();
		if(command==0)
		rows(arr,row,column);
		else
		column(arr,row,column);
		
	}
	public static void rows(double arr[][],int row, int column) {
		for(int i=0;i<row;i++) {
			double sum =0;
			for(int j=0;j<column;j++) {
				sum+=arr[i][j];
			}
			String str = String.valueOf(sum);
			boolean isdouble = false;
			for(int x=0;x<str.length()-1;x++) {
				char c = str.charAt(x);
				char d = str.charAt(x+1);
				if(c=='.'&&d!='0') {
					isdouble = true;
					break;
				}
			}
			if(isdouble) {
			System.out.print(str+" ");
			isdouble = false;
			}
			else
				System.out.print(String.format("%.0f", sum)+" ");
		}
		}	
	public static void column(double arr[][],int row, int column) {
		for(int i=0;i<column;i++) {
			double sum =0;
			for(int j=0;j<row;j++) {
				sum+=arr[j][i];
			}
			String str = String.valueOf(sum);
			boolean isdouble = false;
			for(int x=0;x<str.length()-1;x++) {
				char c = str.charAt(x);
				char d = str.charAt(x+1);
				if(c=='.'&&d!='0') {
					isdouble = true;
					break;
				}
			}
			if(isdouble) {
			System.out.print(str+" ");
			isdouble = false;
			}
			else
				System.out.print(String.format("%.0f",sum)+" ");
		}
	}
	}
