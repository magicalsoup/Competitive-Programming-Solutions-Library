import java.util.Scanner;
public class p140ex3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
 String s = scan.nextLine();
 String arr[] = s.split("");
 for(int i=arr.length-1;i>=0;i--) {
	 System.out.println(arr[i]);
 }

}
}
