import java.util.Scanner;
public class mccc19s1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        long maxScore=0;
        while(N-- > 0) {
            int r = sc.nextInt(), f = sc.nextInt(), w = sc.nextInt();
            maxScore = Math.max(maxScore, a*r+ b*f + c*w);
        }
        System.out.println(maxScore);
        sc.close();
    }
}
