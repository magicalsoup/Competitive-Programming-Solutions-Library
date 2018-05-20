import java.util.Arrays;
import java.util.Scanner;
public class coci074p2{
	    public static void main(String[]args){
	    	@SuppressWarnings("resource")
	        Scanner scan = new Scanner(System.in);
	     int a = scan.nextInt();
	     String s1 = String.valueOf(a);
	    char[] c1 = s1.toCharArray();
	    Arrays.sort(c1);
	     for(int i=a+1;i<999999;i++){
	         String s2 = String.valueOf(i);
	         char[] c2 = s2.toCharArray();
	        Arrays.sort(c2);
	         if(Arrays.equals(c1,c2)){
	             System.out.println(i);
	             System.exit(0);
	         }
	         }
	     System.out.println("0");
	    }
	}
