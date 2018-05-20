import java.io.*;
public class mmm14a{
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[]args)throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b =Integer.parseInt(br.readLine());
		int n =10000003;
		int[] pf = new int[n+1];
		for(int i=2;i<=n;i++)
			if(pf[i]==0)
				for(int j=i;j<n;j+=i)
					pf[j]++;
		for(int i=a;i<=b;i++)
			pr.println(pf[i]);
		pr.close();
		
	}
}
