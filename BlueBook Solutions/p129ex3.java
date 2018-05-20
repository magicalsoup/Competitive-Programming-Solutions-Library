import java.util.Scanner;

public class p129ex3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		 Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t;
		for(t=0; t< n; t ++) {
			if (Math.pow(2 ,t) >= n ){
				
				System.out.println(t);
				System.exit(0);
				
}
}
}
}
