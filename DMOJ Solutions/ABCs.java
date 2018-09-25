import java.util.*;
public class ABCs {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[3];
		for(int i = 0; i < 3; i++) 
			a[i] = sc.nextInt();
		for(int i = 0; i < 3; i++) 
			b[i] = sc.nextInt();
		for(int i = 0; i < 3; i++) 
			c[i] = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <=3; i++) {
			if(a[(i-1)%3] == b[i%3])
				if(c[i%3] > 0)
					sum+=c[i%3];
		}
		System.out.println(sum);
		sc.close();
	}
}
