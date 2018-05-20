import java.util.*;
public class p175ex5 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int x=0;x<a;x++) {
		int b = sc.nextInt()-1;
		sc.nextLine();
		int grid[][] = new int[b+1][b+1];
		for(int i=0;i<=b;i++) {
			for(int j=0;j<=b;j++ ) {
				grid[i][j] = sc.nextInt();
				grid[i][b]+=grid[i][j];
				grid[b][j]+=grid[i][j];
			}
		}
		int sum = grid[0][b];
	boolean flag = true;
	for(int i=0;i<=b;i++) {
		if(sum!=grid[i][b]||sum!=grid[b][i]) {
			flag = false;
			break;
		}
	}
	if(flag)
		System.out.println("yes");
	else
		System.out.println("no");
	}
}
}
