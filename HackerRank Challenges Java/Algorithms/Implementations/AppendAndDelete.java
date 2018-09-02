package Implementations;
import java.util.*;
public class AppendAndDelete {
	
    static String appendAndDelete(String s, String t, int k) {
    	if(s.length()+t.length()<=k)
    		return "Yes";
    	int i = 0;
    	for(;i<Math.min(s.length(), t.length());i++) {
    		if(s.charAt(i)!=t.charAt(i))
    			break;
    	}
    	int min = (s.length()-i)+(t.length()-i);
    	return k>=min&&(k-min)%2==0?"Yes":"No";
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	String t = sc.next();
    	int k = sc.nextInt();
    	System.out.println(appendAndDelete(s, t, k));
    	sc.close();
    }
}
