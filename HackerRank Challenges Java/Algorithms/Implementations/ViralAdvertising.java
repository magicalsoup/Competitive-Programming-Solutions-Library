import java.util.*;
public class ViralAdvertising {
	
    static int viralAdvertising(int n) {
    	int shared = 0;
    	int ppl = 5;
    	for(int i=0;i<n;i++) {
    		ppl = (int)(Math.floor(ppl/2));
    		shared+=ppl;
    		ppl*=3;
    	}
    	return shared;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(viralAdvertising(n));
		sc.close();
	}
}
