import java.util.*;
public class Registration {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), c=0;
		for(int i=0; i<n; i++) c+=sc.nextInt();
		if(c > 200) System.out.println("Over maximum capacity!");
		else System.out.println(200-c);
		sc.close();
	}
}
