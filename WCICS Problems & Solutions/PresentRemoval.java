import java.util.*;
public class PresentRemoval {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x == 1) {
				cnt++;
				if(i != n - 1) {
					while(x == 1 && i < n - 1) {
						i++;
						x = sc.nextInt();
					}
				}
			}
			
		}
		System.out.println(cnt);
		sc.close();
	}
}
