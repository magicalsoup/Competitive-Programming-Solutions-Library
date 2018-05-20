import java.util.Scanner;
import java.text.DecimalFormat;
public class P124EX3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.00");
		
		double n = scan.nextDouble();
		double m = scan.nextDouble();
		int y = scan.nextInt();
		double arr[] = new double[y+1];
		
		arr[0] = n; 
		 if(n == 0) {
			 System.out.println(0 + " " + "0.00");
		 }else {
			 System.out.println(0 + " " + format.format(arr[0]));
		 }
		 
		
		
		for(int i = 1; i<=y;i++) {
			 arr[i] = arr[i-1] + (m/100 * arr[i-1]);
			 
			 if(arr[i] == 0) {
				 System.out.println(i + " " + "0.00");
				 
			 }else{
				 System.out.println(i + " " + format.format(arr[i]));
				 }
		}
	}
}
