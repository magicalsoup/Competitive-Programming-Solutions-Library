import java.util.Scanner;
public class wc153s2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int m =scan.nextInt();
		int [][] freq = new int[m][26];
		for(int i=0;i<n;i++) 
		{
			String s=scan.next();
			for(int j=0;j<m;j++) 
				if(s.charAt(j)!='?') 
					freq[j][s.charAt(j)-'A']++;	
		}
		int error =1;
		int cost =0;
		for(int i=0;i<m;i++) 
		{
			int max =-1;
			int bestj =-1;
			for(int j=0;j<26;j++) 
				if(freq[i][j]>max) 
				{
					max = freq[i][j];
					bestj = j;
				
				}
		int bests =0;
		for(int j=0;j<26;j++) 
			if(freq[i][j]==max) 
				bests++;
		
		for(int j=0;j<26;j++) 
			if(j!=bestj) 
				cost+=freq[i][j];
		error = (error*bests)%1000;
		}
		System.out.println(cost+" "+error);
		System.exit(0);
	}
}
