import java.util.*;
public class wc162j2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int r = scan.nextInt();
	int [] distances = new int[n+1];
	for(int i=0;i<n;i++) {
		distances[i] =scan.nextInt();
	}
	distances[n] = m+r;
	Arrays.sort(distances);
	int start =0;
	int extra =0;
	int extradis =-1;
	int i=0;
	while(true) {
		if(start+2*r>=distances[i]) {
			start = distances[i];
			i++;
		}
		else {
			extradis= distances[i]-start-2*r;
			while(extradis>0) {
				extra++;
				extradis -= 2*r;
			}
			start = distances[i];
			i++;
		}
		if(i>n) {
			break;
		}
	}
	System.out.println(extra);
	}
}
