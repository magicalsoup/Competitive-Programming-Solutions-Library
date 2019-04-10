import java.util.*;
public class PresentProductionReport {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		char g[][] = new char[101][101];
		int i = 0;
		while(!str.equals("done")) {
			g[i] = str.toCharArray();

			i++;
			str = sc.nextLine(); 
			
		}
		
		for(int j = 0; j < n; j++) {
			for(int k = 0; k < i; k++) {
				if(g[k][j] == '#')
					System.out.println(k);
			}
		}
		sc.close();
	}
}
