import java.util.Arrays;
import java.util.Scanner;
public class ccc13j4{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();// total minutes
			int t = scan.nextInt();
			int arr[] = new int[t];
			int temp =0;
			int count =0;
			for(int i=0;i<t;i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			for(int j=0;j<t;j++) {
				temp = temp +arr[j];
				count++;
				if(temp>n) {
					System.out.println(count-1);
					break;
				}
				}
			}
	

	}


