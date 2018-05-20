package Douwei;
import java.util.*;
public class TheEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int cnt = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if ((a*i) + (b*j) + c == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
        return;
    }
}