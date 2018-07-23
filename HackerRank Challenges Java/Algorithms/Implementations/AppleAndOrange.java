import java.util.*;
public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int asum = 0;
    	int bsum = 0;
    	for(int i=0;i<apples.length;i++) {
    		if(a+apples[i]>=s&&a+apples[i]<=t)
    			asum++;
    	}
    	for(int i=0;i<oranges.length;i++) {
    		if(b+oranges[i]<=t&&b+oranges[i]>=s)
    			bsum++;
    	}
    	System.out.println(asum);
    	System.out.println(bsum);
    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] apples = new int[m];
		int[] oranges = new int[n];
		for(int i=0;i<m;i++)
			apples[i] = sc.nextInt();
		for(int i=0;i<n;i++)
			oranges[i] = sc.nextInt();
		countApplesAndOranges(s,t,a,b,apples,oranges);
		sc.close();
		}
}
