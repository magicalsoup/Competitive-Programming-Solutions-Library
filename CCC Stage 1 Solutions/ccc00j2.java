import java.util.*;
public class ccc00j2{
	public static boolean rotatable(int xx) {
		int a[] = new int[7];
		boolean okay = true;
		int i= 0;
		int x = xx;
		while(x!=0) {
			i = i+1;
			a[i] = x%10;
			x = x/10;
		}
		for(int j=1;j<=i;j++) {
			if((a[j]==0&&a[i-j+1]==0)||(a[j]==1&&a[i-j+1]==1)||
			(a[j]==8&&a[i-j+1]==8)||(a[j]==9&&a[i-j+1]==6)||(a[j]==6&&a[i-j+1]==9)) {
				//okay = true;
			}
			else {
				okay = false;
			}
		}
		return okay;
	}
public static void main(String[]args) {
Scanner scan = new Scanner(System.in);		
int n = scan.nextInt();
int m = scan.nextInt();
int count =0;
for(int i=n;i<=m;i++) {
	if(rotatable(i)) {
		count++;
	}
}
		System.out.println(count);
}
    }
