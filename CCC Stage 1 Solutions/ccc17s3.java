import java.util.*;
public class ccc17s3{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int [] boards = new int[2001];
	int [] buckets = new int[4001];
	for(int i=0;i<n;i++) {
		boards[scan.nextInt()]++;
	}
	for(int i=1;i<2001;i++) {
		if(boards[i]!=0) {
			buckets[i*2]+=boards[i]/2;
			for(int j=i+1;j<2001;j++) {
				if(boards[j]!=0) {
					buckets [i+j]+=Math.min(boards[i],boards[j]);
				}
			}
		}
	}
	int len =0,cnt =0;
	for(int i=0;i<4001;i++) {
		if(buckets[i]>len) {
			len = buckets[i];
			cnt =1;
		}
		else if(buckets[i]==len) {
			cnt++;
		}
	}
	System.out.println(len+" "+cnt);
	}
}
