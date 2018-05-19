import java.util.*;
public class wc173j1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	if(s<10) {
		System.out.println(10-s);
	}
	else if(s<100) {
		System.out.println(100-s);
	}
	else {
		System.out.println(1000-s);
	}
}
}
