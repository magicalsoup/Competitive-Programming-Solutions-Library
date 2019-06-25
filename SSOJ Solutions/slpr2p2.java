import java.util.Scanner;
public class slpr2p2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String phrase[] = sc.nextLine().split(" ");
        double value= 3*find(phrase) / (double)(phrase.length);
        System.out.printf("%.2f\n", value);
        sc.close();
    }
    static int find(String S[]) {
        int cnt=0;
        for(int i=0; i<S.length-2; i++) {
            if(S[i].equals("dungeons") && S[i+1].equals("and")&& S[i+2].equals("dragons"))
                cnt++;
        }
        return cnt;
    }
}
