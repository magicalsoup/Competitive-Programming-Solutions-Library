import java.util.*;
import java.io.*;
    public class ecoo15r1p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  /*
    	   * Sample Test Case:
    	   * red, red, red, red, red, red, red, red (8)
    	   * brown, brown, brown, brown, brown, brown, brown, brown, brown (9)
    	   * violet, violet, violet, violet (4)
    	   * blue, blue, blue, blue, blue, blue (6)
    	   * pink, pink, pink, pink, pink, pink, pink (7)
    	   * yellow, yellow, yellow, yellow (4)
    	   * green, green, green, green (4)
    	   * orange, orange, orange, orange, orange, orange, orange, orange (8)
    	   */
    	  for(int i=0;i<10;i++) {
    		  int orange = 0, blue = 0, green = 0, yellow = 0, pink = 0, violet = 0, brown = 0, red = 0, seconds = 0;
    		  for(;;) {
    			  String s = readLine();
    			  if(s.equals("end of box")) break;
    			  if(s.equals("orange")) orange++;
    			  else if(s.equals("blue")) blue++;
    			  else if(s.equals("green")) green++;
    			  else if(s.equals("yellow")) yellow++;
    			  else if(s.equals("pink")) pink++;
    			  else if(s.equals("violet")) violet++;
    			  else if(s.equals("brown")) brown++;
    			  else if(s.equals("red")) red++;
    		  }
    		  if(orange%7==0) seconds += orange / 7 * 13;
    		  else seconds += (orange / 7 + 1) * 13;
    		  if(blue%7==0) seconds += blue / 7 * 13;
    		  else seconds += (blue / 7 + 1) * 13;
    		  if(green%7==0) seconds += green / 7 * 13;
    		  else seconds += (green / 7 + 1) * 13;
    		  if(yellow%7==0) seconds += yellow / 7 * 13;
    		  else seconds += (yellow / 7 + 1) * 13;
    		  if(pink%7==0) seconds += pink / 7 * 13;
    		  else seconds += (pink / 7 + 1) * 13;
    		  if(violet%7==0) seconds += violet / 7 * 13;
    		  else seconds += (violet / 7 + 1) * 13;
    		  if(brown%7==0) seconds += brown / 7 * 13;
    		  else seconds += (brown / 7 + 1) * 13;
    		  seconds += red * 16;
    		  out.println(seconds);
    	  }
    	  out.close();
      }
      static String next () throws IOException {
    	  while (st == null || !st.hasMoreTokens())
    		  st = new StringTokenizer(br.readLine().trim());
    	  return st.nextToken();
      }    
      static long readLong () throws IOException {
    	  return Long.parseLong(next());
      }
      static int readInt () throws IOException {
    	  return Integer.parseInt(next());
      }
      static double readDouble () throws IOException {
    	  return Double.parseDouble(next());
      }
      static String readLine () throws IOException {
    	  return br.readLine().trim();
      } 
}
