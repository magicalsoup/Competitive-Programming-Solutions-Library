import java.util.*;
public class PlusMinus {
	
    static void plusMinus(int[] arr) {
    	double pos = 0;
    	double neg = 0;
    	double zero = 0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<0)
    			neg++;
    		else if(arr[i]>0)
    			pos++;
    		else
    			zero++;
    	}
    	System.out.printf("%.6f\n",pos/arr.length);
    	System.out.printf("%.6f\n",neg/arr.length);
    	System.out.printf("%.6f\n",zero/arr.length);
    }

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		plusMinus(arr);
		sc.close();
	}
}