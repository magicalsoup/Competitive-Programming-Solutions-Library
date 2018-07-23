import java.util.*;
public class BeautifulDaysAtTheMovies {
	
	static int reverse(int num) {
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		return Integer.parseInt(sb.reverse().toString());
	}
    static int beautifulDays(int i, int j, int k) {
    	int b = 0;
    	for(int day = i;day<=j;day++) {
    		if((day-reverse(day))%k==0)
    			b++;
    	}
    	return b;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(beautifulDays(i,j,k));
		sc.close();
	}
}
