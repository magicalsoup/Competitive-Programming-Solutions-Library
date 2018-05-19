import java.util.*;
public class wc99p4 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a = 0;
	while(a!=-1) {
		a = sc.nextInt();
		for(int i=1;i<=a/2;i++) {
				if(i+(a-i)==a&&prime(i)&&prime(a-i)) {
					System.out.println(i+" "+(a-i));
				}
		}
		System.out.println();
	}
}
public static boolean prime(int n) {
	if(n==0)
		return false;
	if(n==2||n==1)
		return true;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
