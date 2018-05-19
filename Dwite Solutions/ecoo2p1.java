import java.util.*;
public class ecoo2p1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	    Scanner sc = new Scanner(System.in);
	    main : for(int x=0;x<5;x++){
	        int n = sc.nextInt();
	        int x1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int ocurr = countocurr(pad(n),x1);
	        for(int y=n+1;;y++){
	            if(y>999999)
	            y = 0;
	            if(countocurr(pad(y),x2)==ocurr){
	                System.out.print(pad(y)+" ");
	                System.out.println((y-n)<0?y-n+1000000:y-n);
	                continue main;
	            }
	        }
	    }
	    
	}
	public static String pad(int y){
	    StringBuilder s = new StringBuilder(Integer.toString(y));
	    while(s.length()!=6)
	    s.insert(0,0);
	    return s.toString();
	}
	public static int countocurr(String str,int x1){
	    int ocurr =0;
	    for(int x=0;x<str.length();x++)
	    if((int)str.charAt(x)-48==x1)
	    ocurr++;
	    return ocurr;
	}
}
