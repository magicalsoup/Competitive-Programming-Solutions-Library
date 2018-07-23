import java.util.*;
public class BetweenTwoSets {
	
    static int getTotalX(int[] a, int[] b) {
    	int cnt = 0;
    	for(int i=1;i<=100;i++) {
    		int flag = 1;	
    		for(int j=0;j<a.length;j++)
    			if(i%a[j]!=0)
    				flag = 0;
    		for(int j=0;j<b.length;j++)
    			if(b[j]%i!=0)
    				flag = 0;
    		if(flag==1)
    			cnt++;
    	}
    	return cnt;
    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=0;i<m;i++)
			b[i] = sc.nextInt();
		System.out.println(getTotalX(a,b));
		sc.close();
	}
}
