import java.util.*;
public class wc17fj1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	for(int i=1;i<=n;i++) {
		int m = sc.nextInt();
		boolean alien = true;
		for(int x=k;x<=m;x*=2) {
			if(x==m)
				alien = false;
		}
		if(alien)
			System.out.println(i);
	}
}
}
