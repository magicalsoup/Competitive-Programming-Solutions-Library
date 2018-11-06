import java.util.*;
import java.io.*;
    public class WhaleAndSoul{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); Card a[] = new Card[n]; for(int i = 0; i < n; i++) a[i] = new Card(readInt(), readInt());
    	  ArrayList<Card> b = new ArrayList<Card>(); int min = 101, max = -1;
    	  for(int i = 0; i < n; i++) max = Math.max(max, a[i].days);
    	  for(int i = 0; i < n; i++) if(a[i].days == max) b.add(new Card(a[i].cost, a[i].days));
    	  for(int i = 0; i < b.size(); i++)min = Math.min(min, b.get(i).cost);
    	  for(int i = 0; i < b.size(); i++) { if(b.get(i).cost == min) {b.get(i).printStatus(); break;}}
    	  pw.close();
      }
      static class Card{
    	  int cost, days;
    	  public Card(int cost, int days) { this.cost = cost; this.days = days;}
    	  public void printStatus() { pw.println(cost + " " + days);}
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
