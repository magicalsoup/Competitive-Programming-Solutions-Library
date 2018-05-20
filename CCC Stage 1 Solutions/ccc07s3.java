import java.util.*;
public class ccc07s3{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int[] friends = new int[10000];
		boolean [] visted = new boolean[10000];
		for(int i=0;i<v;i++) {
			friends[scan.nextInt()] = scan.nextInt();
		}
		int x =scan.nextInt();
		int y= scan.nextInt();
		while(x!=0&&y!=0) {
			for(int i=0;i<10000;i++) {
				visted[i] = false;
			}
			int dist = -1;
			while(!visted[x]&&x!=y) {
				visted[x] = true;
				dist++;
				x = friends[x];
			}
			if(x==y) {
				System.out.println("Yes	"+dist);
			}
			else {
				System.out.println("No");
			}
			x = scan.nextInt();
			y = scan.nextInt();
		}
	}
}
