import java.util.Scanner;
public class p154ex7{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	for(int i=a;i<b;i++) {
		int s = i%10;
		int s1 = (i/10)%10;
		int s2 =(i/100)%10;
		if((s*s*s)+(s1*s1*s1)+(s2*s2*s2)==i) {
			System.out.println(i);
		}
	}
}
}
