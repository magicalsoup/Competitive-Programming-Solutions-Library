import java.util.*;
public class SaveThePrisoner {
	
    static int saveThePrisoner(int n, int m, int s) {
    	if((m+s-1)%n==0)
    		return n;
    	else
    		return (m+s-1)%n;

    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt(); 
			int s = sc.nextInt();
			System.out.println(saveThePrisoner(n,m,s));
		}
		sc.close();
	}
}
