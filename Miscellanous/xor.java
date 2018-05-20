import java.util.*;
public class xor {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	for(int q =sc.nextInt();q>0;q--) {
		System.out.println(XOR(sc.nextInt(),sc.nextInt()));
	}
}
	public static long XOR(int a, int b) {
		return XOR(b)^XOR(a-1);
	}
	public static long XOR(int a) {
		int[]value = {1,a+1,0,a};
		return value[(a+1)%4];
	}
}
