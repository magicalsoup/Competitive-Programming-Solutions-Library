import java.util.*;
public class MigratoryBirds {
	
    static int migratoryBirds(int[] ar) {
    	int max = Integer.MIN_VALUE;
    	int result = 0;
    	for(int i=0;i<ar.length;i++) {
    		if(ar[i]!=0) {
    			if(ar[i]>max) {
    				result = i;
    			max = ar[i];
    			}
    		}
    	}
    	return result;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[6];
		for(int i=0;i<n;i++)
			ar[sc.nextInt()]++;
		System.out.println(migratoryBirds(ar));
		sc.close();
	}
}
