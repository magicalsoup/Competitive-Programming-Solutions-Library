import java.util.*;
import java.io.*;
    public class TestScores{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[] args) throws Exception{
    	  int n = readInt(); long m = readLong(), k = readLong(); long cnt = 0; Test t[] = new Test[n];
    	  for(int i = 0; i < n; i++) { t[i] = new Test(readLong(), readLong()); cnt += t[i].score;}
    	  if(cnt >= n * k) { pw.println(0); pw.close(); return;} long ans = 0; Arrays.sort(t);
    	  for(int i = 0; i < n; i++) {
    		  if(cnt + (m - t[i].score) <= n * k) {
    			  ans += (m - t[i].score) * t[i].hour;
    			  cnt += (m - t[i].score);
    		  }
    		  else { ans += t[i].hour * (n * k - cnt) ; break;}
    	  }
    	  pw.println(ans); pw.close();
      }
      static class Test implements Comparable<Test>{
    	  long score, hour;
    	  public Test(long score, long hour) {
    		  this.score = score; this.hour = hour;
    	  }
    	  @Override
    	  public int compareTo(Test t) {
    		  if(t.hour == hour) return Long.compare(t.score, score);
    		  return Long.compare(hour, t.hour);
    	  }
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
