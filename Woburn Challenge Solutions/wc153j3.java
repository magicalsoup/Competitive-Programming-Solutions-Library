import java.util.Scanner;
public class wc153j3{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int q = scan.nextInt();
int min_win =0;
int max_win=0;
for(int i=0;i<n;i++) {
	int f = scan.nextInt();
	int m = scan.nextInt();
	boolean mandatory = true, possible = false;
	for(int j=0;j<m;j++) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		mandatory &=(f==1||(a==b&&a%f==0));
		possible |=((a-1)/f!=b/f);
	}
	if(mandatory) {
		min_win++;
		max_win++;
	}
	else if(possible) {
		max_win++;
	}
}
for(int i=0;i<q;i++) {
	int t= scan.nextInt();
	if(min_win<=t&&t<=max_win) {
		System.out.println("Y");
	}
	else {
		System.out.println("N");
	}
}
System.exit(0);
	}
}
