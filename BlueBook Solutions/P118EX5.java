
import java.util.Arrays;
import java.util.Scanner;
public class P118EX5{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		double arr[] = new double[t];	
		double arrs[] = new double[t];
	
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextDouble();
			arrs[i] =arr[i];
		}
		Arrays.sort(arr);
		double count =arr[t-1];
		for(int i = 0;i<t;i++) {
			
			if(arrs[i]!=count) {
				double p=0;
				 p = Math.round(arrs[i]*100.0)/100.0;
				System.out.println(String.format("%.2f",p));
			}
			
		}
		double y = 0;
		 y = Math.round(arr[t-1]*100.0)/100.0;
			System.out.println(String.format("%.2f",y));
		
		}
	}
