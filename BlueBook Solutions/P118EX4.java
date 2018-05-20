import java.util.Scanner;
public class P118EX4 {
 public static void main(String[] args) {
	 @SuppressWarnings("resource")
	 Scanner scan = new Scanner (System.in);
	 int n =scan.nextInt();
	 for(int i =1; i<=n ; i++) {
		 int t = i* n;
		 System.out.println(n + "X" + i + "=" + t);
	 }
 }
}
