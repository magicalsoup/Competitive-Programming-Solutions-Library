import java.util.*;
public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
    	Arrays.sort(height);
    	if(k>=height[height.length-1])
    		return 0;
    	return Math.abs(height[height.length-1]-k);
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int[] height = new int[n];
    	for(int i=0;i<n;i++)
    		height[i] = sc.nextInt();
    	System.out.println(hurdleRace(k,height));
    	sc.close();
    }
}
