package Douwei;
import java.text.DecimalFormat;
import java.util.*;
  
public class Main {
  
    static int m;
  
    static double[] r;
  
    static List<int[]> perms;
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            m = s.nextInt();
            if (m == 0)
                break;
            r = new double[m];
            perms = new ArrayList<>();
            int[] p = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = i;
                r[i] = s.nextDouble();
            }
  
            generate(m, p);
            double minwidth = Double.MAX_VALUE;
            for (int[] perm : perms) {
                double currdist = 0;
                currdist += r[perm[0]];
                for (int i = 1; i < m; i++) {
                    double r1 = r[perm[i - 1]];
                    double r2 = r[perm[i]];
                    currdist+=2*Math.sqrt(r1*r2);
                }
                currdist += r[perm[m - 1]];
                minwidth = Math.min(minwidth, currdist);
            }
            System.out.println(new DecimalFormat("0.000").format(minwidth));
        }
        s.close();
    }
  
    static void generate(int n, int[] a) {
        if (n == 1) {
            int[] perm = new int[m];
            for (int i = 0; i < m; i++) {
                perm[i] = a[i];
            }
            perms.add(perm);
        } else {
            for (int i = 0; i < n - 1; i++) {
                generate(n - 1, a);
                int tmp;
                if (n % 2 == 0) {
                    tmp = a[i];
                    a[i] = a[n - 1];
                    a[n - 1] = tmp;
                } else {
                    tmp = a[0];
                    a[0] = a[n - 1];
                    a[n - 1] = tmp;
                }
            }
            generate(n - 1, a);
        }
    }
  
}
