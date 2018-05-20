import java.util.*;
public class ccc03s3{
static int a =0,b,c=0,x,y;
static int[]brr = new int[100];
public static void floodfill(int array[][],int n,int m) {
	if(n<0||m<0||n>=x||m>=y) return;
	if(array[n][m]==1)return;
	b++;
	array[n][m]	=1;
	floodfill(array,n+1,m);
	floodfill(array,n-1,m);
	floodfill(array,n,m+1);
	floodfill(array,n,m-1);
}
public static void main(String[]args) {
	Scanner sc=  new Scanner(System.in);
	int z = sc.nextInt();
	x =sc.nextInt();
	y = sc.nextInt();
	sc.nextLine();
	String s;
	int [][]arr = new int[x][y];
	for(int i=0;i<x;i++) {
		s = sc.nextLine();
	for(int j=0;j<y;j++)
		if(s.charAt(j)=='I')arr[i][j]=1;
	}
	for(int i=0;i<x;i++)
		for(int j=0;j<y;j++)
			if(arr[i][j]==0) {
				a++;
				b=0;
				floodfill(arr,i,j);	
				brr[a]=b;
			}
	Arrays.sort(brr);
	b =0;
	for(int i=99;i>=100-a;i--) {
		if(b+brr[i]<=z)b+=brr[i];
		else 
			break;
		c++;
	}
	if(c==1)
		System.out.println("1 room, "+(z-b)+" square metre(s) left over");
	else
		System.out.println(Math.abs(c)+" rooms, "+(z-b)+" square metre(s) left over");
}
}