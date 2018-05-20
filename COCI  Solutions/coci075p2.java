import java.util.Scanner;
public class coci075p2 {
	 public static void main(String[]args){
		 @SuppressWarnings("resource")
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int best = n;
	        for (int i = 2; i * i <= n; i++)
	        	if (n % i == 0) {
	        		best = i;
	        		break;
	        	}

	       System.out.println(n-(n/best));
	}
}
