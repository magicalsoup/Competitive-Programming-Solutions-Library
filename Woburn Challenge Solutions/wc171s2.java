import java.util.*;
import java.io.*;
public class wc171s2{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
@SuppressWarnings("unused")
public static void main(String[]args) throws IOException{
	long n = readInt(), p = readInt(),b = readInt(),c = readInt(),m = readInt(),w = readInt();
	int M = (int)m;
	long stud[] = new long[M];
	for(int i=0;i<M;i++)
		stud[i]=readInt();
	Arrays.sort(stud);
	long total =0;
	int l=0, r = M-1,cnt = 0,cnts= 1, next =0;
	while(l<=r) {
		while(l<=r)
			if(w*(stud[l]-cnts)<=cnt+b*(stud[l]-cnts)) {
				total+= w*(stud[l]-cnts);
				l++;
			}
			else
				break;
		for(int i=0;i<c;i++) {
			if(r<l)break;
			total+=b*(stud[r]-1)+cnt;
					r--;
		}
		cnt+=p;
	}
	System.out.println(total);
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
