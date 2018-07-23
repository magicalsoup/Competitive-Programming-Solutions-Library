import java.util.*;
public class BreakingTheRecords {
	
    static int[] breakingRecords(int[] scores) {
    	int max = scores[0];
    	int min = scores[0];
    	int[] ans = new int[2];
    	for(int i=0;i<scores.length;i++) {
    		if(scores[i]>min) {
    			ans[0]++;
    			min = scores[i];
    		}
    		if(scores[i]<max) {
    			ans[1]++;
    			max = scores[i];
    		}
    	}
    	return ans;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for(int i=0;i<n;i++)
			scores[i] = sc.nextInt();
		int[] ans = breakingRecords(scores);
		for(Integer i : ans)
			System.out.print(i+" ");
		sc.close();
	}
}