package Douwei;
import java.util.Scanner;
public class ChancesOfWinning {
static int count =0;
static int t;
static int [] a= {0,0,0,1,1,2};
static int[] b = {1,2,3,2,3,3};
static int[][]	game = {{-1,0,1,2},{-1,-1,3,4},{-1,-1,-1,5},{-1,-1,-1,-1}};
static int[] result;
public static void main(String[]args) {
 Scanner sc = new Scanner(System.in);
 t = sc.nextInt()-1;
 int  g = sc.nextInt();
 result = new int[6];
 for(int i=0;i<g;i++)
 {
	 int match = game[sc.nextInt()-1][sc.nextInt()-1];
	 int sx = sc.nextInt();
	 int sy  = sc.nextInt();
	 if(sx>sy)
		 result[match]=1;
	 else if(sx==sy)
		 result[match]=2;
	 else if(sx<sy)
		 result[match]=3;
 }
 play(0,new int[4]);
 System.out.println(count);
 
}
static void play(int i,int[]score) {
for(int r=1;r<=3;r++)
	if(result[i]==0||result[i]==r)
	{
		score[a[i]]+=pointsA(r);
		score[b[i]]+=pointsB(r);
		if(i==5)
		{
			boolean best = true;
			for(int j=0;j<4;j++)
				if(t!=j&&score[j]>=score[t])
					best = false;
			if(best)
			{
				count++;
			}
		}
		else
			play(i+1,score);
		score[a[i]]-=pointsA(r);
		score[b[i]]-=pointsB(r);
	}
}
static int pointsA(int result)
{
	if(result==1)
		return 3;
	else if(result==2)
		return 1;
	else
		return 0;
}
static int pointsB(int result)
{
	if(result==1)
		return 0;
	else if(result==2)
		return 1;
	else
		return 3;
}
}
