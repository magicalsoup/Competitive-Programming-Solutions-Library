package Douwei;
import java.util.Scanner;
public class MiceAndMaze {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int[] e = new int[d];
        int[] f = new int[d];
        int[] g = new int[d];
        for (int i = 0; i < d; i++) {
            e[i] = s.nextInt();
            f[i] = s.nextInt();
            g[i] = s.nextInt();
        }
        int pass = 0;
        for (int i = 1; i <= a; i++) {
            if (maze(e, f, g, b, c, i, 0) == true) 
                pass++;
        }
        System.out.println(pass);
 
    }
 
    public static boolean maze(int[] a, int[] b, int[] c, int index, int time, int x, int y) {
 
        if (x == index && y <= time) 
            return true;
         else if (y < time) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == x) 
                    return maze(a, b, c, index, time, b[i], y + c[i]);
            }
         }
         else 
            return false;
        return false;
    }
}
