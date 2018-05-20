import java.util.Scanner;
public class a3 {
	public static void main (String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t;
		int k;
		t = scan.nextInt();
	    for (int i = 0 ; i< t ;i++) {
	    	k = scan.nextInt();
	    	for ( int n = k+1;k <Math.pow(2,63); n++) {
	    		long h = n%1000;
	    	if( (h*h*h)%1000 == 888) {
	    		System.out.println(n);
	    		break;
	    	}		  
	    	}
	    }
	}
}
