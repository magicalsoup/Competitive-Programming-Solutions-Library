import java.util.*;
public class nye18p3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); Fortress a[] = new Fortress[n];
		for(int i = 0; i < n; i++) a[i] = new Fortress(sc.nextInt(), sc.nextInt(), sc.nextInt() * sc.nextInt());
		
		Arrays.sort(a); 
		System.out.println(a[0].x + " " + a[0].y);
		sc.close();
	}
	static class Fortress implements Comparable<Fortress>{
		int x, y, area;
		public Fortress(int x, int y, int area) {
			this.x = x; this.y = y; this.area = area;
		}
		public int compareTo(Fortress o) {
			return o.area - area;
		}
	}
}
