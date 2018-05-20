import java.util.Scanner;
public class BinarySearch1{
	public static void main (String[] args){
		@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
int[]num = new int[sc.nextInt()];
for(int a=0;a<num.length;a++) {
	num[a] = a+1;
}
int s = sc.nextInt();
        int low = 0;
        int high = num.length-1;
        while(low<=high) {
        	int mid = (low+high)/2;
        	if(s==num[mid]) {
        		System.out.println("found at "+ mid);
        		return;
        	}
        	if(s>num[mid]) {
        		low =mid+1;
        	}
        	if(s<num[mid]) {
        		high = mid-1;
        	}
        	
        }
        System.out.println("not found");
     
    }
}
