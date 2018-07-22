import java.util.*;
public class ElectronicsShop {
	
    static int getMoneySpent(Integer[] keyboards, int[] drives, int b) {
    	int max = -1;
    	Arrays.sort(keyboards, new Comparator<Integer>(){
			public int compare(Integer a1, Integer b1) {
				return b1.compareTo(a1);
			}
    	});
    	Arrays.sort(drives);
    	for(int i=0,j=0;i<keyboards.length;i++) {
    		for(;j<drives.length;j++) {
    			if(keyboards[i]+drives[j]>b)
    				break;
    			if(keyboards[i]+drives[j]>max)
    				max = keyboards[i]+drives[j];
    		}
    	}
    	return max;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] keyboards = new Integer[n];
		int[] drives = new int[m];
		for(int i=0;i<n;i++)
			keyboards[i] = sc.nextInt();
		for(int i=0;i<m;i++)
			drives[i] = sc.nextInt();
		System.out.println(getMoneySpent(keyboards,drives,b));
		sc.close();
	}
}
