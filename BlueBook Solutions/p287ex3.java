import java.util.Scanner;
public class p287ex3 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		double arr[] = new double[t];
		for(int i=0;i<t;i++)
			arr[i] = scan.nextDouble();
		double temp = 0;
		int N = arr.length;
		if(t < 10000) {
			for(double i=0;i<t;i++)
			{
			 for (int j = 1; j <(N-i) ;j++) {
				 if (arr [ j-1] >arr[j]) {
					 //swap elements
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j] = temp;
					
				
			 }
			}
		}
		for(int i=0;i<1;i++)
			arr[i] = Math.round(arr[i]*100.0)/100.0;
			}
		for(int i=0;i<1;i++) {
			System.out.println(arr[i]);
		}
}
}
