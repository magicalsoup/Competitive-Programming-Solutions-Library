import java.util.*;
public class ccc15j4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int[]rec = new int[101];
	int []total = new int[101];
	int timer =0;
	boolean lastw = false;
	for(int i=1;i<=m;i++)
	{
		char c = sc.next().charAt(0);
		int x = sc.nextInt();
		switch(c)
		{
		case 'R':
		{
			if(!lastw)
				timer++;
			lastw= false;
			rec[x] = timer;
			break;
		}
		case 'S':
		{
			if(!lastw)
				timer++;
			lastw= false;
			total[x]+=timer-rec[x];
			rec[x] =0;
			break;
		}
		default:
		{
			timer +=x;
			lastw =true;
		}
		}
	}
	for(int i=1;i<total.length;i++)
	{
		if(rec[i]!=0)
		{
			System.out.printf("%d -1%n",i);
		}
		else
		{
			if(total[i]!=0)
			{
				System.out.printf("%d %d%n",i,total[i]);
			}
		}
	}
}
}
