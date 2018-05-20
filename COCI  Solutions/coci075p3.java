import java.awt.*;
import java.text.*;
import java.util.*;
public class coci075p3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int x1 = sc.nextInt(),y1 = sc.nextInt(),
	x2 = sc.nextInt(),y2 = sc.nextInt(),
	x3 = sc.nextInt(), y3 = sc.nextInt();
	double
	area = area(x1,y1,x2,y2,x3,y3);
	Polygon Triangle = new Polygon();
	Triangle.addPoint(x1, y1);
	Triangle.addPoint(x2, y2);
	Triangle.addPoint(x3, y3);
	int points = sc.nextInt();
	int counts =0;
	int x,y;
	while(points-->0) {
		x = sc.nextInt();
		y = sc.nextInt();
		if(trianglePoint(x,y,area,x1,y1,x2,y2,x3,y3))
		counts++;
	}
	System.out.println(new DecimalFormat("0.0").format(Math.abs(area)));
	System.out.println(counts);
}
	public static boolean trianglePoint(int x,int y,double area,int x1,int y1,int x2,int y2,int x3,int y3) {
		return area(x1,y1,x,y,x2,y2)+area(x1,y1,x,y,x3,y3)+area(x2,y2,x,y,x3,y3)==area;
	}
	public static double area(int x1,int y1,int x2,int y2,int x3,int y3) {
		return Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0;
	}
}
