import java.util.*;
public class DivisibleSumPairs {
	
    static int divisibleSumPairs(int n, int k, int[] ar) {
    	int cnt = 0;
    	for(int i=0;i<n;i++) {
    		for(int j=i+1;j<n;j++) {
    			if((ar[i]+ar[j])%k==0) {
       				cnt++;
    			}
    		}
    	}
    	return cnt;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
			ar[i] = sc.nextInt();
		System.out.println(divisibleSumPairs(n,k,ar));
		sc.close();
	}
}
