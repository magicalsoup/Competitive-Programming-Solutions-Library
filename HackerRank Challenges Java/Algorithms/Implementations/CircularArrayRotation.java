import java.util.*;
public class CircularArrayRotation {
	
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	int ans[] = new int[queries.length];
    	for(int i=0;i<queries.length;i++) {
    		ans[i] = a[(a.length-(k%a.length)+queries[i])%a.length];
    	}
    	return ans;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int k = sc.nextInt();
		int q = sc.nextInt();
		int queries[] = new int[q];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=0;i<q;i++)
			queries[i] = sc.nextInt();
		
		int ans[] = new int[q];
		ans = circularArrayRotation(a,k,queries);
		for(Integer i:ans)
			System.out.println(i);
		
		sc.close();
	}
}
