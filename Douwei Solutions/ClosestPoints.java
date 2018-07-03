package Douwei;
import java.util.Scanner;
public class ClosestPoints {
    public static String fmt(double d) {
        if (d == (long) d) {
            return String.format("%d", (long) d);
        } else {
            return String.format("%s", d);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        double[] b = new double[a];
        double[] c = new double[a];
        double d = Integer.MAX_VALUE;
        int x = 0, y = 0;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextDouble();
            c[i] = sc.nextDouble();
        }
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (Math.sqrt(Math.pow(b[i] - b[j], 2) + Math.pow(c[i] - c[j], 2)) < d) {
                    x = i;
                    y = j;
                    d = Math.sqrt(Math.pow(b[i] - b[j], 2) + Math.pow(c[i] - c[j], 2));
                }
            }
        }
        if (b[x] > b[y] || b[x] == b[y] && c[x] >= c[y]) {
            System.out.println(fmt(b[y]) + " " + fmt(c[y]));
            System.out.println(fmt(b[x]) + " " + fmt(c[x]));
        } else if (b[x] < b[y] || (b[x] == b[y] && c[x] < c[y])) {
            System.out.println(fmt(b[x]) + " " + fmt(c[x]));
            System.out.println(fmt(b[y]) + " " + fmt(c[y]));
        }
    }
}
