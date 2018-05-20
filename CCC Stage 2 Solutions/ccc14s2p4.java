import java.util.*;
class planet implements Comparable<planet>
{
	public int a,b;
	public planet(int A, int B) {
		a = A;
		b = B;
	}
	public int compareTo(planet p)
	{
		if(b>p.b)
			return 1;
		if(b<p.b)
			return -1;
		return 0;
	}
}
public class ccc14s2p4 {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int p =scan.nextInt()-1;
	int start =0;
	planet[] planets = new planet[n];
	for(int i=0;i<n;i++)
	{
		int a= scan.nextInt();
		int b = scan.nextInt();
		if(i==p)
		{
			start = a;
			a =0;
		}
		planets[i]= new planet(a,b);
	}
	Arrays.sort(planets);
	int maxfuel =start;
	int visted = 1;
	for(int i=0;i<n;i++)
		if(maxfuel>=planets[i].b&&planets[i].a>=planets[i].b)
		{
			visted++;
			maxfuel	 += planets[i].a-planets[i].b;
		}
	System.out.println(maxfuel);
	System.out.println(visted);
	}
}
