import java.util.*;
public class dwitenov02p1{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			double top =Double.MIN_VALUE;
			for(int j=0;j<3;j++) {
				double reg = sc.nextDouble();
				double sale = sc.nextDouble();
				double off = 100-((sale/reg)*100);
				if(off>top)
					top = off;
			}
			String ans = String.valueOf(String.format("%.3f", top));
			//System.out.println(ans+" "+ans.length());
			for(int t=0;t<7-(ans.length());t++)
				System.out.print(" ");
			System.out.println(ans);
		}
	}
}
