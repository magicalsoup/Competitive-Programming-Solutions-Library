import java.util.*;
public class coci082p3 {
static Scanner sc = new Scanner(System.in);
public static void main(String[]args) {
	int food=  sc.nextInt();
	int[][] items = new int[food][2];
	for(int x=0;x<items.length;x++) {
		items[x][0] = sc.nextInt();
		items[x][1] = sc.nextInt();
	}
	int min = min(items, 0,1,0);
	System.out.println(min);
}
public static int min(int[][]items,int i, int s,int b) {
	if(i==items.length-1) {
		if(s==1&&b==0)
			return diff(items[i][0],items[i][1]);
		else {
			return Math.min(diff(s,b),diff(items[i][0]*s,items[i][1]+b));
		}
	}
	int d1 =min(items,i+1,s,b);
	int d2 = min(items,i+1,s*items[i][0],b+items[i][1]);
	return d1<d2?d1:d2;
}
public static int diff(int sour,int bitter) {
	return Math.abs(sour-bitter);
}
}
