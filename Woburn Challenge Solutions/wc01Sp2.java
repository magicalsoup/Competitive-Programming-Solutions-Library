import java.util.Scanner;
public class wc01Sp2 {
	static int n,k,a,b;
	static int[]dx = new int[] {-1,1,0,0};
	static int[]dy = new int[] {0,0,-1,1};
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	//-----------read input------------//
	while(true) {
	 n = sc.nextInt();
	 k = sc.nextInt();
	if(n==-1&&k==-1) // terminate program if n==-1 and k==-1
		break;
	 a = sc.nextInt()-1;
	 b = sc.nextInt()-1;
	//----------finish reading---------//	
	int [] dp = new int[n];
	dp[a] = 1;
		while(k-->0) {
		int [] next = new int[n];
		for(int i=0;i<n;i++) {
			next[(i+1)%n] +=dp[i];
			next[(i+n-1)%n]+=dp[i];
		}
		dp = next;
				}
		System.out.println(dp[b]);
			}
		}
	}
