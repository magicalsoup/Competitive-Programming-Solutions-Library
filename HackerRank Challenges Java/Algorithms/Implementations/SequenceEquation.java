import java.util.*;
public class SequenceEquation {
	
    static int[] permutationEquation(int[] p,int n) {
    	int ans[] = new int[p.length];
    	for(int i=1;i<=n;i++) {
    		ans[i] = p[p[i]];
    	}
    	return ans;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int p[] = new int[n+1];
		for(int i=1;i<=n;i++) {
			int num = sc.nextInt();
			p[num] = i;
		}
		int ans[] = new int[n+1];
		ans = permutationEquation(p,n);
		for(Integer i:ans) 
			if(i!=0)
				System.out.println(i);
		sc.close();
	}
}
