import java.util.*;
public class UtopianTree {
    static int utopianTree(int n) {
    	int hi = 1;
    	for(int i=1;i<=n;i++) {
    		if(i%2==1)
    			hi*=2;
    		else
    			hi++;
    	}
    	return hi;
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int q = sc.nextInt();
    	while(q-->0) {
    		int n = sc.nextInt();
    		System.out.println(utopianTree(n));
    	}
    	sc.close();
    }
}