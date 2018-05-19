import java.util.*;
import java.io.*;
public class wc98p6{
public static void main(String[]args) throws IOException{
	BufferedReader f=  new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	String line;
	int num,denom,gcd;
	int a,b,c,d;
	while((line=f.readLine())!=null) {
		st = new StringTokenizer(line);
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		num = a*d+b*c;
		denom = b*d;
		gcd = gcd(num,denom);
		num/=gcd;
		denom/=gcd;
		System.out.print(num);
		if(denom!=1) {
			System.out.print(" "+denom);
		}
		System.out.println();
	}
}
public static int gcd(int a, int b) {
	while(b!=0) {
		final int r = a%b;
		a = b;
		b = r;
	}
	return a;
}
}
