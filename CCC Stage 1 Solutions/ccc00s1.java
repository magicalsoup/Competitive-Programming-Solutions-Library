	import java.util.Scanner;
	public class ccc00s1{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int jar = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int one = 0;
			while(jar > 0) {
				if(jar == 0) {
					break;
				}
				a++;
				one++;
				jar--;
				if(a == 35) {
					jar = jar + 30;
					a = 0;
				}
				if(jar == 0) {
					break;
				}
				b++;
				one++;
				jar--;
				if(b == 100) {
					jar = jar + 60;
					b = 0;
				}
				if(jar == 0) {
					break;
				}
				c++;
				one++;
				jar--;
				if(c == 10) {
					jar = jar + 9;
					c = 0;
				}	
			}
			System.out.println("Martha plays " + one + " times before going broke.");
		}
	}