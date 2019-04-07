import java.util.*;
public class ScandalSpeech {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); String s = sc.next();
		Point start = new Point(0, 0);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'e') start.x++;
			if(c == 'n') start.y--;
			if(c == 'w') start.x--;
			if(c == 's') start.y++;
		}
		System.out.println(start.x + " " + start.y);
		sc.close();
		
	}
	static class Point{
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
