import java.util.*;
public class DrawingBook {
	
	static int pageCount(int n, int p) {
	    int page1 = Math.abs((p) / 2);
	    if(n%2==0){
	        n++;
	    }
	    int page2 = Math.abs((p - (n)) / 2);
	    return page1 < page2 ? page1 : page2;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(pageCount(n,p));
		sc.close();
	}
}
