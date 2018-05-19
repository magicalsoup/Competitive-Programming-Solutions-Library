import java.util.*;
import java.io.*;
public class ioi0611 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int []charsg = new int[52];
		int []charseq = new int[52];
		int g = readInt();
		int s = readInt();
		for(int x=0;x<g;x++) {
			char c  = (char)br.read();
			int index = (int)(c)-65>25?(int)(c)-71:(int)(c)-65;
			charsg[index]++;
		}
		readLine();
		char []seq = readLine().toCharArray();
		int indexofseq =0;
		int ocurr= 0;
		for(int x=0;x<s;x++) {
			char c = seq[x];
			int index = (int)(c)-65>25?(int)(c)-71:(int)(c)-65;
			charseq[index]++;
			if(charsg[index]==0) {
				charseq=  new int[52];
				indexofseq =x+1;
			}
			else {
				while(charseq[index]>charsg[index]) {
					char charremove = seq[indexofseq++];
					int indexremove= (int)(charremove)-65>25?(int)(charremove)-71:(int)(charremove)-65;
					charseq[indexremove]--;
				}
			}
			if(x-indexofseq+1==g)
				ocurr++;
		}
		out.println(ocurr);
		br.close();
		out.close();
		return;
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
