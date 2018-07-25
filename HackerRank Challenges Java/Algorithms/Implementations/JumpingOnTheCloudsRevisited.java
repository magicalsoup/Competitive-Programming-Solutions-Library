import java.util.*;
public class JumpingOnTheCloudsRevisited {
	
    static int jumpingOnClouds(int[] c, int k) {
    	int energy = 100;
    	for(int i=0;i<c.length;i+=k) {
       		if(c[i]==1)
    			energy-=3;
       		else if(c[i]==0)
       			energy--;
    	}
    	return energy;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c[] = new int[n];
		for(int i=0;i<n;i++)
			c[i] = sc.nextInt();
		System.out.println(jumpingOnClouds(c,k));
		sc.close();
	}
}
