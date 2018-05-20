import java.util.*;
import java.io.*;
public class ccc03s2p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int [][][]cube = new int [12][12][12];
	static boolean[][][] empty;
	static int [] movex={0,0,0,0,-1,1};
	static int[] movey = {0,0,-1,1,0,0};
	static int []movez = {-1,1,0,0,0,0};
	static int cnt = 0;
	public static void main(String[]args)throws IOException{
		int n;
		while((n=readInt())!=0) {
			cube=  new int[12][12][12];
			for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++) {
				char[] in = (" "+next()).toCharArray();
				for(int k=1;k<=n;k++)
					cube[i][j][k]=  in[k];
			}
			boolean valid = true;
			main : for(int q=0;q<6;q++) {
				for(int x=1;x<=n;x++) {
					for(int y=1;y<=n;y++) {
						for(int z=1;z<=n;z++) {
							if(cube[x+movex[q]][y+movey[q]][z+movez[q]]==0) {
								empty = new boolean[12][12][12];
								cnt =0;
								compute(x,y,z,movex[q],movey[q],movez[q]);
								if(cnt!=n*n*n) {
									valid = false;
									break main;
								}
							}
						}
					}
				}
			}
		if(valid)
			out.println("Yes");
		else
			out.println("No");
		}
		br.close();
		out.close();
		System.exit(0);
	}
	public static void compute(int x,int y,int z,int i,int j,int k) {
		if(empty[x][y][z])
			return;
		empty[x][y][z] = true;
		cnt++;
		for(int q=0;q<6;q++) {
			int nx = x+movex[q];
			int ny = y+movey[q];
			int nz = z+movez[q];
			if(cube[x][y][z]==cube[nx][ny][nz])
				compute(nx,ny,nz,i,j,k);
		}
		if(cube[x+i][y+j][z+k]!=0)
			compute(x+i,y+j,z+k,i,j,k);
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
