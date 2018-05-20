
import java.util.Scanner;

public class p124ex5{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String strDouble;
		int t = scan.nextInt();
		double arr[] = new double[t];
		int arrs[] = new int[t];
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextDouble();
			arrs[i] =scan.nextInt();
			strDouble = String.format("%.2f",Math.pow(arr[i], arrs[i]));
			System.out.println(strDouble);
		}
	



	}
}
