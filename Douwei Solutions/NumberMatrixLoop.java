package Douwei;
import java.util.*;
public class NumberMatrixLoop {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				 if (num < 10) {
					if(j==n)
						System.out.print(" " + num);
					else
						System.out.print(" " + num +" ");
				 }
				else {
					if(j==n)
						System.out.print(num);
					else
						System.out.print(num + " ");
				}
				num++;
			}
			System.out.println();
				
		}
		sc.close();
	}
}
