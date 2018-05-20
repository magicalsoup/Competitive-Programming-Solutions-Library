import java.util.*;
public class acsl1p7{
	static int[][]a;
	static boolean[]v;
	static int []tag;
	static int []dr = {-1,0,1,0};
	static int []dc = {0,1,0,-1};
	static int[][]side = 
	{{-1,-1,-1,-1},
	{2,5,3,4},
	{6,5,1,4,},
	{1,5,6,4,},
	{2,1,3,6},
	{2,6,3,1},
	{3,5,2,4}};
	
	static int[][]dir = 
	{{-1,-1,-1,-1},
	{0,0,0,0},
	{0,1,0,3},
	{0,3,0,1},
	{1,0,2,3},
	{3,2,1,0},
	{0,2,0,2}};
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	a = new int[6][6];
	int sr = -1;
	int sc = -1;
	for(int i=0;i<6;i++)
		for(int j=0;j<6;j++)
		{
			a[i][j] = scan.nextInt();
			if(a[i][j]==1)
			{
				sr = i;
				sc = j;
			}
		}
	v = new boolean[7];
	v[1] = true;
	if(!dfs(sr,sc,0))
	{
		System.out.println(0);
		return;
	}
	tag = new int[7];
	tag[1] = 1;
	dfs2(sr,sc,0,1,0);
	
	boolean good = true;
	for(int i=1;i<=6;i++)
		for(int j=i+1;j<=6;j++)
		{
			if(tag[i]<=0||tag[i]==tag[j])
				good = false;
		}
	if(!good) {
		System.out.println(0);
		return;
	}
	for(int i=0;i<=6;i++)
		if(tag[i]==6)
			System.out.println(i);
}
public static boolean dfs(int r,int c,int b)
{
	boolean rtn = true;
	
	for(int d=0;d<4;d++)
	{
		int nr = r+dr[d];
		int nc = c+dc[d];
		
		if(nr<0||nr>=6||nc<0||nc>=6||a[nr][nc]==b||a[nr][nc]==0)
			continue;
		
		if(v[a[nr][nc]])
			return false;
		
		v[a[nr][nc]] = true;
		rtn &= dfs(nr,nc,a[r][c]);
		v[a[nr][nc]] = false;
	}
	return rtn;
}
public static void dfs2(int R,int C,int B,int S,int D) {
	for(int d=0;d<4;d++)
	{
		int nr= R+dr[d];
		int nc = C+dc[d];
		if(nr<0||nr>=6||nc<0||nc>=6||a[nr][nc]==B||a[nr][nc]==0)
			continue;
		
		int ns = side[S][(d+D)%4];
		int nd = (dir[S][(d+D)%4]+D)%4;
		
		tag[a[nr][nc]] = ns;
		dfs2(nr,nc,a[R][C],ns,nd);
	}
}
}
