import java.util.*;
import java.io.*;
public class mockccc14s1{
    public static void main (String [] args){
    	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String t= scan.nextLine();
	StringBuilder input = new StringBuilder();
	input.append(s);
	input = input.reverse();
	int n = t.length();
	s = input.toString();
	int count =0;
	for(int i=0;i<input.length()-n;i++) {
	String s1 = s.substring(i, i+n);
	if(s1.equals(t)) {
		count = i+1;
		break;
	}
	}
	if(count>0) {
	System.out.println((s.length()+1)-count);
	}
	else
		System.out.println(-1);
    }
}