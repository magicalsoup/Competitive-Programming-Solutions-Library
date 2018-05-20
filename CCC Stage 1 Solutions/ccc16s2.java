	import java.util.Arrays;
	import java.util.Scanner;
	public class ccc16s2{
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			int q,size;
			q = scan.nextInt();
			size = scan.nextInt();
			int A[] = new int[size];
			int B[] = new int[size];
			for(int i=0;i<size;i++) {
				A[i] = scan.nextInt();
			}
			for(int i=0;i<size;i++) {
				B[i] = scan.nextInt();
			}
			Arrays.sort(A);
			Arrays.sort(B);
			int res =0;
			if(q==1)
			{
				for(int i=0;i<size;i++) {
					res+=x(A[i],B[i]);
				}
			}
			else {for(int i=0;i<size;i++)
				{
					res +=x(A[i],B[size-i-1]);
					
			}
			}
			System.out.println(res);
		}
		public static int x(int a,int b) {
			if(a<b)
			{
				return b;
			}
			else {
				return a;
			}
		}
	}
