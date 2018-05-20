package Douwei;
import java.util.*;
public class BasicMathCalculations {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int arr[] = new int[a];
	for(int i = 0; i < a; i++) {
		arr[i] = scan.nextInt();
	}
	int b = scan.nextInt();
	for(int i = 0; i < b; i++) {
		String c = scan.next();
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int e = 0;
		if(c.equals("ADD")) {
			for(int j = p1; j <= p2; j++) {
				e = e + arr[j];
			}
			System.out.println(e);
		}
		else if(c.equals("MAX")) {
			int arr2[] = new int[p2-p1+1];
			for(int j = p1; j <= p2; j++) {
				arr2[j-p1] = arr[j];
			}
			Arrays.sort(arr2);
			System.out.println(arr2[arr2.length-1]);
		}
		else if(c.equals("MIN")) {
			int arr2[] = new int[p2-p1+1];
			for(int j = p1; j <= p2; j++) {
				arr2[j-p1] = arr[j];
			}
			Arrays.sort(arr2);
			System.out.println(arr2[0]);
		}
		else if(c.equals("AVG")) {
			double f = p2 - p1 + 1;
			for(int j = p1; j <= p2; j++) {
				e = e + arr[j];
			}
			double g = e/f;
			System.out.println(g);
		}
		else if(c.equals("DIF")) {
			int arr2[] = new int[p2-p1+1];
			for(int j = p1; j <= p2; j++) {
				arr2[j-p1] = arr[j];
			}
			Arrays.sort(arr2);
			System.out.println(arr2[arr2.length-1]-arr2[0]);
		}
	}

	}
}
