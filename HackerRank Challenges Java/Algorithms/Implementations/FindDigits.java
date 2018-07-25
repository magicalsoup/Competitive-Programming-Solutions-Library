import java.util.*;
public class FindDigits {
	
    static int findDigits(int n) {
    	String str = String.valueOf(n);
    	int cnt = 0;
    	for(int i=0;i<str.length();i++) {
    		int digit = Integer.parseInt(str.charAt(i)+"");
    		if(digit!=0&&n%digit==0)
    			cnt++;
    	}
    	return cnt;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int num = sc.nextInt();
			System.out.println(findDigits(num));
		}
		sc.close();
		
	}
}
