	import java.util.*;
	import java.io.*;
	public class wc98p2 {
		 static String s;
		    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		    static StringTokenizer st;
		public static void main(String[]args)throws IOException {
			int n = readInt();
			readLine();
			int res;
			for(int i=0;i<n;i++)
			{
				s = readLine();
				res = 0;
				s = s.replaceAll("-", "");
				s = s.replaceAll(" ", "");
				int x =0;
				if(s.charAt(s.length()-2)=='/')
					x = 1;
				else if(s.charAt(s.length()-3)=='X')
					x = 2;
				for(int j=0;j<s.length()-x;j++)
					if(s.charAt(j)=='X')
						res+=val(j)+val(j+1)+val(j+2);
					else if(s.charAt(j)=='/')
						res+=val(j)+val(j+1);
					else
						res+=val(j);
				System.out.println(res);
			}
		}
		static int val(int pos)
		{
			if(s.charAt(pos)=='X')return 10;
			if(s.charAt(pos)=='/') return 10-val(pos-1);
			return s.charAt(pos)-'0';
		}
		  static String next () throws IOException {
			    while (st == null || !st.hasMoreTokens())
			      st = new StringTokenizer(br.readLine().trim());
			    return st.nextToken();
			  }
	
			  static long readLong () throws IOException {
			    return Long.parseLong(next());
			  }
	
			  static int readInt () throws IOException {
			    return Integer.parseInt(next());
			  }
	
			  static double readDouble () throws IOException {
			    return Double.parseDouble(next());
			  }
	
			  static String readLine () throws IOException {
			    return br.readLine().trim();
			  } 
	}
