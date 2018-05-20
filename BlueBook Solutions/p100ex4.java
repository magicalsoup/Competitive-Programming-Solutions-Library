import java.util.Scanner;

public class p100ex4 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
    	Scanner scan = new Scanner(System.in);
    
    	String t = scan.nextLine();
    	
    	if ((t).equals("MG")) {
    		System.out.println("midget girls");
    	}
    	else if ((t).equals("MB")) {
    		System.out.println("midget boys");
    	}
    	else if((t).equals("JG")) {
    		System.out.println("junior girls");
    	}
    	else if((t).equals("JB")) {
    		System.out.println(" junior boys");
    	}
    	else if((t).equals("SB")) {
    		System.out.println("senior boys");
    	}
    	else if((t).equals("SG")) {
    		System.out.println("senior girls");
    	}
    	else {
    		System.out.print("invalid code");
    	}
    	
    	
    	
    	
   }
	}

