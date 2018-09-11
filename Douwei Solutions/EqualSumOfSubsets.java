package Douwei;
import java.util.*;
public class EqualSumOfSubsets {
	static boolean [] visited;
	static int [] nums;
	static int sum = 0;
	static int n, k;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 k = sc.nextInt();
		visited = new boolean[n];
		nums = new int[n];
		for(int i = 0; i < n ;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		if(sum % k != 0) {
			System.out.println("NO");
			return ;
		}
		System.out.println(search(0,0)? "YES":"NO");
		sc.close();
	}
	static boolean search(int group , int csum) {
		if(csum > sum/k) return false;
		if(csum == sum/k) {
			if(group == k) return true;
			return search(group + 1 , csum);
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				if(search(group, csum + nums[i])) return true;
				visited[i] = false;
			}
		}
		return false;
	}
}
