package Douwei;
import java.util.*;
public class AggressiveCows {
    static int N;
    static int C;
    static int [] stalls;
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
 
            N = sc.nextInt();
            C = sc.nextInt();
            stalls = new int [N];
            for (int j = 0; j < N; j++) {
                stalls[j] = sc.nextInt();
            }
            Arrays.sort(stalls);
            System.out.println(cowDistance());
        }
     
     
    public static boolean fitCow (int distance) {
        int nOfCows = 1;
        int curCow = stalls[0];
        for (int i = 1; i < N; i++) {
 
            if (stalls[i]-curCow >= distance) {
                nOfCows++;
                if (nOfCows == C) return true;
                curCow = stalls[i];
                 
            }
        }
        return false;
    }
     
    public static int cowDistance () {
        int low = stalls[0];
        int high = stalls[N-1];
        int mid = 0;
        int distance = 0;
        while (high-low>1) {
            mid = (low+high)/2;
            if (fitCow(mid)) {
                low = mid;
                distance = mid;
            }
            else high = mid;
        }
        return distance;
    }
}
 