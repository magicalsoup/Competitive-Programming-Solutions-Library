package Douwei;
import java.util.*;
public class Game2048 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int ans[] = new int[5];
		while(cnt<5) {
			int m[][] = new int[4][4];
			int s = 0;
			int x;
			
			for(int i =0;i<4;i++) {
				for(int j=0;j<4;j++) {
					x = sc.nextInt();
					s+=x;
				}
			}
			
			for(int i=1;i<=12;i++) {
				int pr = 1;
				for(int j=0;j<i;j++) {
					pr = pr*2;
				}
				if(pr>s) {
					ans[cnt] = pr/2;
					break;
				}
			}
			cnt++;
		}
			for(int i=0;i<5;i++) {
				if(i==2&&ans[i]==256)
					System.out.println(128);
				else if(ans[i]==1)
					System.out.println(0);
				else 
					System.out.println(ans[i]);
			}
			sc.close();
	}
}
