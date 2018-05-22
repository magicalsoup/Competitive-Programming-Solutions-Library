package Douwei;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Matrix {
 
    static class Tree {
        public Tree topLeft;
        public Tree topRight;
        public Tree botLeft;
        public Tree botRight;
        public int x1;
        public int y1;
        public int x2;
        public int y2;
 
        public boolean mask;
 
        public Tree(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.y2 = y2;
            this.x2 = x2;
        }
    }
 
    static Tree construct(int x1, int y1, int x2, int y2) {
        if (x2 - x1 == 1 && y2 - y1 == 1)
            return new Tree(x1, y1, x2, y2);
 
        if (x2 - x1 < 1 && y2 - y1 < 1)
            return null;
 
        Tree n = new Tree(x1, y1, x2, y2);
 
        int xm = (x1 + x2) / 2;
        int ym = (y1 + y2) / 2;
        n.topLeft = construct(x1, y1, xm, ym);
        n.topRight = construct(xm, y1, x2, ym);
        n.botLeft = construct(x1, ym, xm, y2);
        n.botRight = construct(xm, ym, x2, y2);
        return n;
    }
 
    static void update(Tree n, int x1, int y1, int x2, int y2) {
        if (n == null)
            return;
        if (x1 <= n.x1 && n.x2 <= x2 && y1 <= n.y1 && n.y2 <= y2) {
            n.mask = !n.mask;
        } else if(x1>=n.x2||x2<=n.x1||y1>=n.y2||y2<=n.y1){
            return;
        }
        else {
            update(n.topLeft, x1, y1, x2, y2);
            update(n.topRight, x1, y1, x2, y2);
            update(n.botLeft, x1, y1, x2, y2);
            update(n.botRight, x1, y1, x2, y2);
        }
    }
 
    static boolean query(Tree n, int x, int y) {
        if (n.x2 - n.x1 == 1 && n.y2 - n.y1 == 1)
            return n.mask;
 
        int xm = (n.x1 + n.x2) / 2;
        int ym = (n.y1 + n.y2) / 2;
        if (x >= xm) {
            if (y >= ym) {
                return n.mask ^ query(n.botRight, x, y);
            } else {
                return n.mask ^ query(n.topRight, x, y);
            }
        } else {
            if (y >= ym) {
                return n.mask ^ query(n.botLeft, x, y);
            } else {
                return n.mask ^ query(n.topLeft, x, y);
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for (int test = 0; test < x; test++) {
            String[] tmp = br.readLine().split(" ");
            int n = Integer.parseInt(tmp[0]);
            int t = Integer.parseInt(tmp[1]);
            Tree root = construct(0, 0, n, n);
 
            for (int i = 0; i < t; i++) {
                tmp = br.readLine().split(" ");
                if (tmp[0].equals("Q")) {
                    int x1 = Integer.parseInt(tmp[1])-1;
                    int y = Integer.parseInt(tmp[2])-1;
                    if(query(root, x1, y))
                    System.out.println(1);
                    else
                        System.out.println(0);
                } else {
                    int x1 = Integer.parseInt(tmp[1])-1;
                    int y1 = Integer.parseInt(tmp[2])-1;
                    int x2 = Integer.parseInt(tmp[3]);
                    int y2 = Integer.parseInt(tmp[4]);
                    update(root, x1, y1, x2, y2);
                }
            }
            br.readLine();
        }
        br.close();
    }
 
}
