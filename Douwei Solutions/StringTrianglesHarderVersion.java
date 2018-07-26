package Douwei;
import java.util.*;
public class StringTrianglesHarderVersion {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String direction = sc.next();
		int len = str.length()/2;
		 if(direction.equals("U")) {
	    	  for(int i=0;i<=len;i++) {
	        	  String space = "";
	    		  for(int j=i;j<len;j++)
	    			  space+=" ";
	    			  System.out.println(space+str.substring(len-i,len+i+1));
	    	  }
		 }
   	  	if(direction.equals("D")) {
   	  		for(int i=0;i<=len;i++) {
   			  String space = "";
   			  for(int j=0;j<i;j++)
   				  space+=" ";
   			  System.out.println(space+str.substring(i,str.length()-i));
   	  		}
   	  	}
		sc.close();
	}
}
