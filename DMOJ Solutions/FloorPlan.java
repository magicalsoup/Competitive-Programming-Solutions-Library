import java.util.*;
public class FloorPlan {
	static int floor = 0;
	static int r,c;
	static char plan[][] = new char[26][26];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> room = new ArrayList<Integer>();
		int num = 0;
		int meter = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		for(int i = 1; i <= r; i++) {
			String s = sc.next();
			for(int j = 1; j <= c; j++)
				plan[i][j] = s.charAt(j - 1);
		}
		
		for(int i = 1; i <= r; i++)
			for(int j = 1; j <= c; j++)
				if(plan[i][j] == '.') {
					floor = 0;
					floodfill(i, j);
					room.add(floor);	
				}
		Collections.sort(room);
		for(int i = room.size() - 1; i >= 0 && meter >= room.get(i); i--) {
			meter -= room.get(i);
			num++;
		}
		System.out.println(num + (num != 1? " rooms, " : " room, ") + meter + " square metre(s) left over");
		sc.close();
	}
	static void floodfill(int i, int j) {
		floor++;
		plan[i][j] = 'I';
		if(i - 1 >= 1 && plan[i-1][j] == '.') floodfill(i - 1, j);
		if(j + 1 <= c && plan[i][j+1] == '.') floodfill(i, j + 1);
		if(i + 1 <= r && plan[i+1][j] == '.') floodfill(i + 1, j);
		if(j - 1 >= 1 && plan[i][j-1] == '.') floodfill(i, j - 1);
	}
}
