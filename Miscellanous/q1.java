import java.util.Arrays;
import java.util.Scanner;
public class q1 {
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int arr[] = new int [n];
for(int i =0;i<n;i++) {
	arr[i] = scan.nextInt();
}
Arrays.sort(arr);
	

double median;
if (n % 2 == 0) {
    median = ((double)arr[n/2] + (double)arr[n/2 - 1])/2;
}
else {
    median = (double) arr[n/2];
}
System.out.println("The median on the test is "+median+".");


}
}
