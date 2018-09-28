package Douwei;
import java.util.*;
public class TheDifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Q = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
   
        Arrays.sort(array);
   
        outer: for (int i = 0; i < Q; i++) {
            int q = sc.nextInt();
            for (int j = 0; j < N; j++) {
                int n = array[j];
                if (Arrays.binarySearch(array, n + q) > 0) {
                    System.out.println("YES");
                    continue outer;
                }
            }
            System.out.println("NO");
        }
        sc.close();
    }
}
