import java.util.Arrays;
import java.util.Scanner;
public class ccc97s1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int temp =0;
	while(temp<a) {
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d =scan.nextInt();
	String arr2[] = new String[b];
	String arr3[] = new String[c];
	String arr4[] = new String[d];
	scan.nextLine();
	for(int i=0;i<b;i++) {
		arr2[i] = scan.nextLine();
	}
	for(int i=0;i<c;i++) {
		arr3[i] = scan.nextLine();
	}
	for(int i=0;i<d;i++) {
		arr4[i] = scan.nextLine();
	}
	//Arrays.sort(arr2);
	//Arrays.sort(arr3);
	//Arrays.sort(arr4);
		for(int j=0;j<b;j++) {
			for(int k=0;k<c;k++) {
				for(int s =0;s<d;s++) {
					System.out.println(arr2[j]+" "+arr3[k]+" "+arr4[s]+".");
			}
		}
	}
		temp++;
	}
	}
}
