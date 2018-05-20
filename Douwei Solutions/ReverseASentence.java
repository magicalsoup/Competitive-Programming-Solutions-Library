package Douwei;
import java.util.*;
public class ReverseASentence {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String ans ="";
	int count =0;
	for(int i=s.length()-1;i>=0;i--) {
	char c = s.charAt(i);
	if(c!=' ') {
		count =0;
	}
	if(c!=' '||count==0) {
		ans = ans+c;
	}
	if(c==' ') {
		count++;
	}
	}
	String ans2 = "";
 for(int i= ans.length()-1;i>=0;i--) {
	 char d = ans.charAt(i);
	 ans2 = ans2+d;
 }
 String arr[] = ans2.split(" ");
 String ans3 = "";
 for(int i=arr.length-1;i>=0;i--) {
	 if(i!=0) 
	 ans3 = ans3+arr[i]+" ";
	 else
		 ans3 = ans3+arr[i];
 }
	System.out.println(ans3);
}
}
