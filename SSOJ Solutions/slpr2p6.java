import java.util.Scanner;
import java.util.Arrays;
public class slpr2p6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int min=0x3f3f3f3f;
        for(int i=0; i<N-1; i++) {
            min = Math.min(min, a[i+1] - a[i]);
        }
        System.out.println(min);
        sc.close();
    }
}
