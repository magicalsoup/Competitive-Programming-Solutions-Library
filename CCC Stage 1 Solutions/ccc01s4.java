import java.util.*;
import java.awt.*;
public class ccc01s4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int numofpoints = sc.nextInt();
	Point[]points = new Point[numofpoints];
	double min = Integer.MIN_VALUE;
	for(int x=0;x<numofpoints;x++)
		points[x] = new Point(sc.nextInt(),sc.nextInt());
	for(int x=0;x<numofpoints;x++) {
		for(int y = x+1;y<numofpoints;y++) {
			for(int z =y+1;z<numofpoints;z++) {
				double a = getdist(points[x],points[y]);
				double b =  getdist(points[y],points[z]);
				double c = getdist(points[x],points[z]);
				double s = (a+b+c)/2.0;
				double dist = 0;
				if((a*a+b*b-c*c<0)||(b*b+c*c-a*a<0)||(c*c+a*a-b*b<0))
					dist = Math.max(Math.max(a, b), c);
				else
					dist = (a*b*c)/(2*Math.sqrt(s*(s-a)*(s-b)*(s-c)));
				min = Math.max(dist, min);
			}
		}
	}
	System.out.printf("%.2f",min);
}
public static double getdist(Point point,Point point2) {
	return Math.sqrt(sq(point.getX()-point2.getX())+sq(point.getY()-point2.getY()));
}
public static double sq(double f) {
	return f*f;
}
}
