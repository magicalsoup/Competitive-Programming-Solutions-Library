import java.util.*;
public class BirthdayChocolate {
	
    static int solve(int[] s, int d, int m) {
    	int cnt = 0;
    	int sum = 0;
    	   if(m <= s.length) 
               for(int i = 0; i < m; i++)
                   sum += s[i];
           if(sum == d) cnt++;
           
    	for(int i=0;i<s.length-m;i++) {
    		 sum = sum - s[i] + s[i+m];
    		 if(sum==d)
    			cnt++;
    	}
    	return cnt;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for(int i=0;i<n;i++)
			s[i] = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(solve(s,d,m));
		sc.close();
	}
}
