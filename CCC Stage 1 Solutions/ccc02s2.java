import java.util.Scanner;

public class ccc02s2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    		  int a = scan.nextInt();
    		  int b = scan.nextInt();
    		  if(a==0) {
    	    		System.out.println("0");
    	    		System.exit(0);
    	      }
    		  
    		  /*
    		  if(a%b==0) {
    			  int a1 = a/b;
    			  System.out.println(a1);
    			  System.exit(0);
    		  }
    		  */
    		  
    		  int r1,tempr2,r2,r3;
    		  r1 = a/b;
    		  tempr2 = a%b;
    		  if (tempr2 == 0) {
    			  System.out.println(r1);
    		  }else {
    			  
    			  for (int j=2; j<b; j++) {
    				if ((b % j == 0) && (tempr2 % j) == 0) {
    					tempr2 = tempr2 / j;
    					b = b /j;
    				}//end of if
    			  }//end of for
    			  r2 = tempr2;
    			  r3 = b;
    			  /*
    			  if ( b % tempr2 == 0) {
    				  r2 = 1;
    				  r3 = b / tempr2;
    			  }else {
    				  r2 = tempr2;
    				  r3 = b;
    			  }
    			  */
    			  if (r1 == 0 ) {
    				  System.out.println(r2 + "/" + r3);
    			  }else {
    				  System.out.println(r1 + " " + r2 + "/" + r3);
    			  }
    			  
    		  }//end of if
    		  
    /*		  
    for(int x=0;x<100000000;x++) {
    	for(int y= 0; y<10;y++) {
    if((x*b)+y ==a) {
    	if(b%y==0) {
			b=b/y;
			y = y/y;
		}
    	
    	if ( y> b) {
    		x = x+1;
    		y = y -b;		
    		
    		System.exit(0);
    	}
    	System.out.println(x+" "+y+"/"+b);
    }
    
    	
    	}
    }
    */
    }//end of main
    
    
}//end of class
