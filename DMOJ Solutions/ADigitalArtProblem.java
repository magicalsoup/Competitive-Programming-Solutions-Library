import java.util.*;
public class ADigitalArtProblem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		color Xa = new color(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()), Xb = new color(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		if(s.equals("Multiply")) 
			System.out.println(Xa.multiply(Xb));
		if(s.equals("Screen"))
			System.out.println(Xa.screen(Xb));
		if(s.equals("Overlay"))
			System.out.println(Xa.overlay(Xb));
		sc.close();
	}
	static class color{
		double r, g, b;
		public color(double r, double g, double b) {
			this.r = r; this.g = g; this.b = b;
		}
		
		public String multiply(color o) {
			return r*o.r + " " + g*o.g + " " + b*o.b;
		}
		
		public String screen(color o) {
			return (1-(1-r) * (1-o.r)) + " " + (1-(1-g) * (1-o.g)) + " " + (1-(1-b) * (1-o.b));
		}
		
		public String overlay(color o) {
			double d = r < 0.5? 2*r*o.r : 1 - 2*(1-r)*(1-o.r);
			double e = g < 0.5? 2*g*o.g : 1 - 2*(1-g)*(1-o.g);
			double f = b < 0.5? 2*b*o.b : 1 - 2*(1-b)*(1-o.b);
			return d + " " + e + " " + f;
		}
	}
}
