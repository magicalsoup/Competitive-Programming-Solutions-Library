import java.util.*;
import java.io.*;
public class ccc11s5{
public static int a[],po=0,n;
public static data e[] = new data[300];
public static int[]r = new int[1000];
public static void main(String[]args)throws IOException{
	Scanner s= new Scanner(System.in);
	n = Integer.parseInt(s.nextLine());
	a = new int[n];
	for(int i=0;i<a.length;i++)
		a[i] = Integer.parseInt(s.nextLine());
	meth();
	meth1();
	meth2();
}
public static void meth() {
	for(int i=0;i<30;i++)
		e[i]= new data();
}
public static void meth1() {
	int u=0,i=0;
	for(i=0;i<a.length;i++)
	{
		if(a[i]==1&&u==0)
		{
			e[po].f=i;
			u=1;
		}
		if(a[i]==0&&u==1)
		{
			e[po++].s =i;
			u=0;
		}
	}
	if(i==n&&a[i-1]==1)
		e[po].s =i;
	if(e[po].f==0&&e[po].s==0)
		po--;
}
public static void meth2() {
	for(int i=po;i>=0;i--)
	{
		r[i]=999999;
		int num1 =0;
		for(int j=i;j<=po&&(e[j].s-e[i].f)<=7;j++)
		{
			num1+=e[j].s-e[j].f;
			int num2 = Math.max(4,(e[j].s-e[i].f));
			int num3 = num2-num1;
			if(num2==6&&a[e[i].f+2]==1&&a[e[i].f+3]==1)
				num3 = 999999;
			else if(num2==7&&a[e[i].f+3]==1)
				num3 = 999999;
			r[i] = Math.min(r[i], (num3+r[j+1]));
		}
	}
	System.out.println(r[0]);
}
}
class data
{
	public int f =0,s=0;
}