import java.util.*;
public class ecoo12r1p3 {
	/*
	 * v3 = ( (x1 + x2 + Sqrt[3] (y1 - y2) )/2, (y1 + y2 + Sqrt[3] (x2 - x1) )/2)
	 */
	static final Point origin = new Point(0, 0);
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 5; t++) {
			Point p = new Point(sc.nextDouble(), sc.nextDouble());
			Point rightVertex = getThirdPoint(p, origin);
			Point leftMid = getThirdPoint(origin, p);
			Point topVertex = getThirdPoint(leftMid, p);
			Point leftVertex = getThirdPoint(rightVertex, topVertex);
			System.out.println(format(rightVertex) + " " + format(leftVertex) + " " + format(topVertex));
			
		}
		sc.close();
	}
	static String format(Point p) {
		return "(" + Math.round(p.x * 10.0) / 10.0 + "," + Math.round(p.y * 10.0) / 10.0 + ")";
	}
	static Point getThirdPoint(Point v1, Point v2) {
		double x = (v1.x + v2.x + Math.sqrt(3) * (v1.y - v2.y)) / 2;
		double y = (v1.y + v2.y + Math.sqrt(3) * (v2.x - v1.x)) / 2;
		return new Point(x, y);
	}
	static class Point{
		double x, y;
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
