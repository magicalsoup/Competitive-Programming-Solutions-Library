package Douwei;
import java.util.Scanner;
public class OutputTheGraph {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[][] = new int[a][a];
	int count =1;
	while(count<=a) {
	for(int i=count-1;i<a;i++) {
		for(int j=count-1;j<count;j++) {
			arr[i][j] = count;
		}
	}
	for(int i=count-1;i<count;i++) {
		for(int j=count-1;j<a;j++) {
			arr[i][j] = count;
		}
	}
	count++;
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
			if(j!=a-1)
		System.out.print(arr[i][j]+" ");	
			else
				System.out.print(arr[i][j]);
		}
		System.out.println();
		}
}
}
