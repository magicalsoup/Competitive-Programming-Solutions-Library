import java.util.*;
import java.io.*;
public class ccc11s4{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] b = new int[8];
	static int []p = new int[8];
	public static void main(String[]args)throws IOException{
		for(int x=0;x<8;x++)
			b[x] = readInt();
		for(int x=0;x<8;x++)
			p[x] = readInt();
		int total =0;
		total+= get(0,0)+get(1,1)+get(0,1);
		total+=get(2,2)+get(0,2);
		total += get(4,4)+get(0,4);
		total+=get(3,3)+get(2,3)+get(1,3)+get(0,3);
		total+=get(5,5)+get(4,5)+get(1,5)+get(0,5);
		total+=get(6,6)+get(4,6)+get(2,6)+get(0,6);
		total+=get(7,7)+get(6,7)+get(5,7)+get(4,7)+get(3,7)+get(2,7)+get(1,7)+get(0,7);
		System.out.println(total);
		
	}	
	public static int get(int x,int y) {
		int z = Math.min(b[x],p[y]);
		b[x]-=z;
		p[y]-=z;
		return z;
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

