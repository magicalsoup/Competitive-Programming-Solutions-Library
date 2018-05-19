import java.util.*;
public class wc17fs1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int d = 0;
	int n = sc.nextInt();
	int []c = new int[n],m = new int[n];
	for(int i=0;i<n;i++)
		c[i] = sc.nextInt();
	
	for(int i=0;i<n;i++)
		m[i] = sc.nextInt();
	
	Arrays.sort(c);
	Arrays.sort(m);
	for(int i=0;i<n;i++) {
		d = Math.max(d, Math.abs(c[i]-m[i]));
	}
	System.out.println(d);
}
}
