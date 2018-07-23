import java.util.*;
public class AngryProfessor {
	
    static String angryProfessor(int k, int[] a) {
    	int arrived = 0;
    	for(int i=0;i<a.length;i++)
    		if(a[i]<=0)
    			arrived++;
    	return arrived>=k?"NO":"YES";
    	
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			System.out.println(angryProfessor(k,a));
		}
		sc.close();
	}
}
