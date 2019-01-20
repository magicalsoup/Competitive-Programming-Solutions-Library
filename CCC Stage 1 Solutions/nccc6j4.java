import java.util.*;
import java.io.*;
public class nccc6j4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(); Item a[] = new Item[4];
		a[0] = new Item("Deluxe Tuna Bitz", 0, 1);
		a[1] = new Item("Bonito Bitz", 0, 2);
		a[2] = new Item("Sashimi", 0, 3);
		a[3] = new Item("Ritzy Bitz", 0, 4);
		while(n-- > 0) {
			String s = readLine();
			if(s.equals(a[0].name)) a[0] = new Item(a[0].name, a[0].num + 1, a[0].index);
			if(s.equals(a[1].name)) a[1] = new Item(a[1].name, a[1].num + 1, a[1].index);
			if(s.equals(a[2].name)) a[2] = new Item(a[2].name, a[2].num + 1, a[2].index);
			if(s.equals(a[3].name)) a[3] = new Item(a[3].name, a[3].num + 1, a[3].index);
		}
		Arrays.sort(a);
		for(Item i : a) { if(i.num != 0) pw.println(i.name + " " + i.num); }
		pw.close();
	}
	static class Item implements Comparable<Item>{
		String name; int num, index;
		public Item(String name, int num, int index) {
			this.name = name;
			this.num = num;
			this.index = index;
		}
		public int compareTo(Item o) {
			if(o.num == num) return index - o.index;
			return o.num - num;
		}
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static double readDouble() throws IOException{
		return Double.parseDouble(next());
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
