import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.*;
import java.util.*;
 
 
public class acmtryouts2c{
   
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter pw;
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int T = readInt();
		for(int t = 0;t < T;t++){
			int N = readInt(), F = readInt();
			int xs = readInt(),ys = readInt();
			int xd = readInt(),yd = readInt();
			ArrayList<Point2D.Double> points = new ArrayList< Point2D.Double >();
			ArrayList<asteroid> asteroids = new ArrayList<asteroid>();
			for(int i = 0;i <= F;i++){
				points.add(new Point2D.Double(xs + i*xd,ys + i*yd) );
			}
			for(int i = 0;i < N;i++){
				int x[] = new int[3];
				int y[] = new int[3];
				x[0] = readInt();y[0] = readInt();
				x[1] = readInt();y[1] = readInt();
				x[2] = readInt();y[2] = readInt();
				asteroids.add( new asteroid(x,y));
			}
			int cnt = 0;
			boolean v[] = new boolean[N];
			for(int i = 0; i < (int) asteroids.size();i++){
				for(int j = 0;j < (int)points.size();j++){
					if(asteroids.get(i).contains(points.get(j)) && !v[i]){
						v[i] = true;
						cnt++;
					}
				}
			}
			pw.println(cnt);
		}
		
		pw.close();
   }
   static class asteroid{
	   Polygon poly;
	   Line2D.Double ln[] = new Line2D.Double[3];
	   public asteroid(int x[], int y[]){
		   poly = new Polygon(x,y,3);
		   ln[0] = new Line2D.Double(x[0],y[0], x[1], y[1]);
		   ln[1] = new Line2D.Double(x[1],y[1], x[2], y[2]);
		   ln[2] = new Line2D.Double(x[2],y[2], x[0], y[0]);
	   }
	   boolean contains(Point2D.Double P){
		   if(poly.contains(P))
			  return true;
		   else if(onboundary(ln[0],P) || onboundary(ln[1],P) || onboundary(ln[2],P))
			  return true;
		   else
			  return false;
	   }
	   boolean onboundary(Line2D.Double l,Point2D.Double p){
		   Point2D.Double p1 = (java.awt.geom.Point2D.Double) l.getP1();
		   Point2D.Double p2 = (java.awt.geom.Point2D.Double) l.getP2();
		   Point2D.Double p3 = p;
		   return (long)(p1.y - p2.y)*(p1.x - p3.x) == (long)(p1.y - p3.y)*(p1.x - p2.x) 
		   &&	   p3.x >= Math.min(p1.x, p2.x) && p3.x <= Math.max(p1.x, p2.x)
		   &&      p3.y >= Math.min(p1.y, p2.y) && p3.y <= Math.max(p1.y, p2.y);
	   }
   }
  static void exitImmediately(){
	  pw.close();
	  System.exit(0);
  }
  static long readLong() throws IOException{
	  return Long.parseLong(nextToken());
  }
  static double readDouble() throws IOException{
	  return Double.parseDouble(nextToken());
  }
   static int readInt() throws IOException{
	  return Integer.parseInt(nextToken());
  }
   static String nextToken() throws IOException{
	  while(st == null || !st.hasMoreTokens()){
		  if(!br.ready()){
			  exitImmediately();
		  }
		  st = new StringTokenizer(br.readLine().trim());
	  }
	  return st.nextToken();
  }
}
