package Douwei;
import java.util.*;
public class StringTriangles {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	  	  String str = sc.next();
	  	  String temp = "";
	  	  String op = sc.next();
	  	  if(op.equals("U"))
		   	  for(int i=0;i<str.length();i++) {
		    		  System.out.println(str.substring(str.length()-i-1,str.length()));
		   	  }
	  	  else
		    while(str.length()!=0) {
		   		  System.out.println(temp+str);
		   		  str = str.substring(1);
		   		  temp+=" ";
	   	  	}
		sc.close();
	}
}
