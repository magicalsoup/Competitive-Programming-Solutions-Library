import java.util.Scanner;
public class slpr2p1 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int sections[] = new int[N], points[] = new int[N];
        for(int i=0; i<N; i++)
            sections[i] = sc.nextInt();
        for(int i=0; i<N; i++)
            points[i] = sc.nextInt();
        int score=0, unanswered=0;
        for(int i=0; i<N; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            unanswered += sections[i] -a;
            int answeredCorrectly = b*points[i];
            score += answeredCorrectly;
        }
        score += Math.min(10, unanswered)*2;
        System.out.println(score);
        sc.close();
    }
}
