	import java.util.Scanner;
	public class mockccc14j3{
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			double a= scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d=(Math.floor(a/30));
			double e=(Math.floor(((a+b)%360)/6));
			double f=(Math.floor(((a+b+c)%360)/6)%60);
			//System.out.println(e);
			int g = (int)d;
			int h = (int)e;
			int i = (int)f;
			if(g==0) {
				g = 12;
			}
			String s = "";
			String s1 ="";
			String s2 = "";
			if(g<10) {
				s = "0";
			}
			if(h<10) {
				s1 ="0";
			}
			if(i<10) {
				s2 ="0";
			}
			System.out.println(s+g+":"+s1+h+":"+s2+i );
		}
		
	}
