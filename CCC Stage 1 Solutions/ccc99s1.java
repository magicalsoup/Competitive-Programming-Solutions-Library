import java.util.*;
import java.io.*;
public class ccc99s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
public static void main(String[]args)throws IOException {
	int a=0,b=0;
	int num,j;
	String[]card = new String[52];
	for(int i=0;i<52;i++)
		card[i]= next();
	for(int i=0;i<52;i++) {
		num =0;
		if(card[i].equals("jack"))num = 1;
		if(card[i].equals("queen"))num = 2;
		if(card[i].equals("king"))num=3;
		if(card[i].equals("ace"))num= 4;
		for(j=i+1;j<=i+num;j++) {
			if(j>=52)break;
			if(card[j].equals("jack")||card[j].equals("queen")||card[j].equals("king")||card[j].equals("ace")) {
				break;
			}
		}
		if(j==i+num+1&&num!=0) {
			if(i%2==0) {
				out.println("Player A scores "+num+" point(s).");
			a+=num;
		}
		else {
			out.println("Player B scores "+num+" point(s).");
			b+=num;
		}
	}
}
	out.println("Player A: "+a+" point(s).");
	out.println("Player B: "+b+" point(s).");
	br.close();
	out.close();
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
