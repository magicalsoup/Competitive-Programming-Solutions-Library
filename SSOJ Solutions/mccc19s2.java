import java.util.Scanner;
public class mccc19s2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char g[][] = new char[N][N];
        for(int i=0; i<N; i++) {
            String s = sc.next();
            for(int j=0; j<N; j++)
                g[i][j] = s.charAt(j);
        }
        int joon=0; // X
        int shon=0; // O

        joon = checkDiagonal(g, 'X') + checkHorizontal(g, 'X') + checkVertical(g,'X');
        shon = checkDiagonal(g, 'O') + checkHorizontal(g, 'O') + checkVertical(g, 'O');
        System.out.println(joon + " " + shon);
        String winner="";
        if(joon > shon) winner = "Joon";
        if(shon > joon) winner = "Shon";
        if(shon == joon) winner = "Tie";
        System.out.println(winner);

        sc.close();
    }
    static int checkDiagonal(char g[][], char mark) {
        int cnt=0;
        int r=0, c=0;
        boolean valid=true;
        for(int i=0; i<g.length; i++) {
            if(g[r][c] != mark) {
                valid=false;
                break;
            }
            r++; c++;
        }
        if(valid) cnt++;
        r=0; c=g.length-1;
        valid=true;
        for(int i=0; i<g.length; i++) {
            if(g[r][c] != mark) {
                valid=false;
                break;
            }
            r++; c--;
        }
        if(valid) cnt++;
        return cnt;
    }
    static int checkHorizontal(char g[][], char mark) {
        int cnt=0;
        for(int i=0; i<g.length; i++) {
            boolean valid=true;
            for(int j=0; j<g.length; j++) {
                if(g[i][j] != mark) {
                    valid=false;
                    break;
                }
            }
            if(valid)cnt++;
        }
        return cnt;
    }
    static int checkVertical(char g[][], char mark) {
        int cnt=0;
        for(int j=0; j<g.length; j++){
            boolean valid=true;
            for(int i=0; i<g.length; i++) {
                if(g[i][j] != mark) {
                    valid=false;
                    break;
                }
            }
            if(valid) cnt++;
        }
        return cnt;
    }
}
