import java.util.*;
public class ccc10j5{
        static int [][]distance = new int[9][9];
        static boolean [][]visted = new boolean[9][9];
        static LinkedList<Integer> queue = new LinkedList<Integer>();
        static int[][] moves = {{1,2},{1,-2},{-1,2},{-1,-2},{2,-1},{2,1},{-2,1},{-2,-1}};
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int startx = scan.nextInt();
        int starty = scan.nextInt();
        int endx = scan.nextInt();
        int endy = scan.nextInt();
        queue.addLast(startx);
        queue.addLast(starty);
        distance[startx][starty] =0;
        visted[startx][starty] = true;
        while(visted[endx][endy]==false){
            int curx = queue.removeFirst();
            int cury = queue.removeFirst();
            for(int[]s:moves){
                move(curx+s[0],cury+s[1],distance[curx][cury]+1);
            }
        }
        System.out.println(distance[endx][endy]);
     }
     static void move(int x, int y,int steps){
         if(x<1||y<1||x>=9||y>=9||visted[x][y])return;
         visted[x][y] = true;
         distance[x][y] = steps;
         queue.addLast(x);
         queue.addLast(y);
     }
}