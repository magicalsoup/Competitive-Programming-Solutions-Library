import java.util.Scanner;
public class dwitesep09p4 {
static boolean[]firstrow = new boolean[16];
static int mintaps = -1;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	for(int casenum =0;casenum<5;casenum++) {
	mintaps = -1;
	int r = sc.nextInt();
	int c = sc.nextInt();
	boolean[][] tiles = new boolean[r][c];
	for(int i=0;i<r;i++)
	{
		String line = sc.next();
		for(int j=0;j<c;j++)
		{
			if(line.charAt(j)=='1')
				tiles[i][j] = true;
			else
				tiles[i][j] = false;
		}
	}
	findpos(tiles,0);
	if(mintaps==-1)
		System.out.println(-1);
	else
		System.out.printf("%d\n",mintaps);
	}
}
static void findpos(boolean[][]startingtiles,int pos)
{
	if(pos==startingtiles[0].length)
	{
		int taps = 0;
		boolean [][]tiles = new boolean[startingtiles.length][startingtiles[0].length];
		for(int r=0;r<tiles.length;r++)
			for(int c=0;c<tiles[0].length;c++)
				tiles[r][c] = startingtiles[r][c];
		
		for(int c=0;c<tiles[0].length;c++)
			if(firstrow[c]==true)
			{
				tiles[0][c]= !tiles[0][c];
				if(tiles.length>1)
					tiles[1][c] = !tiles[1][c];
				if(c>0)
					tiles[0][c-1] = !tiles[0][c-1];
				if(c<tiles[0].length-1)
					tiles[0][c+1] = !tiles[0][c+1];
				taps++;
			}
		checkgrid(tiles,taps);
		return;
	}
	findpos(startingtiles,pos+1);
	firstrow[pos] = true;
	findpos(startingtiles,pos+1);
	firstrow[pos] = false;
}
static void checkgrid(boolean[][]tiles,int taps) {
	for(int r=1;r<tiles.length;r++)
		for(int c=0;c<tiles[0].length;c++)
			if(tiles[r-1][c]==true)
			{
				tiles[r-1][c] = !tiles[r-1][c];
				taps++;
				tiles[r][c] = !tiles[r][c];
				if(c>0)
					tiles[r][c-1] = !tiles[r][c-1];
				if(c<tiles[0].length-1)
					tiles[r][c+1] = !tiles[r][c+1];
				if(r<tiles.length-1)
					tiles[r+1][c] = !tiles[r+1][c];
			}
	for(int r=0;r<tiles.length;r++)
		for(int c=0;c<tiles[0].length;c++)
			if(tiles[r][c]==true)
			{
				taps = -1;
				break;
			}
	if((taps<mintaps||mintaps==-1)&&taps!=-1)
		mintaps = taps;
}
}
