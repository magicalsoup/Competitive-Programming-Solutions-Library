import java.util.*;
public class ecoo2p5{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for(int k=0;k<5;k++) {
		int numDigits = scan.nextInt();
		int divisor = scan.nextInt();
		int[] digits = new int[numDigits];
		int count = 0;
		for (int i = 0; i < FACTORIAL[numDigits]; i++) {
			for (int j = 0; j < numDigits; j++)
				digits[j] = j + 1;
			permute(digits, i);
			if (toNumber(digits) % divisor == 0)
				count++;
		}
		System.out.println(count);
	}
	}
	
	public static void permute(int[] array, int perm) {
		for (int i = array.length - 1; i >= 0; i--) {
			int j = perm % (i + 1);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			perm /= i + 1;
		}
	}
	public static int toNumber(int[] digits) {
		int num = 0;
		for (int i = digits.length - 1; i >= 0; i--)
			num = num * 10 + digits[i];
		return num;
	}
	
	
	public static  int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	
}
