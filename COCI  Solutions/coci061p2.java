import java.util.*;
public class coci061p2{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	double r;
	r = s.nextDouble();
	System.out.println(String.format("%.6f", (r*r)*Math.PI));
	System.out.println(String.format("%.6f", ((Math.PI*(r*r))/(Math.PI/2))));
}
}
