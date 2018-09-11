package Douwei;
import java.util.*;
public class TrailingZeros {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i<= n;i++){
			int q = sc.nextInt();
			int result = search(1000000000,0,q);
			System.out.print("Case "+i+": ");
			if(result==0)
				System.out.println("impossible");
			else
				System.out.println(result);
		}
		sc.close();
	}
	public static int search(int high, int low, int target){
		if(high<low) return 0;
		int mid = (high+low)/2;
		int get = get0(mid);
		if(get==target){
			mid = mid - mid%5;
			return mid;
		}
		else if(get>target) 
			return search(mid-1,low,target);
		return search(high, mid+1,target);
	}
	public static int get0(int n){
		int cnt = 0;
		while(n>0){
			cnt+=n/5;
			n/=5;
		}
		return cnt;
	}
}
