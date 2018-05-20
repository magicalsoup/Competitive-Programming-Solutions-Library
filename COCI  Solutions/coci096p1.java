import java.util.*;
public class coci096p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		scan.nextLine();
		int[] distance = new int[9];
		for(int i=0;i<R;i++) {
			String S = scan.nextLine();
			for(int j = 2;j<C-2;j++) {
				if(S.charAt(j-1)==S.charAt(j+1)&&S.charAt(j-1)!='.') {
					distance[S.charAt(j-1)-'1'] = j;
					break;
				}
			}
		}
		for(int i=0;i<9;i++) {
			int count =0;
			boolean beenthere[] = new boolean[C];
			for(int j=0;j<9;j++) {
				if(distance[j]>distance[i]&&!beenthere[distance[j]]) {
					count++;
				beenthere[distance[j]] = true;
				}
			}
		System.out.println(count+1);
		}
	}
}
