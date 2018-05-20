import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2= sc.nextLine();
		System.out.println(mul(num1, num2));
		
	}
	private static String mul(String s1, String s2 ) {
		char[] num1 = s1.toCharArray();
		char[] num2 = s2.toCharArray();
		
		int carry=0;
		int product=0;
		int sum=0;
		
		char[] result = new char[num1.length+num2.length];
		
		for (int i=0; i < result.length; i++) {
			result[i] = '0';
		}
		
		int currPostion=0;
		for (int i=num1.length-1; i >=0; i--) {
			currPostion =  result.length-(num1.length-i);
			carry=0;
			for (int j = num2.length-1; j >=0 ; j--) {
				product = (num1[i]-'0') *(num2[j]-'0');
				sum =  carry+ product + ((result[currPostion]- '0')) ;
				result[currPostion] =  (char)(sum%10+'0');
				carry = sum/10;
				currPostion--;
			}
			
			if (carry>0) {
				result[currPostion] = (char)(carry+'0');
			}
		}
		
		return String.valueOf(result) ;
	}
}
