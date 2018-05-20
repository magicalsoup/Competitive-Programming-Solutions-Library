import java.io.*;
import java.util.*;
public class coci086p6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
			int n = readInt();
			int m = readInt();
			int[] list = new int[n];
			int ans =0;
			for(int i=0;i<n;i++) {
				ans+=list[i] = readInt();
			}
			int[]l = new int[m];
			int []r = new int[m];
			int[] give = new int[m];
			for(int i=0;i<m;i++) {
				l[i] = readInt()-1;
				r[i] = readInt()-1;
				list[r[i]] -=2;
			}
			while(true) {
				boolean bad = false;
				for(int i=0;i<n;i++) {
					if(list[i]<0) {
						bad = true;
						break;
					}
				}
				if(!bad) break;
				for(int i=0;i<m;i++) {
					if(list[l[i]]<0&&give[i]>0) {
						list[l[i]]++;
						list[r[i]]--;
						give[i]--;
					}
					else if(list[r[i]]<0&&give[i]<2) {
						list[l[i]]--;
						list[r[i]]++;
						give[i]++;
					}
				}
			}
			out.println(ans/2);
			for(int i=0;i<m;i++) {
				out.println(++l[i]+" "+ ++r[i]+" "+give[i]);
			}
			for(int i=0;i<n;i++) {
				while(list[i]>1) {
					int j = (i+1)%n;
					out.println((i+1)+" "+(j+1)+" "+2);
					list[i]-=2;
				}
				if(list[i]==1) {
					int j =i+1;
					while(list[j]==0) {
						j++;
					}
					out.println((i+1)+" "+(j+1)+" "+1);
					list[i]--;
					list[j]--;
				}
			}
		br.close();
		out.close();
		System.exit(0);
	}
	static String next() throws IOException{
        while(st==null||!st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException{
        return Long.parseLong(next());
    }
    static int readInt() throws IOException{
        return  Integer.parseInt(next());
    }
     static double readDouble() throws IOException{
        return  Double.parseDouble(next());
    }
    static char readCharacter() throws IOException{
        return next().charAt(0);
    }
    static String readLine() throws IOException{
        return br.readLine().trim();
    }
}
