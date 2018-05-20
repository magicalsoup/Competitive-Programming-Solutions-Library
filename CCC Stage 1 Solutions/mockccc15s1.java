import java.util.*;
public class mockccc15s1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		int U = scan.nextInt();
		int R1 = scan.nextInt();
		int R2= scan.nextInt();
		int ans =0;
	 for (int u = 1; u <= 1000; u++) {  
	   for (int d = 1; d <= 1000; d++) { 
		      int x= U-u-d;           
		     int points = u-d+2*x;
		     if(points!=P||x<=0)continue;
		     if(R1*x==R2*u||R2*x==R1*u)ans++;
		     else if( R1*x==R2*d||R2*x==R1*d)ans++;
		     else if(R1*d==R2*u||R2*d==R1*u)ans++;
					  }
	 }
	 System.out.println(ans);
	}
}
