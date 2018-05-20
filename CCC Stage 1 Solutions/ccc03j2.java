import java.util.Scanner;

public class ccc03j2 {
	public static void main(String args[]){ 
		Scanner scan=new Scanner(System.in);
		int arrx[] = new int[10000];
		int arrp[] = new int[10000];
		int arr[] = new int[10000];
	
		int total_line=0;
		
		for(int i=0;i<100000;i++) {
			arr[i] = scan.nextInt();
			if (arr[i] == 0 ) {
				total_line = i;
				break;
			}
		}
	
		
		for(int j=0;j<total_line;j++) {
			int k = 0;
			for(int x =1;x<(arr[j]/2);x++) {
				if(arr[j]%x==0) {
					arrx[k] = x;
					arrp[k] = calculate_p(x, arr[j]);
					k = k + 1;
				} 
			}
			int m = search_minimal_p(arrp,k);
			System.out.println("Minimum perimeter is " + arrp[m] + " with dimensions " + arrx[m] + " x " + getz(arrx[m],arrp[m]));
			
			
		}
		
	}//end of main
	
	static int search_minimal_p(int temparr[], int k) {
		int m = 0;
		int min = temparr[0];
		
	    for(int i=1;i<k;i++) {
	    	if(temparr[i] < min) {
	    		min = temparr[i];
	    		m = i;
	    	}
	    }
	    
		return m;
	}
	
	static int getz(int x, int p) {
		int z =  p / 2 - x ;
		return z; 
	}
	
	static int calculate_p(int x, int area){
		int p = 0;
		p = (x + area / x ) * 2;
		return p;
	}
	
}//end of class
	
