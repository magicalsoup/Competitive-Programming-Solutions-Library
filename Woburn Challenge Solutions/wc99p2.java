import java.util.*;
public class wc99p2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a =  sc.nextInt();
	int b = sc.nextInt();
	while(a!=-1) {
		sc.nextLine();
		char[][]room = new char[b][];
		for(int x =0;x<b;x++)
			room[x] = sc.nextLine().toCharArray();
		int count =0;
		for(int x=0;x<room.length;x++)
			for(int y=0;y<room.length;y++)
				if(room[x][y]!='0') {
					count++;
			removeObject(room,x,y);
				}
		System.out.println(count);
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
}

private static void removeObject(char[][] room, int x, int y) {
	if(x<0||y<0||x>=room.length||y>=room.length||room[x][y]=='0')
		return;
	room[x][y] = '0';
	removeObject(room,x+1,y);
	removeObject(room,x-1,y);
	removeObject(room,x,y+1);
	removeObject(room,x,y-1);
	
}
}
