package Douwei;
import java.util.Scanner;
public class DrawingSnake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            int b = s.nextInt();
            String[][] c = new String[a + 2][a + 2];
            for (int i = 0; i < a + 2; i++) {
                for (int j = 0; j < a + 2; j++) {
                    c[i][j] = " ";
                }
            }
            for (int i = 0; i < a + 2; i++) {
                c[0][i] = "-";
                c[a + 1][i] = "-";
            }
            for (int i = 1; i <= a; i++) {
                c[i][0] = "|";
                c[i][a + 1] = "|";
            }
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            c[x1][y1] = "*";
            for (int i = 1; i < b; i++) {
                int x2 = s.nextInt();
                int y2 = s.nextInt();
                if (x1 > x2) {
                    for (int j = x2; j <= x1; j++) {
                        c[j][y2] = "*";
                    }
                } else {
                    for (int j = x1; j <= x2; j++) {
                        c[j][y2] = "*";
                    }
                }
                if (y1 > y2) {
                    for (int j = y2; j <= y1; j++) {
                        c[x2][j] = "*";
                    }
                } else {
                    for (int j = y1; j <= y2; j++) {
                        c[x2][j] = "*";
                    }
                }
            }
            for (int i = 0; i < a + 2; i++) {
                for (int j = 0; j < a + 2; j++) {
                    System.out.print(c[i][j]);
                }
                System.out.println();
            }
        }
        s.close();
    }
}
