import java.util.*;
public class ccc01s2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a=  sc.nextInt(),b = sc.nextInt(),diff= b-a,rows=1,columns = 1,num =0;
	for(int i=1;;i++) {
		num+=i;
		if(diff>=num) {
			rows++;
		}
		else {
			break;
		}
		num+=i;
		if(diff>=num) {
			columns++;
		}
		else {
			break;
		}
	}
	int [][]arr = new int[rows][columns];
	int m = (int)Math.ceil((double)rows/2.0)-1,n = (int)Math.ceil((double)columns/2.0)-1;
	arr[m][n] = a;
	num = 0;
	for(int i=a;i<b;) {
		num++;
		for(int ii=1;ii<=num&&i<b;ii++) {
			m++;
			i++;
			arr[m][n] = i;
		}
		for(int ii=1;ii<=num&&i<b;ii++) {
			n++;
			i++;
			arr[m][n] = i;
		}
		num++;
		for(int ii=1;ii<=num&&i<b;ii++) {
			m--;
			i++;
			arr[m][n] = i;
		}
		for(int ii=1;ii<=num&&i<b;ii++) {
			n--;
			i++;
			arr[m][n] = i;
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			if(arr[i][j]==0) {
				System.out.print("   ");
			}
			else if(arr[i][j]<10) {
				System.out.print(" "+arr[i][j]+" ");
			}
			else {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
}
}
