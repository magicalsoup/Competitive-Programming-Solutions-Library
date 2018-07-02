package Douwei;
import java.util.Scanner;
 
public class SHOPShopping{
    static char[][] grid;
    static int endX, endY, minCost;
    static boolean moved;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a != 0 || b != 0) {
            grid = new char[b][a];
            boolean[][] visited = new boolean[b][a];
            int startX = 0, startY = 0;
            for (int i = 0; i < b; i++) {
                String temp = sc.next();
                for (int j = 0; j < a; j++) {
                    grid[i][j] = temp.charAt(j);
                    if (grid[i][j] == 'S') {
                        startX = j;
                        startY = i;
                    } else if (grid[i][j] == 'D') {
                        endX = j;
                        endY = i;
                    }
                }
            }
            minCost = Integer.MAX_VALUE;
            findPath(visited, startX, startY, 0);
            moved=false;
            System.out.println(minCost);
            a=sc.nextInt();
            b=sc.nextInt();
        }
    }
 
    static void findPath(boolean[][] visited, int x, int y, int cost) {
        //System.out.println(x+" "+y+" "+cost);
        if (x == endX && y == endY) {
            if (cost < minCost) {
                minCost = cost;
            }
            return;
        } else {
            if(moved){
            cost += Character.getNumericValue(grid[y][x]);
            }else{
                moved=true;
            }
            boolean[][] v = new boolean[visited.length][visited[0].length];
            for (int i = 0; i < visited.length; i++) {
                for (int j = 0; j < visited[i].length; j++) {
                    v[i][j] = visited[i][j];
                }
            }
            v[y][x] = true;
            if (x > 0 && !visited[y][x - 1] && grid[y][x - 1] != 'X') {
                findPath(v, x - 1, y, cost);
            }
            if (y > 0 && !visited[y - 1][x] && grid[y - 1][x] != 'X') {
                findPath(v, x, y - 1, cost);
            }
            if (x < visited[y].length-1 && !visited[y][x+1] && grid[y][x +1] != 'X') {
                findPath(v, x + 1, y, cost);
            }
            if (y < visited.length-1 && !visited[y+1][x] && grid[y+1][x] != 'X') {
                findPath(v, x, y + 1, cost);
            }
        }
    }
