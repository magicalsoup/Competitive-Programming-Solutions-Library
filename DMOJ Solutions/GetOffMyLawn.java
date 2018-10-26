import java.util.*;
public class GetOffMyLawn {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = Double.MIN_VALUE;
		Point p = new Point(0, 0);
		while(n --> 0) {
			Point goose = new Point(sc.nextInt(),sc.nextInt());
			if(goose.distance() > max) {
				max = goose.distance();
				p = new Point(goose.x, goose.y);
			}	
		}
		System.out.println(p.x + " " + p.y);
		sc.close();
	}
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public double distance() {
			return Math.sqrt( Math.pow((0 - this.x), 2)  + Math.pow(0 - this.y, 2)); 
		}
	}
}
