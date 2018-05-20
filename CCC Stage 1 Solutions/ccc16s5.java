import java.util.*;
public class ccc16s5{
	static int n;
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		long t = scan.nextLong();
		scan.nextLine();
		String s = scan.nextLine();
		boolean []a = new boolean[n];
		for(int i=0;i<n;i++) 
			a[i] = s.charAt(i)=='1';
		boolean [] next;
		for(long b = 1;t>0;b=b<<1) 
		{
			if(t%2==1)
			{
				next = new boolean[n];
				for(int i=0;i<n;i++)
					if(a[i])
					{
						int r = mod(i+b);
						int l = mod(i-b);
						next[r] =!next[r];
						next[l] =!next[l];
					}
				a = next;
			}
			t /=2;
		}
		for(int i=0;i<n;i++)
			if(a[i])
				System.out.print(1);
			else
				System.out.print(0);
		
		System.out.println();
	}
	static int mod(long x)
	{
		return (int)(((x%n)+n)%n);
	}
}
