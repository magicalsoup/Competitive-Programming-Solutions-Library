package Douwei;
import java.util.*;
public class FlipGame {
    private static  int[] dx={0,0,0,1,-1};
    private static  int[] dy={0,1,-1,0,0};
    private static Set<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; ++i) {
             sb.append(sc.nextLine().trim());
        }
        for (int i = 0; i < sb.length(); ++i) {
            source = (source << 1) + (sb.substring(i, i + 1).equals("b") ? 1 : 0);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(source);
        set.add(source);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int temp = queue.poll();
                if (temp == 0xffff || temp == 0) {
                    System.out.println(level);
                    return;
                }
                for (int r = 0; r < 4; ++r) {
                    for (int c = 0;  c < 4; ++c) {
                        int flipped = temp;
                        for (int k = 0; k <= 4; ++k) {
                            int x = r + dx[k];
                            int y = c + dy[k];
                            flipped = flip(x, y, flipped);
                        }
                        if (set.add(flipped)) {
                            queue.offer(flipped);
                        }
                    }
                }
            }
            level++;
        }
        System.out.println("Impossible");
        sc.close();
    }
    private static int flip(int x, int y, int source) {
        if (x >= 0 && x < 4 && y >= 0 && y < 4) {
            source ^= 1 << (x * 4 + y);
        }
        return source;
    }
}
