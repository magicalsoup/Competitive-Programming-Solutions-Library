import java.util.*;
public class BirthdayCakeCandles {
	
    static int birthdayCakeCandles(int[] ar) {
    	int sum = 0;
    	Arrays.sort(ar);
    	int max = ar[ar.length-1];
    	for(Integer i:ar) {
    		if(i==max)
    			sum++;
    	}
    	return sum;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println(birthdayCakeCandles(a));
		sc.close();
	}
}
