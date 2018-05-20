import java.util.*;
import java.io.*;
public class coci063p3{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter ps = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
     public static void main(String []args)throws IOException{
         ArrayList<Point> p = new ArrayList<Point>();
    int n = readInt();
            for(int x =0;x<n;x++){
                String next = next();
                for(int y =0;y<n;y++)
                if(next.charAt(y)!='.')
                p.add(new Point(x,y));
            }
            int l = p.size();
            int count =0;
            for(int x =0;x<l;x++){
                for(int y = x+1;y<l;y++){
                    for(int z =y+1;z<l;z++){
                        if(slope(p.get(x),p.get(y))==slope(p.get(y),p.get(z))){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
     }
    public  static double slope(Point p1, Point p2){
         double x1 = p1.x;
         double y1 = p1.y;
         double x2 = p2.x;
         double y2 = p2.y;
         return (y2-y1 )/(x2-x1);
     }
     static class Point{
     int x,y;
        Point(int x, int y){
         this.x =  y;
         this.y = x;
     }
     }
     static String next() throws IOException{
         while(st==null||!st.hasMoreTokens())
         st = new StringTokenizer(br.readLine().trim());
         return st.nextToken();
     }
     static long readLong() throws IOException{
         return Long.parseLong(next());
     }
     static int readInt() throws IOException{
         return Integer.parseInt(next());
     }
     static double readDouble() throws IOException{
         return Double.parseDouble(next());
     }
     static String readLine() throws IOException{
         return br.readLine().trim();
     }
}
