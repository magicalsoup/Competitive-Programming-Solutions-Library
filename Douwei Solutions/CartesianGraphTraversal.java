package Douwei;
import java.util.Scanner;
public class CartesianGraphTraversal{
    public static int[] x, y;
    public static int n, k;
    public static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[n];
        y = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        dfs(0);
        if (visited[n - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void dfs(int cur) {
        visited[cur] = true;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && dist(cur, i)) {
                dfs(i);
            }
        }
    }
    public static boolean dist(int a, int b) {
        return ((Math.pow(x[a] - x[b], 2) + Math.pow(y[a] - y[b], 2)) <= k * k);
    }
}