import java.util.*;
public class ccc14s5{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        if (N == 1) {
            System.out.println(1);
            System.exit(0);
        }

        final int n = N + 1;
        final int[] xs = new int[n];
        final int[] ys = new int[n];

        int p = -1, i, j, x, y, dx, dy;
        final long[] pds = new long[n * (n - 1) / 2];
        for (i = 1; i < n; i++) {
            xs[i] = s.nextInt();
            ys[i] = s.nextInt();
        }
        s.close();

        for (i = 0; i < n; i++) {
            x = xs[i];
            y = ys[i];

            for (j = i + 1; j < n; j++) {
                dx = x - xs[j];
                dy = y - ys[j];

                pds[++p] = ((long) (dx * dx + dy * dy) << 32) + (i << 16) + j;
            }
        }

        Arrays.sort(pds);

        final int[] best = new int[n];
        final int[] previousBest = new int[n];
        final int[] distance = new int[n];

        for (long pd : pds) {
            int d = (int) (pd >> 32);
            i = ((int) pd) >> 16;
            j = ((int) pd) & 0b111111111111;

            if (d != distance[j]) {
                distance[j] = d;
                previousBest[j] = best[j];
            }
            if (d != distance[i]) {
                distance[i] = d;
                previousBest[i] = best[i];
            }

            if (i == 0) {
                // the origin is special because the fox cannot revisit it
                best[0] = Math.max(best[0], previousBest[j]);
            } else {
                best[j] = Math.max(best[j], previousBest[i] + 1);
                best[i] = Math.max(best[i], previousBest[j] + 1);
            }
        }

        System.out.println(best[0] + 1);
    }
}
