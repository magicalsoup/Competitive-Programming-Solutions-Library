import java.util.*;
import java.io.*;
   public class nccc5j2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	 int n = readInt(); cacti a[] = new cacti[11]; int max = -1;
    	 for(int i = 0; i < 11; i++) a[i] = new cacti(0);
    	 for(int i = 0; i < n; i++){ int x = readInt(); a[x].freq = a[x].freq + 1; max = Math.max(max, a[x].freq);}
    	 for(int i = 0; i < a.length; i++) if(a[i].freq == max) {pw.println(i); break;} pw.close();
      }
      static class cacti{
    	  int freq;  public cacti(int freq){this.freq = freq;}
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
