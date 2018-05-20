import java.util.Scanner;
public class ccc11s2{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		int t =a;
		String arr[] = new String[a];
		String arr2[] = new String[t];
		for(int i =0;i<a;i++) {
			arr[i] = scan.nextLine();
		}
		for(int j =0;j<a;j++) {
		arr2[j] = scan.nextLine();	
		}
int count =0;		
for(int i=0;i<a;i++) {
	if(arr[i].equals(arr2[i])) {
		count++;
	}
}
	System.out.println(count);
	}
}
