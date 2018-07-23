import java.util.*;
public class SockMerchant {
	
    static int sockMerchant(int n, int[] ar) {
    	int cnt = 0;
    	for(int i=0;i<101;i++) {
    		if(ar[i]>1)
    		cnt+=(ar[i]/2);
    	}
    	return cnt;
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int ar[] = new int[101];
    	for(int i=0;i<n;i++)
    		ar[sc.nextInt()]++;
    	System.out.println(sockMerchant(n,ar));
    	sc.close();
    }   
}