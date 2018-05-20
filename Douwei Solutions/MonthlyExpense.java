package Douwei;
import java.util.*;
 
public class MonthlyExpense {
    private static boolean Divide(int[] money, int v, int M) { 
    	long sum = 0;
        for (int e : money) {
            if (sum + e > v) {
                if (e > v) return false;
                if ((M--) <= 0) return false;
                sum = e;
            } else {
                sum += e;
            }
        }
        return true;
    }
 
    public static void BinarySearch(int[] money, int M) {
        int low = 0;
        int high = 1000000000;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Divide(money, mid, M)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
        BinarySearch(money, m);
    }
}