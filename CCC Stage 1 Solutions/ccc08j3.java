import java.util.*;
public class ccc08j3{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	int newr = 0,newc = 0, movements =0;	
	int r =1,c=1;
	for(int i=0;i<s.length();i++) {
		char letter = s.charAt(i);
		if(letter>='A'&&letter<='Z') {
			int x = (int)letter - (int)'A'+1;
			 newr =(x-1)/6+1;
			 newc = (x-1)%6+1;	
		}
		else if(letter==' ') {
			newr = 5;
			newc = 3;
		}
		else if(letter=='-'){
			newr = 5;
			newc = 4;
		}
		else if(letter=='.') {
			newr =5;
			newc =5;
		}
		movements = movements+ Math.abs(newr-r)+Math.abs(newc-c);
		r = newr;
		c = newc;
	}
	movements = movements+Math.abs(newr-5)+Math.abs(newc-6);
	System.out.println(movements);
}
}
