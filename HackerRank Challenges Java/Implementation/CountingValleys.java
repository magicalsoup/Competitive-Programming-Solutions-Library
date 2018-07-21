import java.util.*;
public class CountingValleys {
	
    static int countingValleys(int n, String s) {
    	boolean down = false;
    	int cnt = 0;
    	int lv = 0;
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		if(c=='D')
    			lv--;
    		if(c=='U')
    			lv++;	
    		if(lv<0)
    			down = true;
    		if(lv>=0&&down) {
    			down = false;
    			cnt++;
    		}
    	}
    	return cnt;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countingValleys(sc.nextInt(),sc.next()));
		sc.close();
	}
}
