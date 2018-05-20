package Douwei;
import java.util.Scanner;
public class OutputPattern2 {
	static int a[][];
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	int m[][] = new int[t][t];
	Zig_Zag(t);
	for(int i=0;i<t;i++) {
		int idxj = t-1;
		for(int j=t-1;j>=0;j--) {
			m[i][j] = a[idxj][i];
			idxj--;
		}
	}
	print(m);
}
static void print(int[][]arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++ ) {
			if(j!=arr.length-1) {
			if(arr[i][j]<=9)
			System.out.print(arr[i][j]+"  ");
			else
			System.out.print(arr[i][j]+" ");
			}
			else
				System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
public static void Zig_Zag(int size) {
    a = new int[size][size];
    int n = 1;
    for (int r = size, c = 0; r >= 0; --r)
        for (int i = r, j = c; i < size; ++i, ++j)
            a[i][j] = n++;
    for (int r = 0, c = 1; c < size; ++c)
        for (int i = r, j = c; j < size; ++i, ++j)
            a[i][j] = n++;
}
}

