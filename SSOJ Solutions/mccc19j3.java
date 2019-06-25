import java.util.Scanner;
public class mccc19j3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt();
        int maxX=0, maxY=0, minX=0x3f3f3f3f, minY=0x3f3f3f3f;
        for(int i=0; i<N; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            maxX = Math.max(maxX, x); minX = Math.min(minX, x);
            maxY = Math.max(maxY, y); minY = Math.min(minY, y);
        }
        int length = 2*(maxY-minY);
        int width= 2*(maxX-minX);
        int cost = (length+width)*C;
        System.out.println(cost);
        sc.close();
    }
}
