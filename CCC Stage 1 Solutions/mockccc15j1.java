
import java.util.Scanner;

public class mockccc15j1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();

		String len = String.valueOf(b);

		int length = String.valueOf(b).length();
		for(int i = 0;i<1000;) {
		    if((a).equals("416")&& (length == 7)) {
		    	System.out.println("valuable");
		    	break;
				}
		    if((a).equals("647") || (a).equals("437")&&length == 7){
	    		System.out.println("valueless");
	    		break;
	    	}
		    
				else {
					System.out.println("invalid");
					break;
				}
		    
		    
		    	
		
	}
		    	
			
	}
}

