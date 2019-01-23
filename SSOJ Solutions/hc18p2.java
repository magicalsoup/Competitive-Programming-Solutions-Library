import java.util.*;
public class hc18p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		for(int i = 0; i < n; i++) {
			Pair s = check(a, i);
			if(s.s >= 2) {System.out.print(a[i] + "-" +a[s.f] + " "); i = s.f;}
			else System.out.print(a[i] + " ");
		}
		sc.close();
	}
	static Pair check(int a[], int st) {
		int ed = 0, cnt = 0;
		for(int i = st; i < a.length - 1; i++) {
			if(Math.abs(a[i + 1] - a[i]) == 1) {ed = i; cnt++; continue;}
			else break;
		}
		return new Pair(ed + 1, cnt);
	}
	static class Pair{
		int f, s;
		public Pair(int f, int s) {
			this.f = f; this.s = s;
		}
	}
}
