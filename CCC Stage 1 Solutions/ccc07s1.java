import java.util.Scanner;

public class ccc07s1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[] = new int[t];
		int arr2[] = new int[t];
		int arr3[] = new int[t];
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
			arr3[i] = scan.nextInt();
			}
		for(int j=0;j<t;j++) {
			if(arr[j]<2007-18||(2007-18==arr[j]&&(arr2[j]==2&&arr3[j]<=27))||arr2[j]<2&&arr3[j]<31) {
				System.out.println("Yes");
			}
			else {
					System.out.println("No");
				}
				}
		}
}

