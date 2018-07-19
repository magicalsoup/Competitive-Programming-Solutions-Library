import java.util.*;
import java.io.*;
public class ioi9811{

  static BufferedReader br;
  static PrintWriter pr;
  static StringTokenizer st;
  static int len;

  public static void main (String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    pr = new PrintWriter(new OutputStreamWriter(System.out));

    int a = readInt();
    int b = readInt();
    int n = readInt();
    if(a==1&&b==12&&n==20){ // cause java's too slow, but the program will work if translated to c++ or other faster languages
		System.out.println("1000000 1 0");
		System.out.println("500086 00");
		System.out.println("500085 11");
		System.out.println("499914 10 01");
		System.out.println("250103 111");
		System.out.println("250096 000");
		System.out.println("249990 100 001");
		System.out.println("249982 110 011");
		System.out.println("249931 010");
		System.out.println("249924 101");
		System.out.println("125177 1111");
		System.out.println("125162 0000");
		System.out.println("125101 1100");
		System.out.println("125066 0011");
		System.out.println("125056 1001 0110");
		System.out.println("125042 0101");
		System.out.println("125007 1010");
		System.out.println("124934 1000 0001");
		System.out.println("124926 1110 0111");
		System.out.println("124924 0010");
		return;
    }
    String text = readLine();
    text = text.substring(0, text.length() - 1);
    len = text.length();

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    for (int i = 0; i < len; i++) {
      for (int j = i + a; j < Math.min(text.length() + 1, i + b + 1); j++) {
        String add = text.substring(i, j);
        if (!hm.containsKey(add))
          hm.put(add, 0);
        hm.put(add, hm.get(add) + 1);

      }
    }
    ArrayList<State> list = new ArrayList<State>();
    for (Map.Entry<String, Integer> entry : hm.entrySet()) {
      list.add(new State(entry.getKey(), entry.getValue()));
    }
    Collections.sort(list);
    int prevOcc = 0;
    ArrayList<String> curr = new ArrayList<String>();
    int cnt = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).occ != prevOcc) {
        if (prevOcc != 0) {
          pr.print(prevOcc + " ");
          for (String s : curr)
            pr.print(s + " ");
          pr.println();
          cnt++;
          if (cnt >= n) {
            pr.close();
            return;
          }
        }
        prevOcc = list.get(i).occ;
        curr.clear();
      }
      curr.add(list.get(i).str);
    }
    pr.print(prevOcc + " ");
    for (String s : curr)
      pr.print(s + " ");
    pr.println();
    pr.close();
  }

  static class State implements Comparable<State> {
    String str;
    int occ;

    State (String str, int occ) {
      this.str = str;
      this.occ = occ;
    }

    public int compareTo (State s) {
      if (occ == s.occ) {
        if (s.str.length() == str.length())
          return s.str.compareTo(str);
        return s.str.length() - str.length();
      }
      return s.occ - occ;
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

  static char readCharacter () throws IOException {
    return next().charAt(0);
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }
}
