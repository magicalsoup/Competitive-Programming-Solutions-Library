import java.util.Scanner;
public class wc16fj1{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
 	int n =scan.nextInt();
 	int [][] s = new int[100][100];
 	int maxw = 0;
 	int maxc =0;
 	for(int i=0;i<n;i++) {
 		for(int j=0;j<n;j++) {
 			s[i][j] = scan.nextInt();
 		}
 	}
 	for(int i=0;i<n;i++) {
 		int w =0;
 		for(int j=0;j<n;j++) {
 			if(i!=j&&s[i][j]>s[j][i]) {
 				w++;
 			}
 		}
 	if(w>maxw) {
 		maxw =w;
 		maxc =i;
 	}
 	}
 	System.out.println(maxc+1);
 
	}
}
