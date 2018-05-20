import java.util.Scanner;
public class ccc10j1{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int  n =scan.nextInt();
	int count =0;
	for(int a=0;a<=5;a++) {
		for(int b=0;b<=5;b++) {
			if(a+b==n) {
				if(a==b) {
					count= count+1;
				}
				count++;
			}
		}
	}
	System.out.println(count/2);
		}
		}

