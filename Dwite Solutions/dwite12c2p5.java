import java.util.*;
public class dwite12c2p5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int testcases=1; testcases<=5; testcases++) {
			int n = sc.nextInt(), m = sc.nextInt();
			int a[] = new int[n+1];
			for(int i=1; i<=n; i++)
				a[i] = sc.nextInt();
			int cnt = 0, cur=1, nxt=1;
			
			for(int i=1; i<=n;) {
				cur=i;
				for(int j=cur; j<=i+m&& j<=n; j++) 
					if(a[j] >= a[cur]) cur = j;
				cnt++;
				for(nxt = cur+1; nxt<=cur+m && nxt<=n; nxt++) 
					if(a[nxt] > a[cur]) break;
				
				i = nxt;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
