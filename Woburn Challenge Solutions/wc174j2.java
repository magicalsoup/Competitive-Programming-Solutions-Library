import java.util.*;
public class wc174j2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int max = 0;
	int anger = 0;
	boolean bool = false;
	while(a-->0) {
		int b = sc.nextInt();
		max+=b;
		if(max>=10&&bool==true) {
		anger++;
		bool = false;
		}
		if(max<10)
			bool = true;
	}
	System.out.println(anger);
}
}
